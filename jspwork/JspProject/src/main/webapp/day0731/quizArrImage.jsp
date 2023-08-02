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
	<!-- 01~20.png 4행5열로 출력 하세요  -->
	
<%
String[ ]img =new String[20];
	for(int i=0;i<20;i++){
		if(i<9){
			img[i]="../image/cartoonImg/0"+(i+1);
		}
		else{
			img[i]="../image/cartoonImg/"+(i+1);
		}
		
	}
%>

<table class="table table-bordered" style="width: 460px;">
	<%
	int n=0;
	
	for(int i=0;i<4;i++){
	%>
		<tr>
		<%
		for(int j=0;j<5;j++){
		%>
			<td>
				<img src="<%=img[n] %>.png" width="150">		
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