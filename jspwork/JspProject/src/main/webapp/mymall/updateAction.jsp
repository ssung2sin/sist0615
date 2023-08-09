<%@page import="model.mymall.MallDto"%>
<%@page import="model.mymall.MallDao"%>
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
	//
	request.setCharacterEncoding("utf-8");

	String no=request.getParameter("no");
	String sangpum=request.getParameter("sangpum");
	String photo=request.getParameter("photo");
	String price=request.getParameter("price");
	String ipgoday=request.getParameter("ipgoday");
	
	MallDto dto=new MallDto();
	dto.setNo(no);
	dto.setSangpum(sangpum);
	dto.setPhoto(photo);
	dto.setPrice(price);
	dto.setIpgoday(ipgoday);
	
	MallDao dao=new MallDao();
	dao.updateMall(dto);
	
	response.sendRedirect("list.jsp");
	

%>

</body>
</html>