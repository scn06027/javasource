<%@page import="web2.dto.MemberDTO"%>
<%@page import="web2.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@page import="web2.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	//한글처리
	request.setCharacterEncoding("utf-8");
	//폼에서 입력값 가져오기
	
	
	String name=request.getParameter("name");
	String addr=request.getParameter("addr");
	String email=request.getParameter("email");
	int age=Integer.parseInt(request.getParameter("age"));
	
	MemberDTO insertDto=new MemberDTO(age,name,addr,email);
	//db작업
	Connection con=JdbcUtil.getConnection();
	MemberDAO dao=new MemberDAO(con);
	
	String path="";
	if(dao.insert(insertDto)){
	//페이지 이동=>전체 리스트 보옂귀
		path="/list.jsp";
	//커밋
	JdbcUtil.commit(con);
	
	}else{
		response.sendRedirect("/insert.jsp");
		path="/insert.jsp";
		//롤백
		JdbcUtil.rollback(con);
	}
	JdbcUtil.close(con);
	//이 다음에 코드가 나오면 안됨
	//이 밑으로 바로 다음 화면으로 넘어가버리니까 위에서 끝내줘라
	response.sendRedirect(path);
%>
