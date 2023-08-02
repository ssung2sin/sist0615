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
<style>
	#result{
		    border: 5px solid green;
            margin-top: 20px;
            width: 200px;
            height: 300px;
            padding: 20px;
            font-family: "Dongle";
            font-size: 1.5em;
	}
</style>
</head>
<body>
<%
	String pName=request.getParameter("name");
	String pSize=request.getParameter("size");
	String [] color=request.getParameterValues("color");
	String subMenu=request.getParameter("sub");
%>
<div id=result>
	상품명 : <%=pName %><br>
	사이즈 : <%=pSize %><br>
	<%
		if(color==null){
			%>
			선택한 색상이 없습니다<br>
			<%
		}
		else{
			for(int i=0;i<color.length;i++){
				%>
				<div style="border:3px solid <%=color[i] %>; border-radius: 5px; width: 30px; height: 30px"></div>
				<%
			}
		}
	%>
	추가상품 : <%=subMenu %>
</div>

</body>
</html>