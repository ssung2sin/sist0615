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
<script type="text/javascript">
$(function() {
	$("#btngaip").click(function(){
		if(mfrm.mid.value.length==0){
			alert("아이디 입력버튼을 눌러주세요.");
			return false;
		}
	})
	
})

</script>
</head>
<body>
	<div style="margin: 50px 100px;">
		<form action="addProc.jsp" method="post" enctype="multipart/form-data" class="form-inline" id="mfrm">
			<table class="table table-bordered form-inline" style="width: 500px;">
				<caption align="top"><b>회원가입</b></caption>
				<tr>
					<td style="background-color: #66cdaa; width: 120px;">아이디</td>
					<td>
						<input type="text" class="form-control" name="id" id="mid" style="width: 120px;"
						readonly="readonly" required="required">
						<button type="button" class="btn btn-danger btn-sm"
						onclick="openId()">아이디입력</button>
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
						name="name" required="required">
					</td>
				</tr>
				<tr>
					<td style="background-color: #66cdaa" width="120">사진</td>
					<td>
						<input type="file" class="form-control" style="width: 250px;"
						name="picture" required="required">
					</td>
				</tr>
				<tr>
					<td style="background-color: #66cdaa" width="120">휴대폰번호</td>
					<td>
						<input type="text" class="form-control" style="width: 200px;"
						name="hp" required="required">
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<button type="submit" class="btn btn-success"
						id="btngaip">회원가입</button>
						<button type="button" class="btn btn-info" onclick="location.href='memberList.jsp'">회원목록</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
	
	<script type="text/javascript">
		function openId() {
			window.open("idcheck.jsp","e","left=400px; top=100px; width=400px; height=250px;");
		}
	</script>
</body>
</html>