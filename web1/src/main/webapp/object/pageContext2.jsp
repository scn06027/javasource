<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%--
   jsp페이지 include 두가지 방법
   1) include 지시어 사용
   	-main.jsp를 참고한다
   	-컴파일 시점에 페이지를 합친다
   2) PageContext 객체의 include 이용
    -실행할 때 페이지를 합친다
    -
    
    --%>
    <%pageContext.include("../header.jsp"); %>
<main>
	<h1>pageContext2 페이지</h1>
</main>
<%pageContext.include("../footer.jsp"); %>