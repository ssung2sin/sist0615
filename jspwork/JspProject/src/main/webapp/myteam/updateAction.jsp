<%@page import="model.myteam.TeamDao"%>
<%@page import="model.myteam.TeamDto"%>
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
	String num=request.getParameter("num");
	String name=request.getParameter("name");
	String driver=request.getParameter("driver");
	String addr=request.getParameter("addr");
	
	TeamDto dto=new TeamDto();
	dto.setNum(num);
	dto.setName(name);
	dto.setDriver(driver==null?"없음":"있음");
	dto.setAddr(addr);
	
	TeamDao dao=new TeamDao();
	dao.updateTeam(dto);
	
	response.sendRedirect("list.jsp");
%>
</body>
</html>