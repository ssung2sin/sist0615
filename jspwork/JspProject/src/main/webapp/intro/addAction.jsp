<%@page import="model.intro.introDao"%>
<%@page import="model.intro.introDto"%>
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
	//한글엔코딩
	request.setCharacterEncoding("utf-8");

	//값 받아오기
	String intro_name = request.getParameter("name");
	String intro_blood = request.getParameter("blood");
	String hp1 = request.getParameter("hp1");
	String hp2 = request.getParameter("hp2");
	String hp3 = request.getParameter("hp3");
	String intro_hp = hp1+"-"+hp2+"-"+hp3;
	String intro_city = request.getParameter("city");
	
	introDto dto= new introDto();
	dto.setIntro_name(intro_name);
	dto.setIntro_blood(intro_blood);
	dto.setIntro_hp(intro_hp);
	dto.setIntro_city(intro_city);
	
	introDao dao= new introDao();
	dao.insertIntro(dto);
	
	response.sendRedirect("list.jsp");


%>

</body>
</html>