<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle:wght@300&family=Gaegu:wght@300&family=Nanum+Pen+Script&family=Sunflower:wght@300&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
<%
	//톰캣에 업로드된 프로젝트 경로 구하기
	ServletContext context=getServletContext();
	//프로젝트의 upload의 실제경로 구하기
	String realFolder=context.getRealPath("/upload");
	
	System.out.println(realFolder);
	
	//업로드시 허용되는 크기지정
	int uploadSize=1024*1024*5;
	
	MultipartRequest multi=null;
	
	try{
	multi=new MultipartRequest(request,realFolder,uploadSize,"utf-8",
			new DefaultFileRenamePolicy());
	
	//입력된 값들 가져오기
	String nick=multi.getParameter("nick");
	%>
	<h2>작성자명: <%=nick %></h2>
	
	<%
	//파일타입이 여러개인 경우
	Enumeration forNames=multi.getFileNames();//filetype만 얻어옴
	
	while(forNames.hasMoreElements()){
		String fileName=(String)forNames.nextElement();
		System.out.println("file type의 name: "+fileName);
		
		//실제 업로드 된 파일 명 얻어보기
		String uploadName=multi.getFilesystemName(fileName);
		
		//파일 선택안하면 null
		if(uploadName!=null){
			%>
			<img alt="" src="../upload/<%=uploadName%>" style="max-width: 200px;" border="1px soild gray">
			<figcaption><b><%=uploadName %></b></figcaption>
			
		<%}
	}
	%>
	
	<%}catch(Exception e){
		
	}
%>
</body>
</html>