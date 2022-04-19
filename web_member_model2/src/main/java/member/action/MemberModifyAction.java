package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.AllArgsConstructor;
import member.dto.MemberDTO;
import member.service.MemberLoginService;
import member.service.MemberModifyService;
@AllArgsConstructor
public class MemberModifyAction implements Action {
	private String path;
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String current_pw=request.getParameter("current_password");
		String new_pw=request.getParameter("new_password");
		String confirm_pw=request.getParameter("confirm_password");
		
		HttpSession session=request.getSession();
		MemberDTO loginDto=(MemberDTO) session.getAttribute("loginDto");
		String userid=loginDto.getUserid();
		
		MemberLoginService loginService=new MemberLoginService();
		if(loginService.login(userid,current_pw)!=null) { //현재 비번이 일치하면
			
			MemberModifyService service=new MemberModifyService();
		
		
			if(new_pw.equals(confirm_pw)) {//두개의 비번이 같은지 확인
				if(!service.change(userid, confirm_pw)) {//변경실패
			path="/view/modifyForm.jsp";}
				
				}else { //비밀번호 변경 성공! 세션을 날려버린다.
					session.invalidate();
				}
		}else {
			path="/view/modifyForm.jsp"; //현재 비밀번호가 일치하지 않음
		}
		
		//service
		
		
		return new ActionForward(path,true);
	}

}
