<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%--


	jsp 내장객체
	1) HttpServletRequest request: 이 객체의 목적: 사용자의 요청을 가져올 수 있음
	2) HttpServletResponse response: 사용자에게 응답!
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Response</h1>
<%
	//페이지를 이동
	//response.sendRedirect("num.jsp");
response.sendRedirect("http://naver.com");
%>
</body>
</html>