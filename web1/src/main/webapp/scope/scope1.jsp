<%@page import="member.dto.LoginDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%LoginDto loginDto=(LoginDto)session.getAttribute("loginDto"); %>
<%--
	jsp에서 제공하는 내장 객체들 중 page,result, session,application 객체들은 해당 객체에
	유효한 범위 안에서 필요한 객체(데이터)들을 저장하고 읽어 들임으로써 서로 공유할 수
	있는 특정한 영역을 가지고 있다.
	
	1) page: 현재 서비스 되고있는 페이지의 유효범위(얘도..안씀)
	2) request: request 유효 범위를 가짐
				form action에 써준 페이지, a href에 써준 페이지 
	3) session: session 유효 범위를 가짐
				HttpSession=>유지 시간만큼 유효범위가 있다.
				브라우저 열고 닫기 전까지 유효범위..
				로그인, 장바구니는 서버에 저장한다.
				
	4) application : 서버의 시작과 끝의 유효 범위를 가짐(얜 안씀..)
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>userid:<%=loginDto.getUserid() %></p>
	<p>password:<%=loginDto.getPassword() %></p>
<%-- <p>userid: <%=session.getAttribute("userid") %></p>
	<p>password: <%=session.getAttribute("password") %></p> --%>
</body>
</html>