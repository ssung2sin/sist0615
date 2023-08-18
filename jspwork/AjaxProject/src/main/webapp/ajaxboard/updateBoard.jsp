<%@page import="org.json.simple.JSONObject"%>
<%@page import="db.ajaxboard.AjaxboardDto"%>
<%@page import="db.ajaxboard.AjaxboardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String num=request.getParameter("num");
	String writer=request.getParameter("writer");
	String subject=request.getParameter("subject");
	String story=request.getParameter("story");
	String avata=request.getParameter("avata");
	
	AjaxboardDao dao=new AjaxboardDao();
	AjaxboardDto dto=new AjaxboardDto();
	
	dto.setNum(num);
	dto.setWriter(writer);
	dto.setSubject(subject);
	dto.setStory(story);
	dto.setAvata(avata);
	
	dao.updateBoard(dto);
	
	JSONObject ob=new JSONObject();
	
	ob.put("num", num);
	ob.put("writer",writer);
	ob.put("subject",subject);
	ob.put("story",story);
	ob.put("avata",avata);

%>

<%=ob.toString()%>