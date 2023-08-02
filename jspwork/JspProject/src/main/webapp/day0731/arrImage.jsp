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
<%
	String [] str={"01.png","02.png","03.png","04.png","05.png",
			"06.png","07.png","08.png","09.png"};

	int n=0;
%>

<table class="table table-bordered" style="width: 460px;">
	<%
	for(int i=0;i<3;i++){
	%>
		<tr>
		<%
			for(int j=0;j<3;j++){
		%>
			<td>
				<img alt="" src="../image/cartoonImg/<%=str[n] %>" width="150">
			</td>
			<%
			n++;
			}
		%>
		</tr>
	<%
	}
	%>

</table>
</body>
</html>