<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%> 
<!DOCTYPE html>
<!-- 에러뜨면 error.jsp가 처리해줄거야 ㅇㅇ -->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int a=1, b=0;
%>
<p>a와 b의 사칙연산</p>
<p>a + b = <%=a+b %></p>
<p>a - b = <%=a-b %></p>
<p>a * b = <%=a*b %></p>
<p>a / b = <%=a/b %></p>

</body>
</html>