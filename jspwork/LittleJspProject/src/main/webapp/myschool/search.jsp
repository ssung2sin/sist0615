<%@page import="myschool.model.MyschoolDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="myschool.model.MyschoolDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Dongle:wght@300&family=Nanum+Pen+Script&family=Noto+Serif+KR:wght@200&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div id="search">
	   <table class="table table-bordered" style="width: 150px">
	   		<caption align="top">검색 결과</caption>
	   		<tr>
				<th style="background-color: aqua;text-align: center">학번</th>
				<th style="background-color: aqua;text-align: center">이름</th>
			</tr>
	   <%
	   	request.setCharacterEncoding("utf-8");
	   
		String name=request.getParameter("search");
	   
	    MyschoolDao dao=new MyschoolDao();
		ArrayList<MyschoolDto> search_list=dao.searchFromName(name);
		System.out.println(name);
		
	    if(name==null)
	    {%>
	    	<tr>
	    		<td colspan="2" align="center">검색 대기중</td>
	    	</tr>
	    <%}else if(search_list.size()!=0){
			for(int i=0;i<search_list.size();i++)
			{
				MyschoolDto search_dto=search_list.get(i);%>
				<tr>
					<td><%=search_dto.getNum() %></td>
					<td><%=search_dto.getMyname() %></td>
				</tr>
			<%}
		}else{%>
			<tr>
				<td colspan="2" align="center">검색결과 없음</td>
			</tr>
		<%} %>   		
	   </table>
   </div>
</body>
</html>