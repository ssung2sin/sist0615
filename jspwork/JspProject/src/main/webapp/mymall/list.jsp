<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.mymall.MallDto"%>
<%@page import="java.util.Vector"%>
<%@page import="model.mymall.MallDao"%>
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
	MallDao dao=new MallDao();
	Vector<MallDto> list=dao.getAllDatas();
	NumberFormat nf=NumberFormat.getCurrencyInstance();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
%>
<body>
<button type="submit" class="btn btn-info"
onclick="location.href='addForm.jsp'">상품추가</button>
<table class="table table-bordered" style="width: 800px;">
      <tr class="table-success" style="text-align: center;">
			<th width="60">번호</th>
			<th width="150">상품명</th>
			<th width="200">사진</th>
			<th width="120">가격</th>
			<th width="150">입고일</th>
			<th width="150">현재날짜</th>
			<th width="140">수정|삭제</th>
		</tr>
		
		<%
		if(list.size()==0){
			%>
			<tr>
				<td colspan="6" align="center">
				<h5>등록된 상품이 없습니다.</h5>
				</td>
			</tr>
		<%}
		for(int i=0;i<list.size();i++){
			MallDto dto=list.get(i);
			%>
			<tr>
				<td align="center" valign="middle"><%=i+1%></td>
				<td align="center" valign="middle"><%=dto.getSangpum()%></td>
				<td align="center" valign="middle"><a href="detailPage.jsp?no=<%=dto.getNo()%>"><img src="<%=dto.getPhoto()%>" style="width: 100px;"></a></td>
				<td align="center" valign="middle"><%=nf.format(Integer.parseInt(dto.getPrice()))%></td>
				<td align="center" valign="middle"><%=dto.getIpgoday()%></td>
				<td align="center" valign="middle"><%=sdf.format(dto.getWriteday())%></td>
				<td align="center" valign="middle"><input type="button" class="btn btn-info btn-sm" value="수정"
				onclick="location.href='updateForm.jsp?no=<%=dto.getNo()%>'">
				<input type="button" class="btn btn-warning btn-sm" value="삭제"
				onclick="location.href='deleteAction.jsp?no=<%=dto.getNo()%>'">
			</tr>
			
			<%
		}
		
		%>
</table>
</body>
</html>