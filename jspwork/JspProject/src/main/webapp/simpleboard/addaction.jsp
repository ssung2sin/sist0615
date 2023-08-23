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
request.setCharacterEncoding("utf-8");
%>
<!-- useBean은 new로 생성하는 것과 같아 id는 변수명이 된다.  -->
<jsp:useBean id="dao" class="db.simpleboard.SimpleBoardDao"/>
<jsp:useBean id="dto" class="db.simpleboard.SimpleBoardDto"/>

<!-- dto의 멤버랑 같은 이름의 폼태그는 자동으로 읽어서 dto에 넣어준다.  -->
<jsp:setProperty property="*" name="dto"/>

<%
	//db에 insert
	dao.insertBoard(dto);

	//목록으로 이동
	//response.sendRedirect("boardlist.jsp");
	
	//내용보기로 이동하려면?
	int num=dao.getMaxNum(); //방금 insert된 num값을 알아야 하기 때문에
	response.sendRedirect("boardlist.jsp");
%>
</body>
</html>