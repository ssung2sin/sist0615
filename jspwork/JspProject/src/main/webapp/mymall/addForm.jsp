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
 #selphoto{
 	position: absolute;
 	left: 600px;
 	top: 30px;
 	border-radius: 30px;
 
 }

</style>
<script type="text/javascript">	
	$(function() {
		var initImg=$("#photo").val();
		
		$("#selphoto").attr("src",initImg);
		
		$("#photo").change(function() {
			var s=$(this).val();
			$("#selphoto").attr("src",s);
		})
		
	})	
</script>
</head>
<body>
	<form action="addAction.jsp" method="post">
		<table class="table table-bordered" style="width: 500px;">
			
			<tr>
				<th>상품명</th>
				<td>
					<input type="text" name="sangpum" class="form-control"
					required="required" style="width: 120px;" placeholder="상품명">
				</td>
			</tr>
			
			<tr>
				<th>상품사진</th>
				<td>
					<select name="photo" id="photo">
						<option value="../image/shopImg/20.jpg">시계</option>
						<option value="../image/shopImg/30.jpg">헤어밴드</option>
						<option value="../image/shopImg/34.jpg">반바지</option>
						<option value="../image/shopImg/28.jpg">하얀원피스</option>
						<option value="../image/shopImg/10.jpg">스카프</option>
					</select>
				</td>
			</tr>
	
			<tr>
				<th>가격</th>
				<td>
					<input type="text" name="price" class="form-control"
					required="required" style="width: 120px;" placeholder="가격">
				</td>
			</tr>
			
			<tr>
				<th>입고일</th>
				<td>
					<input type="date" name="ipgoday" class="form-control"
					required="required" style="width: 150px;" placeholder="입고일">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
				<button type="submit" class="btn btn-info">쇼핑몰에 저장</button>
				<button type="button" class="btn btn-success"
				onclick="location.href='list.jsp'">목록으로 이동</button>
				</td>
			</tr>
			
			
		</table>
	</form>
	<div>
		<img src="" id="selphoto">
	</div>
	

</body>
</html>