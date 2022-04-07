<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //자동완성기능 이용하세요~!
	Date date= new Date();
	out.print(sdf.format(date));
	
%>
<%=sdf.format(date) %>

<!--html 주석  -->
<%--jsp주석 --%>
</body>
</html>