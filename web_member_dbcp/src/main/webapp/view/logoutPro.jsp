<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//로그아웃=> 세션 해제
	//		removeAttribute("이름") ->이건 이름이라는 세션만 날리는거고 / invalidate() ->이건 장바구니,이름,걍 모든 세션을 다 날려버림
	session.removeAttribute("loginDto"); //이건 loginDto라는 세션을 날리는거구나
	//페이지 이동:loginFrom.jsp
	response.sendRedirect("loginForm.jsp");
%>