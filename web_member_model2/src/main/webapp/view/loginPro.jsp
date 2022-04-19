<%@page import="member.dto.MemberDTO"%>
<%@page import="member.dao.MemberDAO"%>
<%@page import="member.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//값 받아오기
	String userid =request.getParameter("userid");
	String password=request.getParameter("current_password");
	//db연결
	Connection con=JdbcUtil.getConnection();
	MemberDAO dao=new MemberDAO(con);
	MemberDTO loginDto=dao.islogin(userid, password);
	JdbcUtil.close(con);
	//페이지 이동
	String path="loginForm.jsp";
	if(loginDto!=null){ //값이 null이다? 실패했다ㅑㅑㅑ
		path="/index.jsp"; //얜 아예 처음부터 밖에있는 index에다가 붙여줘라! (index.jsp 혼자 밖에 있음..그래서 가능한거임)
		session.setAttribute("loginDto", loginDto); //여기저기 왔다갔다 할때도 로그인이 되어있어야 하니까 session에다 값을 담아준다
		
	}/* else{
		//로그인 실패
		path="loginForm.jsp"; //그 폴더에있는 뒤에 따라봍는 jsp모양만 바꾸고..
	} */
	
	response.sendRedirect(path); //아무것도 안 담거나 세션에 뭘 담을때           ㅠㅠㅠㅠ
%>