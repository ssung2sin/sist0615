<%@page import="java.text.SimpleDateFormat"%>
<%@page import="db.simpleguest.SimpleGuestDao"%>
<%@page import="db.simpleguest.SimpleGuestDto"%>
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
</style>
</head>
<%
	String num=request.getParameter("num");
	SimpleGuestDao dao=new SimpleGuestDao();
	SimpleGuestDto dto=dao.getData(num);
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");

%>
<body>
<h4 style="color: gray; margin: 20px;">삭제하려면 비밀번호 입력후 버튼을 눌러주세요.</h4>
<div class="print">
	<form action="deleteAction.jsp" method="post">
	<input type="hidden" name="num" value=<%=num %>>
	<table>
		<tr><td class="nick" colspan="2"><h4><%=dto.getNick() %></h4></td><tr>
		<tr><td class="writeday" colspan="2"style="color: gray"><%=sdf.format(dto.getWriteday()) %></td></tr>
		<tr><td colspan="2"><hr style="width: 250px; border: 2px solid gray"></td></tr>	
		<tr>
			<td class="image" style="width: 60px;"><img src="../image/avata/b<%=dto.getImage()%>.png" style="width: 55px;"></td>
			<td class="story"><%=dto.getStory() %></td>
		</tr>
		<tr>
		<th width='85' style="background-color: #e6e6fa; width: 100px;">비밀번호</th>
				<td align="center">
					<input type="password" name="pass" required="required" style="width: 120px;"> 
				</td>
		</tr>
		<tr>
			<td align="center" colspan="2">
				<button type="submit" class="btn btn-outline-danger">삭제</button>
				<input type="button" value="취소" class="btn btn-outline-info"
				onclick="location.href='guestlist.jsp'">
			</td>
		</tr>	
	</table>
	</form>
</div>
</body>
</html>