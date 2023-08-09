<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//front에서 보낸 데이터 읽어오기
String photoNo = request.getParameter("photoNo");
String photoName = request.getParameter("photoName");
String like1 = request.getParameter("like1");
String like2 = request.getParameter("like2");
String like3 = request.getParameter("like3");


//총점==>String을 int로 변환
int sum=Integer.parseInt(like1)+Integer.parseInt(like2)+Integer.parseInt(like3);
//평균
double avg=(double)sum/3;

//front형태로 만들어서 다시 front로 넘기기
JSONObject ob=new JSONObject();
ob.put("photo","../image/food/"+photoNo+".jpg");
ob.put("food", photoName);
ob.put("sum", sum);
ob.put("avg", avg);
%>

<%=ob.toString()%>