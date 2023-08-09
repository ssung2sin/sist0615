<%@page import="db.memo.MemoDao"%>
<%@page import="db.memo.MemoDto"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String num=request.getParameter("unum");
	String writer=request.getParameter("uwriter");
	String story=request.getParameter("ustory");
	String avata=request.getParameter("uavata");
	
	MemoDto dto=new MemoDto();
	MemoDao dao=new MemoDao();
	dto.setNum(num);
	dto.setWriter(writer);
	dto.setStory(story);
	dto.setAvata(avata);
	
	dao.memoUpdate(dto);
%>