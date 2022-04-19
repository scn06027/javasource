<%@page import="book.dto.bookDTO"%>
<%@page import="java.util.List"%>
<%@page import="book.dao.bookDAO"%>
<%@page import="java.sql.Connection"%>
<%@page import="book.dao.JdbcUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//도서 목록 전체 조회 후 화면이동
	
	//db작업
	Connection con=JdbcUtil.getConnection();
	bookDAO dao=new bookDAO(con);
	List<bookDTO> list=dao.getList();
	//페이지 이동
	request.setAttribute("list", list);
	pageContext.forward("list.jsp");
%>