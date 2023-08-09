<%@page import="db.memo.MemoDto"%>
<%@page import="db.memo.MemoDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
MemoDao dao=new MemoDao();

request.setCharacterEncoding("utf-8");

String num=request.getParameter("num");

dao.deleteMemo(num);


%>