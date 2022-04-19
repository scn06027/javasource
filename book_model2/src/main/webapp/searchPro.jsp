<%@page import="book.dto.bookDTO"%>
<%@page import="java.util.List"%>
<%@page import="book.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@page import="book.dao.bookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	request.setCharacterEncoding("utf-8");
	//search.jsp 에서 넘긴 값 가져오기
	String criteria=request.getParameter("criteria");
	String keyword=request.getParameter("keyword");
	//db 이동
	Connection con=JdbcUtil.getConnection();
	bookDAO dao=new bookDAO(con);
	List<bookDTO> list=dao.search(criteria,keyword);
	
	//페이지 이동
	//list.jsp 로 이동?
	request.setAttribute("list", list);
	pageContext.forward("list.jsp");
%>