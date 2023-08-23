<%@page import="data.dto.MemberDao"%>
<%@page import="data.dto.MemberDto"%>
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

	//데이타 읽어서 dto에 넣기
	MemberDto dto=new MemberDto();
	
	String id=request.getParameter("id");
	String pass=request.getParameter("pass");
	String name=request.getParameter("name");
	String hp=request.getParameter("hp");
	String addr=request.getParameter("addr");
	String email=request.getParameter("email1")+"@"+request.getParameter("email2");
	
	dto.setId(id);	
	dto.setPass(pass);
	dto.setName(name);
	dto.setHp(hp);
	dto.setAddr(addr);
	dto.setEmail(email);
	
	MemberDao dao=new MemberDao();
	
	dao.insertMember(dto);
	
	//gaipsuccess page로 이동
	response.sendRedirect("../index.jsp?main=member/gaipsuccess.jsp?id="+id);
%>
</body>
</html>