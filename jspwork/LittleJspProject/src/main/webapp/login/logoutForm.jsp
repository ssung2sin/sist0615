<%@page import="myschool.model.MyschoolDto"%>
<%@page import="myschool.model.MyschoolDao"%>
<%@page import="java.text.SimpleDateFormat"%>
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
<style>
	th{
	font-family: "Gaegu";
	font-size: 18px;
	text-align: center;
	}
</style>
</head>
<body>
<%
	String id=(String)session.getAttribute("idok");
	System.out.println(id);
	MyschoolDao dao=new MyschoolDao();
	
	String name=dao.getName(id);
	System.out.println(name);
	MyschoolDto dto=dao.getData(id);
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
%>
<br><br><br>
<h2 style="color: gray; font-family: 'Nanum Pen Script';"><%=name %>님 환영합니다!</h2>
<table class="table table-bordered" style="width: 250px;">
	<tr>

	</tr>
</table>
<br><br>
<input type="button" value="로그아웃" class="btn btn-danger"
onclick="location.href='logoutAction.jsp'">
<button type="button" class="btn btn-outline-info"
onclick="location.href='../member/memberList.jsp'">회원목록으로</button>
</body>
</html>