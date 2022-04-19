<%@page import="member.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@page import="member.dao.MemberDAO"%>
<%@page import="member.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//leaveform에서보낸값가져오기
	String password=request.getParameter("current_password");
	String userid=request.getParameter("userid");
	
/* 	MemberDTO loginDto=(MemberDTO)session.getAttribute("loginDto");//얜 원래 무슨상태였는데? 세션상태??
	String userid=loginDto.getUserid(); */

	//db작업
	Connection con=JdbcUtil.getConnection();
	MemberDAO dao=new MemberDAO(con);
	boolean result=	dao.leave(userid,password);
	
	String path="";
	
		//탈퇴성공 - 세션해제
		//페이지이동 성공하면 index 실패하면 leaveform
	
	if(result){
		JdbcUtil.commit(con);
		session.invalidate();
		path="/index.jsp";
	}else{
		JdbcUtil.rollback(con);
		path="leaveForm.jsp";
	}
	JdbcUtil.close(con);
	response.sendRedirect(path);
		
	
	
%>