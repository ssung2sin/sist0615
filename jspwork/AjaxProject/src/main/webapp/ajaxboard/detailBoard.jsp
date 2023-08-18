<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="db.ajaxboard.AjaxboardDto"%>
<%@page import="db.ajaxboard.AjaxboardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	AjaxboardDao dao=new AjaxboardDao();

	String num=request.getParameter("num");

	AjaxboardDto dto=dao.getData(num);
	SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	JSONObject ob=new JSONObject();
	
	ob.put("num", dto.getNum());
	ob.put("writer", dto.getWriter());
	ob.put("subject",dto.getSubject());
	ob.put("story",dto.getStory());
	ob.put("avata",dto.getAvata());
	ob.put("writeday",sdf.format(dto.getWriteday()));
%>

<%=ob.toString()%>