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
//1~100까지 합계를 구한 뒤 출력하자~
int sum=0;
for(int i=0;i<101;i++)
	sum+=i;
out.print("<h3>1~100까지 합계는 "+sum+"<h3>");
%>

</body>
</html>