<%@page import="data.dto.MemberDao"%>
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
	String id=request.getParameter("id");

	MemberDao dao=new MemberDao();
	
	String name=dao.getName(id);
%>

<div style="margin: 200px 200px;">
	<img src="image/cat123.gif"><br>
	<b><%=name %>님 회원가입 ㅊㅋ</b>
	<br><br>
	<button type="button" class="btn btn-info"
	onclick="location.href='index.jsp?main=login/loginmain.jsp'">로그인</button>
</div>
</body>
</html>