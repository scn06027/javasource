<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@page import="book.dao.bookDAO"%>
<%@page import="book.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@page import="book.dto.bookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//한글처리
	request.setCharacterEncoding("utf-8");
	//insert.jsp에서 넘어오는 값 가져오고
	bookDTO dto=new bookDTO();
	dto.setCode(Integer.parseInt(request.getParameter("code")));
	dto.setTitle(request.getParameter("title"));
	dto.setWriter(request.getParameter("writer"));
	dto.setPrice(Integer.parseInt(request.getParameter("price")));
	//db작업하고
	Connection con=JdbcUtil.getConnection();
	bookDAO dao=new bookDAO(con);
	boolean result=dao.insert(dto);
	//page 이동해라
	String path="";
	if(result){
		JdbcUtil.commit(con);
		path="listPro.jsp";
	}else{
		JdbcUtil.rollback(con);
		path="insert.jsp";
	}
	JdbcUtil.close(con);
	response.sendRedirect(path);
	
%>