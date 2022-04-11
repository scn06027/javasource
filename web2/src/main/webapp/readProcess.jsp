<%@page import="web2.dto.MemberDTO"%>
<%@page import="web2.dao.MemberDAO"%>
<%@page import="web2.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//list.jsp에서 넘긴 값 가져오기
	int id=Integer.parseInt(request.getParameter("id"));
	
	//db작업
	Connection con=JdbcUtil.getConnection();
	MemberDAO dao=new MemberDAO(con);
	MemberDTO dto=dao.getRow(id);
	
	//request 영역에 결과 값 담기
	request.setAttribute("dto",dto);
	//페이지 이동: sendRedirect(): scope에 값을 담지 않았거나, session에 값을 담는 경우
	//forward: request.setAttribute()하면 무조건 forward 방식으로 이동한다
	pageContext.forward("read.jsp");
	
%>