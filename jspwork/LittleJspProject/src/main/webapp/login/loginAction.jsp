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
</head>
<body>
<%
	String id=request.getParameter("id");
	String pass=request.getParameter("pass");
	String savechk=request.getParameter("savechk");
	
	MyschoolDao dao=new MyschoolDao();
	
	boolean login=dao.isLoginCheck(id, pass);
	
	if(login){
		session.setAttribute("loginok", "check");
		session.setAttribute("idok", id);
		session.setAttribute("id",id);
		session.setAttribute("saveok", savechk);
		
		session.setMaxInactiveInterval(60*60*4);
		
		response.sendRedirect("../myschool/myschoolMain.jsp");
	}else{%>
	<script type="text/javascript">
	alert("아이디와 비밀번호가 일치하지 않습니다.");
	history.back();
	
	</script>
	<%
	}
%>
</body>
</html>