package pattern.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pattern.service.LoginService;

public class LoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LoginAction");
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
	
		//db작업 service라는 클래스를 써서 일을 시킬거다
		LoginService service=new LoginService();
		//String path="";
		if(service.login(userid, password)){
			//path="index.jsp";
			
			
		}else {
			//페이지이동
			
			//path="loginForm.jsp";
			
		}
		//각 액션에서 일이 끝난후 path, 어떤방식으로 움직일것인지 리턴 (forward or sendRedirect)
		return new ActionForward("path",true);
		
	}

}
