<%@page import="db.simpleguest.SimpleGuestDao"%>
<%@page import="db.simpleguest.SimpleGuestDto"%>
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
	<%-- <%
	request.setCharacterEncoding("utf-8");	

	String nick=request.getParameter("nick");
	String pass=request.getParameter("pass");
	String image=request.getParameter("image");
	String story=request.getParameter("story");
	
	SimpleGuestDto dto=new SimpleGuestDto();
	SimpleGuestDao dao=new SimpleGuestDao();
	
	dto.setNick(nick);
	dto.setPass(pass);
	dto.setImage(image);
	dto.setStory(story);
	
	dao.insertGuest(dto);
	
	response.sendRedirect("insertForm.jsp");
%> --%>

	<%
		request.setCharacterEncoding("utf-8");
	%>

	<!-- 자바빈즈로 변경하려면?
	useBean은 new로 객체를 생성하는 것과 같다 -->
	<jsp:useBean id="dao" class="db.simpleguest.SimpleGuestDao"/>
	<jsp:useBean id="dto" class="db.simpleguest.SimpleGuestDto"/>
	
	<jsp:setProperty property="*" name="dto"/>
	
	<%
	dao.insertGuest(dto);
	response.sendRedirect("insertForm.jsp");
	%>
</body>
</html>