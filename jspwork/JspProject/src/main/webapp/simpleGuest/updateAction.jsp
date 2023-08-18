
<%@page import="db.simpleguest.SimpleGuestDto"%>
<%@page import="db.simpleguest.SimpleGuestDao"%>
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

	String num=request.getParameter("num");
	String nick=request.getParameter("nick");
	String pass=request.getParameter("pass");
	String story=request.getParameter("story");
	String image=request.getParameter("image");
	
	SimpleGuestDao dao=new SimpleGuestDao();
	
	//비밀번호가 맞으면 수정.. 수정 후 목록으로 이동
	if(dao.isEqualPass(num, pass)){
		SimpleGuestDto dto=new SimpleGuestDto();
		dto.setNum(num);
		dto.setNick(nick);
		dto.setImage(image);
		dto.setStory(story);
		
		dao.updateGuest(dto);
		
		response.sendRedirect("guestlist.jsp");
		
	}else{ //틀리면 자바스크립트로 경고 후 이전화면으로 이동
	%>
	<script type="text/javascript">
		alert("비밀번호가 일치하지 않습니다.");
		history.back();
	</script>
	
	<% 		
	}

%>
</body>
</html>