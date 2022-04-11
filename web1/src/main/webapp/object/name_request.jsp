<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--

form method='get'으로 하면 한글 그대로 나옴(인코딩이 자동으로 옮겨가기 때문에)
			'post'로 하면 한글 깨져서 나옴 (직접 인코딩 처리)
	jsp 내장객체
	1) HttpServletRequest request: 이 객체의 목적: 사용자의 요청을 가져올 수 있음
	
 --%>
 <%
 	// request.getParameter(: 폼 안에 들어있는 정보들 가져오기)
 	//?num=1&age=10 :get으로 넘어오는 정보들 가져오기
 	//.setCharacterEncoding("utf-8"): 인코딩
 	request.setCharacterEncoding("utf-8");
 	String name=request.getParameter("username");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%=name %></h3>
</body>
</html>