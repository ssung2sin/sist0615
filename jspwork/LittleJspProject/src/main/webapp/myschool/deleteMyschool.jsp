<%@page import="myschool.model.MyschoolDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num=request.getParameter("num");

MyschoolDao dao=new MyschoolDao();
dao.deleteMyschool(num);

response.sendRedirect("myschoolMain.jsp");
%>