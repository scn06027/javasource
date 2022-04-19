package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.AllArgsConstructor;
import member.controller.MemberController;
import member.service.CheckIdService;
@AllArgsConstructor
public class CheckIDAction implements Action {
	private String path;
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String userid=request.getParameter("userid");
		CheckIdService service=new CheckIdService();
		
		String result="";
		//중복이라면 false, undefiend, null=> 
		if(service.dupId(userid)) {
			result="true";
		}else {
			result="false";
		}
		
		request.setAttribute("dupId", result);
		return new ActionForward(path,false);
	}

}
