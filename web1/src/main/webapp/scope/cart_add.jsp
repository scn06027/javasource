<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//장바구니 담기(세션 이용)
	//session.setAttribute("product", request.getParameter("product"));
	
	//사용자 선택 값 가져오기
	String product=request.getParameter("product");
	//장바구니 세션이 있는가? 확인
	ArrayList<String> productList= (ArrayList<String>)session.getAttribute("productList");
	
	if(productList==null){
		productList=new ArrayList<>(); //이게 원래 없었다는 뜻이니까 새로 만들어줘!
		productList.add(product);
		session.setAttribute("productList", productList);
	}else{
		productList.add(product);
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>제품 추가</h3>
<p><a href="cart_basket.jsp">장바구니 보기</a></p>
</body>
</html>