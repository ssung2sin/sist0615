<%@page import="java.text.SimpleDateFormat"%>
<%@page import="myschool.model.MyschoolDto"%>
<%@page import="myschool.model.MyschoolDao"%>
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
	.detail{
		position: absolute;
		margin: 50px 50px;
		border: 2px solid black;
		width: 700px;
		height: 620px;
	}
	table.info{
		position: absolute;
		top: 30px;
		left: 170px;
	
	}
	img.image{
		position: absolute;
		top: 30px;
		left: 20px;
		border: 1px solid gray;
		width: 125px;
		height: 160px;
	}
	table.subject{
		position: absolute;
		top: 200px;
		left: 20px;
	}

</style>
</head>
<%
	String num=request.getParameter("num");
	MyschoolDao dao=new MyschoolDao();
	
	MyschoolDto dto_school=dao.getDataNum(num);
	MyschoolDto dto_subject=dao.getSubject(num);
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

%>
<body>
<div class="detail">
	<form action="updateAction">
	<img class="image" src="">
		<table class="table table-bordered info" style="width: 500px;">
			<tr>
				<th width="100" style="background-color: #E2E2E2;">이름</th>
				<td><%=dto_school.getMyname()%></td>
				<th width="100" style="background-color: #E2E2E2;">아이디</th>
				<td><%=dto_school.getMyid()%></td>
			</tr>
			<tr>
				<th style="background-color: #E2E2E2;">휴대폰번호</th>
				<td width="150"><%=dto_school.getMyhp()%></td>
				<th style="background-color: #E2E2E2;">생일</th>
				<td><%-- <%=sdf.format(dto_school.getMybirthday())%> --%></td>
			</tr>
			<tr>
				<th style="background-color: #E2E2E2;">주소</th>
				<td colspan="3" width="150"><%=dto_school.getMyaddr()%></td>	
			</tr>
			<tr>
				<th width="100" style="background-color: #E2E2E2;">학년</th>
				<td><%=dto_school.getMygrade()%></td>
				<th width="100" style="background-color: #E2E2E2;">반</th>
				<td><%=dto_school.getMyclass()%></td>
			</tr>
		</table>
		<table class="table table-bordered subject" style="width: 650px;">
			<tr align="center">
				<th width="100" style="background-color: #E2E2E2;">과목</th>
				<th width="100" style="background-color: #E2E2E2;">점수</th>
				<th width="100" style="background-color: #E2E2E2;">반평균</th>
				<th width="100" style="background-color: #E2E2E2;">석차</th>
			</tr>
			<tr align="center">
				<td>국어</td>
			</tr>
			<tr align="center">
				<td>영어</td>
			</tr>
			<tr align="center">
				<td>수학</td>
			</tr>
			<tr align="center">
				<td>사회</td>
			</tr>
			<tr align="center">
				<td>과학</td>
			</tr>
			<tr align="center">
				<td>음악</td>
			</tr>
			<tr align="center">
				<td>미술</td>
			</tr>
			<tr align="center">
				<td>체육</td>
			</tr>
			<tr align="center">
				<th width="100" style="background-color: #E2E2E2;">모든과목평균</th>
				<td></td>
				<th width="100" style="background-color: #E2E2E2;">학년등수</th>
				<td></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>