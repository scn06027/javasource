<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//모든 세션을 제거한다
	session.invalidate();
	//원래 있던 곳으로 돌아가자
	response.sendRedirect("sessionTest1.jsp");
%>