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
	div.loginform{
		width: 500px;
		margin-top: 100px;
		margin-left: 200px;
	}
</style>
</head>
<body>
<%
	String myid=(String)session.getAttribute("idok");
	String saveid=(String)session.getAttribute("saveok");
	
	boolean save=true;
	
	if(saveid==null){
		myid=""; //아이디 저장을 체크하지 않을경우 아이디 없앤다
		save=false;
	}

%>
	<div class="loginform">
		<form action="loginAction.jsp" method="post">
			<input type="text" name="id" style="width: 200px;"
			class="form-control" placeholder="로그인 아이디" required="required" value=<%=myid %>><br>
			<input type="password" name="pass" style="width: 200px;"
			class="form-control" placeholder="비밀번호 입력" required="required"><br>
			
			<button type="submit" class="btn btn-success btn-lg"
			style="width: 200px;">로그인</button><br>
			
			<input type="checkbox" name="savechk" <%=save==true?"checked":""%>>아이디 저장
		</form>
	</div>
</body>
</html>