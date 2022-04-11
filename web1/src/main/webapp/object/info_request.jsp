<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//info.jsp.에서 사용자가 넘긴 값을 가져온다
	//String 형태로 값이 넘어온다. form 안에 들어있는것들은 다 그럼
	
	request.setCharacterEncoding("utf-8");
	
	
	String userid=request.getParameter("userid");
	String password=request.getParameter("password");
	String job=request.getParameter("job");
	String favorite[]=request.getParameterValues("favorite");
	String gender=request.getParameter("gender");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>
	userid: <%=userid%>
</p>
<p>
	password: <%=password%>
</p>
<p>
	job: <%=job%>
</p>
<p>
	favorite: <%=Arrays.toString(favorite)%>
</p>
<p>
	gender: <%=gender%>
</p>

</body>
</html>