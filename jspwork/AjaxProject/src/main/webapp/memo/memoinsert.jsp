<%@page import="db.memo.MemoDto"%>
<%@page import="db.memo.MemoDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemoDao dao=new MemoDao();

	//엔코딩
	request.setCharacterEncoding("utf-8");
	
	//데이터읽기(writer,story,avata)
	String writer=request.getParameter("writer");
	String story=request.getParameter("story");
	String avata=request.getParameter("avata");

	//dto로 묶기
	MemoDto dto=new MemoDto();
	dto.setWriter(writer);
	dto.setStory(story);
	dto.setAvata(avata);
	
	//insert 호출
	dao.insertMemo(dto);
%>