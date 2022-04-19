package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.AllArgsConstructor;
import member.dto.MemberDTO;
import member.service.MemberJoinService;
import member.service.MemberLeaveService;
@AllArgsConstructor
public class MemberJoinAction implements Action {
	private String path;
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		MemberDTO dto=new MemberDTO();
	
		dto.setUserid(request.getParameter("userid"));
		dto.setPassword(request.getParameter("password"));
		dto.setName(request.getParameter("name"));
		dto.setGender(request.getParameter("gender"));
		dto.setEmail(request.getParameter("email"));
		
		String confirmPassword=request.getParameter("confirm_password");
		
		MemberJoinService service=new MemberJoinService();
		if(confirmPassword.equals(dto.getPassword())) {
			
			if(!service.join(dto)) {
			path="/joinForm.jsp";
		}
			
		}
		
		return new ActionForward(path, true);
	}

}
