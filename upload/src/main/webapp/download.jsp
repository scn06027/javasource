<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//dowbload
	//사용자가 다운로드를 요청한 파일명 가져오기
	String fileName=request.getParameter("fileName");
	
	
	
	//서버폴더에 가서 해당 파일을 가져온다
	FileInputStream fis=new FileInputStream("C:\\개발자과정\\upload\\"+fileName);
	BufferedInputStream bis=new BufferedInputStream(fis);
	//브라우저에 파일 붙여서 보내기
	response.setContentType("application/octet-stream");//이런 타입을 보낼거야~ mime 이라는 타입이 있다 .
	//Content-Disposition : inline => 웹페이지 안에서 보여주기
	//Content-Disposition : attachment=> 반드시 다운로드 할거다
	//Content-Disposition : attachment;filename=1.jpg =>filename 이름값을 이용해 다운로드
	//파일작성.txt=>공백이 파일명에 있으면 인코딩 시킬때+ 변경이 일어남(공백상태로 처리)
	fileName = URLEncoder.encode(fileName,"utf-8").replaceAll("\\+","%20");
	
	// 이 응답을 위해 getOutputStream()이 이미 호출되었습니다.]을(를) 발생시켰습니다.
	out.clear();
	out=pageContext.pushBody();
	
	
	String subFileName=fileName.substring(fileName.indexOf("_")+1);
	response.setHeader("Content-Disposition","attachment;filename="+subFileName);
	BufferedOutputStream bos=new BufferedOutputStream(response.getOutputStream());
	
	int numRead=0;
	byte[] b=new byte[4096];
	while((numRead=bis.read(b,0,b.length))!=-1){
		bos.write(b,0,numRead);
	}
	bos.flush();
	bos.close();
	bis.close();
	
%>