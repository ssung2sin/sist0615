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
	String mygrade=request.getParameter("mygrade");
	String myclass=request.getParameter("myclass");
	String korean=request.getParameter("korean");
	String english=request.getParameter("english");
	String math=request.getParameter("math");
	String society=request.getParameter("society");
	String science=request.getParameter("science");
	String music=request.getParameter("music");
	String art=request.getParameter("art");
	String pe=request.getParameter("pe");
			

	session.setAttribute("modal", "yes");
	
	MyschoolDao dao=new MyschoolDao();
	MyschoolDto dto1=new MyschoolDto();
	MyschoolDto dto2=new MyschoolDto();
	
	dto1.setMygrade(mygrade);
	dto1.setMyclass(myclass);
	dto1.setNum(thisNum);
	
	dao.updateMyschool_admin(dto1);
	
	dto2.setKorean(korean);
	dto2.setEnglish(english);
	dto2.setMath(math);
	dto2.setSociety(society);
	dto2.setScience(science);
	dto2.setMusic(music);
	dto2.setArt(art);
	dto2.setPe(pe);
	dto2.setNum(thisNum);
	
	dao.updateSubject(dto2);
	
	
	response.sendRedirect("myschoolMain.jsp?thisNum="+thisNum);
	
%>
</body>
</html>