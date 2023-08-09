<%@page import="model.mymall.MallDto"%>
<%@page import="model.mymall.MallDao"%>
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
<style type="text/css">
	#result{
		position: absolute;
		width: 300px;
		height: 400px;
		left: 100px;
		top: 50px;
		border: 3px solid gray;
		border-radius: 20px;
	}
	#text{
		position: absolute;
		left: 500px;
		top: 50px;
		font-family: "Dongle";
		font-size: 20px;
	}
</style>
</head>
<%
	String no=request.getParameter("no");
	MallDao dao=new MallDao();
	MallDto dto=dao.getData(no);
%>
<body>
<img alt="" src="<%=dto.getPhoto()%>" id="result" style="width: 300px;">
<div id="text">
	<h4>상품명 : <%=dto.getSangpum() %></h4>
	<br><br><br><br>
	<h4>가격 : <%=dto.getPrice() %></h4>
	<br><br><br><br>
	<h4>입고일 : <%=dto.getIpgoday() %></h4>
	<br><br><br><br>

</div>
</body>
</html>