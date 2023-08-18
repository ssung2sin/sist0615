<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="member.model.MemberDao"%>
<%@page import="member.model.MemberDto"%>
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
	String realPath=getServletContext().getRealPath("/upload");
	System.out.println(realPath);
	int uploadSize=1024*1024*10;
	
	MultipartRequest multi=null;
	
	multi=new MultipartRequest(request,realPath,uploadSize,"utf-8",
			new DefaultFileRenamePolicy());
	
	MemberDto dto=new MemberDto();
	dto.setId(multi.getParameter("id"));
	dto.setPass(multi.getParameter("pass"));
	dto.setName(multi.getParameter("name"));
	dto.setHp(multi.getParameter("hp"));
	
	String photo=multi.getFilesystemName("picture");
	if(photo==null){
		dto.setImage("../image/noimage.png");
	}
	else{
		dto.setImage("../upload/"+photo);
	}
	
	MemberDao dao=new MemberDao();
	
	//db에 insert
	dao.insertMember(dto);
	
	//성공후 이동
	response.sendRedirect("memberList.jsp");

%>
</body>
</html>