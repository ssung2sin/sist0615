<%@page import="model.intro.introDao"%>
<%@page import="model.intro.introDto"%>
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
	<%
		String num=request.getParameter("num");
		introDao dao=new introDao();
		introDto dto=dao.getData(num);
		String []hp=dao.separateHp(dto.getIntro_hp());
%>
<body>
	<form action="updateAction.jsp" method="post"
	enctype="multipart/form-data">
	<input type="hidden" name="num" value="<%=num %>">
		<table class="table table-bordered" style="width: 400px;">
			<tr>
				<th>이름</th>
				<td>
					<input type="text" name="name" value="<%=dto.getIntro_name() %>" class="form-control"
					required="required" style="width: 120px;" placeholder="이름">
				</td>
			</tr>
			<tr>
				<th>혈액형</th>
				<td>
					<select name="blood">
						<option value="A" <%=dto.getIntro_blood().equals("A")?"selected":"" %>>A형</option>
						<option value="B" <%=dto.getIntro_blood().equals("B")?"selected":"" %>>B형</option>
						<option value="O" <%=dto.getIntro_blood().equals("O")?"selected":"" %>>O형</option>
						<option value="AB" <%=dto.getIntro_blood().equals("AB")?"selected":"" %>>AB형</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>폰번호</th>
				<td>
					<select name="hp1">
						<option value="010" <%=(hp[0].equals("010")?"selected":"") %>>010</option>
						<option value="011" <%=(hp[0].equals("011")?"selected":"") %>>011</option>
						<option value="016" <%=(hp[0].equals("016")?"selected":"") %>>016</option>
						<option value="017" <%=(hp[0].equals("017")?"selected":"") %>>017</option>
						<option value="018" <%=(hp[0].equals("018")?"selected":"") %>>018</option>
						<option value="019" <%=(hp[0].equals("019")?"selected":"") %>>019</option>	
					</select>
					-
					<input type="text" name="hp2" required="required" id="hp2" value="<%=hp[1] %>"
					style="width: 50px;" maxlength="4" placeholder="0000">
					-
					<input type="text" name="hp3" required="required" id="hp3" value="<%=hp[2] %>"
					style="width: 50px;" maxlength="4" placeholder="0000">
				</td>
			</tr>
			<tr>
				<th>사는지역</th>
				<td>
					<input type="radio" name="city" value="서울" <%=dto.getIntro_city().equals("서울")?"checked":"" %>>서울
					<input type="radio" name="city" value="경기" <%=dto.getIntro_city().equals("경기")?"checked":"" %>>경기
					<input type="radio" name="city" value="강원" <%=dto.getIntro_city().equals("강원")?"checked":"" %>>강원
					<input type="radio" name="city" value="충북" <%=dto.getIntro_city().equals("충북")?"checked":"" %>>충북
					<input type="radio" name="city" value="충남" <%=dto.getIntro_city().equals("충남")?"checked":"" %>>충남
					<br>
					<input type="radio" name="city" value="전북" <%=dto.getIntro_city().equals("전북")?"checked":"" %>>전북
					<input type="radio" name="city" value="전남" <%=dto.getIntro_city().equals("전남")?"checked":"" %>>전남
					<input type="radio" name="city" value="경북" <%=dto.getIntro_city().equals("경북")?"checked":"" %>>경북
					<input type="radio" name="city" value="경남" <%=dto.getIntro_city().equals("경남")?"checked":"" %>>경남
					<input type="radio" name="city" value="제주" <%=dto.getIntro_city().equals("제주")?"checked":"" %>>제주
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="정보수정" class="btn btn-success"
					style="width: 100px;">
					<input type="button" value="목록" class="btn btn-info"
					style="width: 100px;" onclick="location.href='list.jsp'">
				</td>
			</tr>
		</table>
	
	</form>
</body>
</html>