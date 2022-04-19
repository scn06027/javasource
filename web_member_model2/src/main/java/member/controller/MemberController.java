package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.action.Action;
import member.action.ActionForward;
import member.action.MemberActionFactory;

@WebServlet("*.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); //모든걸 한글처리한다. 
		
		//requestUri확인작업
		String cmd=request.getRequestURI(); // delete.do
		
		//Action 생성=> BookActionfactory 이용
		MemberActionFactory baf=MemberActionFactory.getInstance();
		Action action=baf.action(cmd);
		
		//생성된 action에게 요청을 넘긴다..
		ActionForward af=null;
		try {
			af=action.execute(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//af=>path,이동방식..
		if(af.isRedirect()) {//true냐 false냐?판단해서 보내줌
			response.sendRedirect(af.getPath());
		}else {
			RequestDispatcher rd=request.getRequestDispatcher(af.getPath());
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
