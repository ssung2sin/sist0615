<%@page import="member.model.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css2?family=Dongle:wght@300&family=Gaegu:wght@300&family=Nanum+Pen+Script&family=Sunflower:wght@300&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
<%
	String key=request.getParameter("key"); //처음 호출시엔 null
	
	if(key==null){
		//null일 경우 폼을 나타낸다
		%>
		<div style="margin: 10px 30px;">
			<form action="idcheck.jsp" method="post" class="form-inline">
				<b>아이디를 입력해주세요</b><br>
				<input type="text" name="id" class="form-control"
				style="width: 120px; float: left;">
				<input type="hidden" name="key" value="yes">
				<button type="submit" class="btn btn-success" style="margin-left: 20px;">중복체크</button>
			</form>
		
		</div>
		
		<%}else{
			//action처리
			String id=request.getParameter("id");
			
			//dao에서 id 존재유무에 관한 메서드..
			
			MemberDao dao=new MemberDao();
			
			boolean b=dao.isIdCheck(id);
			
			if(b){
				%>
				<div style="margin: 10px 30px;">
					<h5><%=id %>는 이미 가입된 아이디입니다.</h5>
					<img src="../image/avata/b6.png" width="60" align="left">
					<button type="button" class="btn btn-danger btn-xs"
					onclick="location.href='idcheck.jsp'">다시입력</button>
				</div>
			<%}else{
				%>
				<div style="margin: 10px 30px;">
					<h5><%=id %>는 사용가능한 아이디입니다.</h5>
					<img src="../image/avata/b2.png" width="60" align="left">
					<button type="button" class="btn btn-success btn-xs"
					onclick="saveId('<%=id %>')">적용하기</button>
					<button type="button" class="btn btn-danger btn-xs"
					onclick="location.href='idcheck.jsp'">다시입력</button>
				</div>
				<%
			}

	}
%>
<script type="text/javascript">

	function saveId(id) {
		//alert(id);//아이디 넘어오는지 확인
		
		//부모창:opener
		//현재창의 id를 부모창의 아이디에 띄운다
		opener.mfrm.mid.value=id;
		
		//현재장 닫기
		window.close();
	}
</script>
</body>
</html>