<%@page import="model.intro.introDto"%>
<%@page import="model.intro.introDao"%>
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
		left: 600px;
		top: 250px;
		font-family: "Dongle";
		font-size: 40px;
	}
</style>
</head>
<%
	String num=request.getParameter("num");
	introDao dao=new introDao();
	introDto dto=dao.getData(num);
%>
<body>
	<div id="result">
		<table class="table table-bordered" style="width: 300px;">
			<tr>
				<th align="center"><b>이름</b></th>
				<td align="center"><%=dto.getIntro_name() %></td>
			</tr>
			<tr>
				<th align="center"><b>혈액형</b></th>
				<td align="center"><%=dto.getIntro_blood() %></td>
			</tr>
			<tr>
				<th align="center"><b>전화번호</b></th>
				<td align="center"><%=dto.getIntro_hp() %></td>
			</tr>
			<tr>
				<th align="center"><b>사는지역</b></th>
				<td align="center"><%=dto.getIntro_city() %></td>
			</tr>
		</table>
	</div>
</body>
</html>