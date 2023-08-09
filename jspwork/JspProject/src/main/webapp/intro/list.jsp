<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
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
</head>
<%
introDao dao=new introDao();
ArrayList<introDto> list=dao.getAllIntro();
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

%>

<body>
<input type="button" value="추가하기" class="btn btn-info"
style="width: 100px;" onclick="location.href='addForm.jsp'">
<br><br>
<table class="table table-bordered" style="width: 700px;">
	<tr align="center">
		<th width="60">번호</th><th width="120">이름</th><th width="90">혈액형</th><th width="180">전화번호</th>
		<th width="120">사는지역</th><th width="200">가입일</th><th width="170">수정|삭제</th>
	</tr>
	<%
	if(list.size()==0){
		%>
		<tr>
			<td colspan="7" align="center">
				<h5>등록된 상품이 없습니다.</h5>
				</td>
		</tr>
		<%
	}else{
		introDto dto=new introDto();
		
		for(int i=0;i<list.size();i++){
			dto=list.get(i);
			%>
			<tr>
				<td><%=i+1 %></td>
				<td><a href="detailForm.jsp?num=<%=dto.getIntro_num()%>"><%=dto.getIntro_name() %></a></td>
				<td><%=dto.getIntro_blood() %></td>
				<td><%=dto.getIntro_hp() %></td>
				<td><%=dto.getIntro_city() %></td>
				<td><%=sdf.format(dto.getGaipday()) %></td>
				<td align="center" valign="middle"><input type="button" class="btn btn-info btn-sm" value="수정"
				onclick="location.href='updateForm.jsp?num=<%=dto.getIntro_num()%>'">
				<input type="button" class="btn btn-warning btn-sm" value="삭제" id="btn2"
				onclick="conf(<%=dto.getIntro_num()%>)">
			</tr>
			<%
		}
	}
	%>
	
</table>
<script type="text/javascript">
	function conf(num) {
		var s=confirm("정말 삭제하겠습니까?");
		
		if(s){
			alert("삭제되었습니다.");
			location.href='deleteAction.jsp?num='+num;
		}
		else{
			alert("취소하였습니다.");
		}
	}
</script>
</body>
</html>