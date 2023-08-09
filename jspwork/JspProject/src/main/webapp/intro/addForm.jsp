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
<script type="text/javascript">
	$(function() {
		$("#hp2").on('keyup',function(){
				if(this.value.length==4){
					$("#hp3").focus();
				}
		})
	})

</script>
<style type="text/css">
	th{
		text-align: center;
	}
</style>
</head>

<body>
	<form action="addAction.jsp" method="post">
		<table class="table table-bordered" style="width: 400px;">
			<tr>
				<th>이름</th>
				<td>
					<input type="text" name="name" class="form-control"
					required="required" style="width: 120px;" placeholder="이름">
				</td>
			</tr>
			<tr>
				<th>혈액형</th>
				<td>
					<select name="blood">
						<option value="A">A형</option>
						<option value="B">B형</option>
						<option value="O">O형</option>
						<option value="AB">AB형</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>폰번호</th>
				<td>
					<select name="hp1">
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="017">016</option>
						<option value="017">017</option>
						<option value="018">018</option>
						<option value="019">019</option>	
					</select>
					-
					<input type="text" name="hp2" required="required" id="hp2"
					style="width: 50px;" maxlength="4" placeholder="0000">
					-
					<input type="text" name="hp3" required="required" id="hp3" 
					style="width: 50px;" maxlength="4" placeholder="0000">
				</td>
			</tr>
			<tr>
				<th>사는지역</th>
				<td>
					<input type="radio" name="city" value="서울" checked>서울
					<input type="radio" name="city" value="경기">경기
					<input type="radio" name="city" value="강원">강원
					<input type="radio" name="city" value="충북">충북
					<input type="radio" name="city" value="충남">충남
					<br>
					<input type="radio" name="city" value="전북">전북
					<input type="radio" name="city" value="전남">전남
					<input type="radio" name="city" value="경북">경북
					<input type="radio" name="city" value="경남">경남
					<input type="radio" name="city" value="제주">제주
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="저장" class="btn btn-success"
					style="width: 100px;">
					<input type="button" value="목록" class="btn btn-info"
					style="width: 100px;" onclick="location.href='list.jsp'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>