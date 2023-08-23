<%@page import="db.simpleboard.SimpleBoardDao"%>
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
	String num=request.getParameter("num");
	String pass=request.getParameter("pass");

	SimpleBoardDao dao=new SimpleBoardDao();
	
	//passcheck
	boolean flag=dao.comparePassword(num, pass);
	
	//true면 수정품으로,false면 경고창
	if(flag){
		response.sendRedirect("updateform.jsp?num="+num);
	}else{
		%>
		<script type="text/javascript">
			alert("비밀번호 불일치");
			history.back();
		</script>
		<%
	}

%>
</body>
</html>