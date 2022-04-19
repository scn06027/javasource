<%@page import="book.dao.bookDAO"%>
<%@page import="book.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//update 넘긴 값 가져오기
	int code=Integer.parseInt(request.getParameter("code"));
	int price=Integer.parseInt(request.getParameter("price"));
	//db 작업
	Connection con=JdbcUtil.getConnection();
	bookDAO dao=new bookDAO(con);
	boolean result=dao.update(code, price);
	//페이지이동
	String path="";
	//성공하면 listPro, 실패하면 update
	if(result){
		JdbcUtil.commit(con);
		path="listPro.jsp";
	}else{
		JdbcUtil.rollback(con);
		path="update.jsp";
	}
	response.sendRedirect(path);
	JdbcUtil.close(con);
%>