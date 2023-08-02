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
	String per1=request.getParameter("person");
	String [] per2=request.getParameterValues("person2");
	%>
	
	조장1순위: <%=per1 %><br>
	
	예비조장: 
	<%
	if(per2==null){
	%>
	
	<b style="color: blueviolet;">예비조장 없음</b>
	<%}
	else{
		for(int i=0;i<per2.length;i++){
			%>
			[<%=per2[i] %>]&nbsp;
			<%
		}
	%>
	<br><b>총<%=per2.length %>명의 예비조장 있음</b>
	<%	
	}%>
</body>
</html>