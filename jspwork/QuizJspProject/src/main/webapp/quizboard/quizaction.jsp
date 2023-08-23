<%@page import="db.quizboard.QuizBoardDao"%>
<%@page import="db.quizboard.QuizBoardDto"%>
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
request.setCharacterEncoding("utf-8");

ServletContext context=getServletContext();
String realFolder=context.getRealPath("/upload");

System.out.println(realFolder);

int filesize=1024*1024*5; //5mb

MultipartRequest multi=null;

try{
	multi=new MultipartRequest(request,realFolder,filesize,"utf-8",
		new DefaultFileRenamePolicy());
	
	QuizBoardDto dto=new QuizBoardDto();
	dto.setWriter(multi.getParameter("writer"));
	dto.setTitle(multi.getParameter("title"));
	dto.setContent(multi.getParameter("content"));	
	String photo=multi.getFilesystemName("imgname");
	
	if(photo==null){
		dto.setImgname("../image/noimage.png");
	}
	else{
		dto.setImgname("../upload/"+photo);
	}
	
	QuizBoardDao dao=new QuizBoardDao();
	
	dao.insertQuiz(dto);
	
	response.sendRedirect("quizlist.jsp");
	
}catch(Exception e){
	System.out.println("업로드 오류: "+e.getMessage());
}
%>
</body>
</html>