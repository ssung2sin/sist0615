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
	<h2>다른 폴더의 파일 inclode하기</h2>
	<h4>구구단 가져오기</h4>
	<jsp:include page="./guguWrite.jsp"/>
	<hr>
	<h4>퀴즈 이미지 가져오기</h4>
	<jsp:include page="./quizArrImage.jsp"/>
	
	<h3>현재 파일 종료!!!</h3>
</body>
</html>