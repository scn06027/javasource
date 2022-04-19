<%@page import="member.dao.MemberDAO"%>
<%@page import="member.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@page import="member.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	//joinForm.jsp 넘긴값 가져오기
	
	MemberDTO dto=new MemberDTO();
	
	String pw=request.getParameter("password");
	String confirm_pw=request.getParameter("confirm_password");
	
	dto.setUserid(request.getParameter("userid"));
	dto.setPassword(request.getParameter("password"));
	dto.setName(request.getParameter("name"));
	dto.setGender(request.getParameter("gender"));
	dto.setEmail(request.getParameter("email"));
	
	//db 작업(register만들기)
	Connection con=JdbcUtil.getConnection();
	MemberDAO dao=new MemberDAO(con);
	boolean result=dao.register(dto);
	
	
	//페이지이동: 성공하면 loginform 실패하면 joinform

	String path="";
	if(pw.equals(confirm_pw)){
		if(result){
		JdbcUtil.commit(con);
		path="loginForm.jsp";
	}else{
		JdbcUtil.rollback(con);
		path="joinForm.jsp";
	}
	}
	
	JdbcUtil.close(con);
	response.sendRedirect(path);
%>