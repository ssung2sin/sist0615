<%@page import="java.text.SimpleDateFormat"%>
<%@page import="member.model.MemberDto"%>
<%@page import="member.model.MemberDao"%>
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
	MemberDao dao=new MemberDao();
	
	String name=dao.returnName(id);
	System.out.println(name);
	MemberDto dto=dao.getDataId(id);
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
%>
<br><br><br>
<h2 style="color: gray; font-family: 'Nanum Pen Script';"><%=name %>님 환영합니다!</h2>
<table class="table table-bordered" style="width: 250px;">
	<tr>
		<th width="70">ID</th>
		<td><%=dto.getId() %></td>
	</tr>
	<tr>
		<th width="70">이름</th>
		<td><%=dto.getName() %>
		<img src="<%=dto.getImage()%>" style="width: 80px;"></td>
	</tr>
	<tr>
		<th width="70">가입일</th>
		<td><%=sdf.format(dto.getDate()) %></td>
	</tr>
</table>
<br><br>
<input type="button" value="로그아웃" class="btn btn-danger"
onclick="location.href='logoutAction.jsp'">
<button type="button" class="btn btn-outline-info"
onclick="location.href='../member/memberList.jsp'">회원목록으로</button>
</body>
</html>