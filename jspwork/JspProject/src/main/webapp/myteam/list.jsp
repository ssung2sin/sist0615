<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.myteam.TeamDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.myteam.TeamDao"%>
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
	TeamDao dao=new TeamDao();
	ArrayList<TeamDto> list=dao.getAllmyTeams();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>
<body>
	<a href="addForm.jsp">팀원추가</a>
	<br>
	  <table class="table table-bordered" style="width: 800px;">
      <tr class="table-success" style="text-align: center;">
			<th width="60">번호</th>
			<th width="120">이름</th>
			<th width="100">운전면허</th>
			<th width="200">주소</th>
			<th width="150">작성일</th>
			<th width="130">수정|삭제</th>
		</tr>
		
		<%for(int i=0;i<list.size();i++){
			TeamDto dto=list.get(i);
			%>
			<tr>
				<td align="center"><%=i+1 %></td>
				<td align="center"><%=dto.getName() %></td>
				<td align="center"><%=dto.getDriver() %></td>
				<td><%=dto.getAddr() %></td>
				<td><%=sdf.format(dto.getWriteday()) %></td>
				<td><input type="button" class="btn btn-info btn-sm" value="수정"
				onclick="location.href='updateForm.jsp?num=<%=dto.getNum()%>'">
				<input type="button" class="btn btn-danger btn-sm" value="삭제"
				onclick="click1(<%=dto.getNum()%>)">
				</td>
			</tr>
			
			<%
			}%>
	</table>
	
	<script type="text/javascript">
	function click1(num){
		var s=confirm("정말 삭제하시겠습니까?");
		
		if(s){
			location.href='teamdelete.jsp?num='+num;
			alert("삭제하였습니다.");
		}else{
			alert('취소하였습니다.');
		}
	}
	</script>
</body>
</html>