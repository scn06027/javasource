<%@page import="member.dto.MemberDTO"%>
<%@page import="member.dao.MemberDAO"%>
<%@page import="member.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String path="";
	//modifyForm에서 넘긴 값 가져오기
	String current_pw=request.getParameter("current_password");
	String new_pw=request.getParameter("new_password");
	String confirm_pw=request.getParameter("confirm_password");
	//userid,비밀번호가 일치할때(isLogin 이용하기)
	//이때 null이 아닌게 넘어오면 비밀번호 변경(changePassword) 사용하면된다                                              mmmmmmmmmmmmmmmm
	//세션에 담긴 로그인 정보 가져오기
	MemberDTO loginDto=(MemberDTO)session.getAttribute("loginDto");//얜 원래 무슨상태였는데? 세션상태??
	String userid=loginDto.getUserid();
	//db작업
	Connection con=JdbcUtil.getConnection();
	MemberDAO dao=new MemberDAO(con);
	if(dao.islogin(loginDto.getUserid(), current_pw)==null){
		out.print("<script>");
		out.print("alert('현재 비밀번호를 확인해주세요.');");
		out.print("history.back();");
		out.print("</script>");
	}else{
		//새 비번과 확인이 같은값인지 확인
		if(new_pw.equals(confirm_pw)){
		//비밀번호변경(changePassword)
		boolean result=	dao.changePassword(userid, confirm_pw);
	//세션해제
	//페이지이동
	//성공-loginForm 실패-modifyForm	
  	if(result){
  		JdbcUtil.commit(con);
  		session.invalidate();
		path="loginForm.jsp";
		
	}else{
		JdbcUtil.rollback(con);
		path="modifyForm.jsp";
			}  
		}else{
			path="modifyForm.jsp";
		}
	
	JdbcUtil.close(con);
	response.sendRedirect(path);
	}
	
%>