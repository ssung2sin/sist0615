<%@page import="db.ajaxboard.AjaxboardDto"%>
<%@page import="db.ajaxboard.AjaxboardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	request.setCharacterEncoding("utf-8");

	AjaxboardDao dao=new AjaxboardDao();
	
	String writer=request.getParameter("writer");
	String subject=request.getParameter("subject");
	String avata=request.getParameter("avata");
	String story=request.getParameter("story");
	
	AjaxboardDto dto=new AjaxboardDto();
	
	dto.setWriter(writer);
	dto.setSubject(subject);
	dto.setAvata(avata);
	dto.setStory(story);
	
	System.out.println(avata);
	
	dao.insertAjaxboard(dto);
	
	


%>