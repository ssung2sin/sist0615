<%@page import="java.text.SimpleDateFormat"%>
<%@page import="db.simpleguest.SimpleGuestDao"%>
<%@page import="db.simpleguest.SimpleGuestDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle:wght@300&family=Gaegu:wght@300&family=Nanum+Pen+Script&family=Sunflower:wght@300&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<style type="text/css">
.print{
	margin: 20px; 50px;
	top: 100px;
	width:300px;
	height: 300px;
	border: 2px solid black;
}

.print *{
	margin: 5px;
}
</style>
</head>
<%
	SimpleGuestDao dao=new SimpleGuestDao();
	ArrayList<SimpleGuestDto>list=dao.getAllDatas();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");

%>
<body>
<div style="margin: 50px; 50px;">
	<input type="button" value="글쓰기" class="btn btn-outline-success"
	onclick="location.href='insertForm.jsp'">
</div>
<%for(int i=0;i<list.size();i++){ 
	SimpleGuestDto dto=list.get(i);
%>
<div class="print">
	<table>
		<tr><td class="no" colspan="2">No.<%=list.size()-i %></td></tr>
		<tr><td class="nick" colspan="2"><h4><%=dto.getNick() %></h4></td><tr>
		<tr><td class="writeday" colspan="2"style="color: gray"><%=sdf.format(dto.getWriteday()) %></td></tr>
		<tr><td colspan="2"><hr style="width: 250px; border: 2px solid gray"></td></tr>	
		<tr>
			<td class="image" style="width: 60px;"><img src="../image/avata/b<%=dto.getImage()%>.png" style="width: 55px;"></td>
			<td class="story"><%=dto.getStory() %></td>
		</tr>
		<tr>
			<td colspan="2" align="right">
			<button type="button" class="btn btn-info" onclick="location.href='updateForm.jsp?num=<%=dto.getNum()%>	'">수정</button>
			<button type="button" class="btn btn-danger" onclick="location.href='deleteForm.jsp?num=<%=dto.getNum()%>'">삭제</button>
			</td>
		</tr>
	</table>
</div>
<%} %>

</body>