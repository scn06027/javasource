<%@page import="book.dao.bookDAO"%>
<%@page import="book.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//delete.jsp에서 넘기 값 가져오기 - 코드 값 하나 가져오기
	int code=Integer.parseInt(request.getParameter("code"));
	//db작업
	Connection con=JdbcUtil.getConnection();
	bookDAO dao=new bookDAO(con);
	boolean result=dao.delete(code);
	
	//페이지 이동
	String path="";
	
	if(result){
	//성공하면 listPro.jsp
		JdbcUtil.commit(con);
		path="listPro.jsp";
	}else{
	//실패시 delete.jsp
		JdbcUtil.rollback(con);
		path="delete.jsp";
	}
	
	response.sendRedirect(path);
	JdbcUtil.close(con);

%>