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
div.updateform{
	position: absolute;
	width: 700px;
	height: 700px;
	border: 0px solid gray;
	top:50px;
	left: 50px;
}
#btnAdd{	
	position: absolute;
	left: 450px;
	top:10px;
}
#btnList{
	position: absolute;
	left: 520px;
	top:10px;

}
</style>
</head>
<body>
	<div class="updateform">
		<h2>글 작성하기</h2>
		<hr style="border: 2px solid gray; width: 600px;">
		<form action="quizaction.jsp" method="post" enctype="multipart/form-data">
			<table style="width: 600px;">
				<tr style="height: 50px;">
					<td style="margin: 100px;" colspan="2">
						<input type="text" name="writer" style="width: 150px;"
						class="form-control" required="required" placeholder="작성자">
					</td>
				</tr>
				<tr style="height: 50px;">
					<td colspan="2">
						<input type="text" name="title" style="width: 350px;"
						class="form-control" required="required" placeholder="제목">
					</td>
				</tr>
				<tr style="height: 50px;">
					<th style="width: 100px;" colspan="2">이미지업로드</th>
				</tr>
				<tr>	
					<td colspan="2">
						<input type="file" name="imgname" class="form-control"
						style="width: 300px;">
						<br>
					</td>
				</tr>
				<tr style="height: 50px;">
					<td colspan="2" align="center">
						<textarea style="width: 600px; height: 300px;"
						name="content" class="form-control" required="required"
						placeholder="내용을 입력하세요"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<button type="submit" class="btn btn-outline-success btn-sm" id="btnAdd">DB추가</button>
						<button type="button" class="btn btn-outline-info btn-sm" id="btnList"
						onclick="location.href='quizlist.jsp'">리스트로</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>