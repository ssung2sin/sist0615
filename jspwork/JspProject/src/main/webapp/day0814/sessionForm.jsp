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
	session.setAttribute("msg", "happy");
	session.setMaxInactiveInterval(10);

%>
<h2>10초안에 반드시 눌러주세요!!</h2>
<form action="sessionAction.jsp" method="post">
	<h2>가고싶은 여행지</h2>
	<input type="radio" value="베트남 9박10일" name="country" checked>베트남 9박10일&nbsp;
	<input type="radio" value="일본 5박6일" name="country">일본 5박6일&nbsp;
	<input type="radio" value="유럽 4박5일" name="country">유럽 4박5일&nbsp;
	<input type="radio" value="미국 3박4일" name="country">미국 3박4일&nbsp;
	<input value="여행신청" type="submit">
</form>
</body>
</html>