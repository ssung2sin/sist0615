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
span.detail{
	cursor: pointer;
}
table.detail, div.updateform{
	margin: 30px;
}
div.detail{
	position: absolute;
	width: 700px;
	height: 700px;
	border: 1px solid gray;
	top:50px;
	left: 50px;
}
</style>
</head>
<body>
	<table class='detail'>
    <tr><td width='400' style='margin:20px;' id='dsubject'><h3></h3></td></tr>
    <tr><td id='dwriter'></td></tr>
    <tr><td style='color:gray'></td></tr>
    <tr><td><hr style='width:600px; border:2px solid gray; left:20px;'></td></tr>
    <tr><td><pre id='dstory'></pre></td></tr>
    <tr><td><img src='"+res.avata+"' width='60' id='davata'></td></tr>
    </table>
</body>
</html>