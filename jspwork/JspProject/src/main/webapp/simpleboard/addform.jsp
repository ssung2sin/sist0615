<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle:wght@300&family=Gaegu:wght@300&family=Nanum+Pen+Script&family=Sunflower:wght@300&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div style="margin: 30px 30px; width: 400px;">
	<form action="addaction.jsp" method="post">
		<table class="table table-bordered">
			<caption align="top" class="bi bi-pen"><b>글쓰기</b></caption>
			<tr>
				<th style="background-color: #E2E2E2;" valign="middle">작성자</th>
				<td>
					<input type="text" name="writer" class="form-control"
					required="required" autofocus="autofocus" style="width: 150px;">
				</td>
			</tr>
			<tr>
				<th style="background-color: #E2E2E2;" valign="middle">비밀번호</th>
				<td>
					<input type="password" name="pass" class="form-control"
					required="required" style="width: 150px;">
				</td>
			</tr>
			<tr>
				<th style="background-color: #E2E2E2;" valign="middle">제목</th>
				<td>
					<input type="text" name="subject" class="form-control"
					required="required" style="width: 270px;">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<textarea style="width: 390px; height: 150px;"
					class="form-control" required="required" name="story"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<!-- type이 image거나 submit이면 기본이 submit 입니다 -->
				<input type="image" src="../image/submit.png" style="width: 70px;">
				<input type="image" src="../image/list.png" style="width: 70px;"
				onclick="location.href='boardlist.jsp';return false;">
				</td>
			</tr>
		</table>
	
	</form>
	</div>
</body>
</html>