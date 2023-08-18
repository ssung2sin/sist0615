<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
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
</head>
<body>
<%
	String thisNum=request.getParameter("thisNum");
	//System.out.println(thisNum);
	String myhp=request.getParameter("myhp");
	String mypass=request.getParameter("mypass");
	String myaddr=request.getParameter("myaddr");

	session.setAttribute("modal", "yes");
	
	MyschoolDao dao=new MyschoolDao();
	MyschoolDto dto=new MyschoolDto();
	
	dto.setMyhp(myhp);
	dto.setMypass(mypass);
	dto.setMyaddr(myaddr);
	dto.setNum(thisNum);
	
	dao.updateMyschool_stu(dto);
	
	response.sendRedirect("myschoolMain.jsp?thisNum="+thisNum);
	
%>
</body>
</html>