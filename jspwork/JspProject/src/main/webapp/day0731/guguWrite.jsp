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
</head>
<body>
	<table class="table table-bordered">
		<tr>
			<td colspan="8" align="center">
				<b style="font-size: 2em;">전체 구구단</b>
			</td>
		</tr>
		
		<tr>
			<%
			for(int dan=2;dan<=9;dan++){
			%>
				<td align="center"><%=dan %>단</td>
			<%}
			%>
		</tr>
		
		<%
		for(int i=1;i<=9;i++){
		%>
			<tr>
				<%
				for(int dan=2;dan<=9;dan++){
				%>
					<td align="center">
					<%=dan %>X<%=i %>=<%=dan*i %>
					</td>
				<%}
				%>
			</tr>
		<%}
		%>
	
	</table>
</body>
</html>