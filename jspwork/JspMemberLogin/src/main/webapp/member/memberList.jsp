<%@page import="java.text.SimpleDateFormat"%>
<%@page import="member.model.MemberDto"%>
<%@page import="java.util.ArrayList"%>
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
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
	th{
	font-family: "Gaegu";
	font-size: 18px;
	
	
	}
	img{
	border-radius: 80px;
	border: 2px solid gray;
	
	}
	div.box{
		margin: 50px 20px;
	}

</style>
<script type="text/javascript">
function funcDel(num){
	
	//alert(num);
	$("#btnmdel").attr("num",num);
	$("#myModal").modal();
}

$(function() {
	$("#btnmdel").click(function() {
		location.href="deleteMember.jsp?num="+$(this).attr("num");
	})
})
</script>
</head>
<%
	MemberDao dao=new MemberDao();
	ArrayList<MemberDto>list=dao.getAllDatas();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
%>
<body>
<div class="box">
	<h4><b style="color: gray">총 <%=list.size() %>명의 리스트가 있습니다.</b></h4>
	<h1 style="font-family: 'Dongle';">전체리스트</h1>
	<table class="table table-bordered" style="width: 700px;">
		<tr>
			<th width="80">번호</th>
			<th width="150">아이디</th>
			<th width="100">회원명</th>
			<th width="200">가입일</th>
			<th width="100">편집</th>
		</tr>
		<%
		for(int i=0;i<list.size();i++){
			MemberDto dto=list.get(i);
			%>
			<tr>
				<td><%=i+1 %></td>
				<td><%=dto.getId() %></td>
				<td><%=dto.getName() %>
				<img src="<%=dto.getImage() %>" style="width: 80px; height: 80px;"></td>
				<td><%=sdf.format(dto.getDate()) %></td>
				<td>
				<%
				//로그인한 본인 것만 수정/삭제 보이도록...
				String loginok=(String)session.getAttribute("loginok");
				String id=(String)session.getAttribute("idok");
				
				//로그인한 본인것만 나오도록
				if(loginok!=null && dto.getId().equals(id)){
				%>
				<button type="button" class="btn btn-info btn-xs"
				onclick="location.href='updateForm.jsp?num=<%=dto.getNum()%>'">수정</button>
				<button type="button" class="btn btn-danger btn-xs"
				onclick="funcDel(<%=dto.getNum()%>)">삭제</button>
				<%}else{
					%>
					<h5>권한없음</h5>
				<%}%>
				</td>
			</tr>
			
			<%
		}
		%>
	</table>
	<br>
	<% 
	String loginok=(String)session.getAttribute("loginok");
	String id=(String)session.getAttribute("idok");
	if(loginok==null){
		%>
		<button type="button" class="btn btn-success" onclick="location.href='../login/loginMain.jsp'">로그인</button>
		
		<%
	}else{
	
	%>
	<button type="button" class="btn btn-warning" onclick="location.href='../login/logoutAction.jsp'">로그아웃</button>
	<button type="button" class="btn btn-info" onclick="location.href='../login/loginMain.jsp'">로그인정보로</button>
	<%
	}
	%>
	<button type="button" class="btn btn-primary" onclick="location.href='addForm.jsp'">회원가입</button>
</div>

<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">회원탈퇴</h4>
        </div>
        <div class="modal-body">
          <p>회원 탈퇴를 원하시면 [탈퇴확인]을 눌러주세요.</p>
          <button type="button" class="btn btn-danger"
          id="btnmdel" num="">탈퇴확인</button>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
</body>
</html>