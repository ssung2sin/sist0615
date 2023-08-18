<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="db.ajaxboard.AjaxboardDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="db.ajaxboard.AjaxboardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	AjaxboardDao dao=new AjaxboardDao();
	ArrayList<AjaxboardDto> list=dao.getAllDatas();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	JSONArray arr=new JSONArray();
	for(AjaxboardDto dto:list){
		JSONObject ob=new JSONObject();
		ob.put("num",dto.getNum()); //ob.put(key,value) =>key값은 무조건 스트링이다.
		ob.put("writer",dto.getWriter());
		ob.put("subject",dto.getSubject());
		ob.put("story",dto.getStory());
		ob.put("avata",dto.getAvata());
		ob.put("writeday",sdf.format(dto.getWriteday()));
		
		arr.add(ob);
	}

%>
<%=arr.toString()%>