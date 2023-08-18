<%@page import="db.ajaxboard.AjaxboardDto"%>
<%@page import="db.ajaxboard.AjaxboardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String num=request.getParameter("num");

	AjaxboardDao dao=new AjaxboardDao();
	
	dao.deleteBoard(num);
%>