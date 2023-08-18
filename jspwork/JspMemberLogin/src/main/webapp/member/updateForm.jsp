<%@page import="member.model.MemberDto"%>
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
<%
	String num=request.getParameter("num");
	MemberDao dao=new MemberDao();
	MemberDto dto=dao.getDataNum(num);

%>
<body>
	<div style="margin: 50px 100px;">
		<form action="updateProc.jsp" method="post" enctype="multipart/form-data" class="form-inline" id="mfrm">
			<input type="hidden" name="num" value=<%=num %>>
			<table class="table table-bordered form-inline" style="width: 500px;">
				<caption align="top"><b>회원수정</b></caption>
				<tr>
					<td style="background-color: #66cdaa; width: 120px;">아이디</td>
					<td>
						<input type="text" class="form-control" name="id" id="mid" style="width: 120px;"
						readonly="readonly" required="required" value=<%=dto.getId() %>>
					</td>
				</tr>
				<tr>
					<td style="background-color: #66cdaa" width="120">비밀번호</td>
					<td>
						<input type="password" class="form-control" style="width: 120px;"
						name="pass" required="required">
					</td>
				</tr>
				<tr>
					<td style="background-color: #66cdaa" width="120">이름</td>
					<td>
						<input type="text" class="form-control" style="width: 120px;"
						name="name" required="required" value=<%=dto.getName() %>>
					</td>
				</tr>
				<tr>
					<td style="background-color: #66cdaa" width="120">사진</td>
					<td>
						<input type="file" class="form-control" style="width: 250px;"
						name="picture">
						<img src="<%=dto.getImage()%>" style="width: 80px;">
					</td>
				</tr>
				<tr>
					<td style="background-color: #66cdaa" width="120">휴대폰번호</td>
					<td>
						<input type="text" class="form-control" style="width: 200px;"
						name="hp" required="required" value=<%=dto.getHp() %>>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<button type="submit" class="btn btn-success"
						id="btngaip">회원정보수정</button>
						<button type="button" class="btn btn-danger" onclick="location.href='memberList.jsp'">취소</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>