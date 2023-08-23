<%@page import="java.text.SimpleDateFormat"%>
<%@page import="db.simpleboard.SimpleBoardDto"%>
<%@page import="java.util.List"%>
<%@page import="db.simpleboard.SimpleBoardDao"%>
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
<style>
   body{
      font-family: Gaegu;
   }
   a:link,a:visited{
      text-decoration: none;
      color: black;
   }
   a:hover{
      text-decoration: underline;
      color: gray;
   }
</style>
<%
	SimpleBoardDao dao= new SimpleBoardDao();
	//List<SimpleBoardDto> list=dao.getAllDatas();
	SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd HH:mm");
	
	int totalCount=dao.getTotalCount();
	int totalPage; //총 페이지 수
	int startPage; //각 블럭에서 보여질 시작 페이지
	int endPage; //각 블럭에서 보여질 끝 페이지 (밑에 목록 수)
	int startNum; //db에서 가져올 글의 시작 번호(mysql은 첫글이 0, 오라클은 1)
	int perPage=5; // 한페이지당 몇개의 글을 보여주는지 정하는 것
	int perBlock=5; //한 블럭당 보여질 페이지 갯수
	int currentPage; //현재블럭
	int no; //각 페이지당 출력 시작번호
	
	//현재페이지 읽기(단, null일 경우 1페이지)계산을 해야하므로 int로 형변환해줌
	if(request.getParameter("currentPage")==null){
		currentPage=1;
	}
	else{
		currentPage=Integer.parseInt(request.getParameter("currentPage"));
	}  
	     
	//총 페이지수 구하기
	//총 글의 갯수/1페이지당 보여질 갯수로 나눠주기
	//나머지가 1개라도 있으면 무조건 1페이지 추가(7/5 1+1 => 총 2블럭)
	totalPage=totalCount/perPage+(totalCount%perPage==0?0:1);
	  
	//각 블럭당 보여야할 시작페이지
	//perBlock=5일 경우는 현재페이지 1~5 시작:1 끝:5
	//현재페이지13 시작 11 끝 15
	startPage=(currentPage-1)/perBlock*perBlock+1;
	     
	endPage=startPage+perBlock-1;
	    
	//만약 페이지가 23까지 있다면 25가 아니다.
	if(endPage>totalPage){
		endPage=totalPage;
	}
	//1페이지: 시작번호=0,2페이지:5 ,3페이지:10 ...
	startNum=(currentPage-1)*perPage;
	
	//각페이지 출력할 시작번호 구하기
	//총글 갯수가 23이면 1체이지 23 / 18 / 13 / 8 / 3
	no=totalCount-(currentPage-1)*perPage;
	
	//페이지에서 보여질 글만 가져오기
	List<SimpleBoardDto>list=dao.getPagingList(startNum, perPage);
	
%>
<body>
<div style="margin: 30px 30px; width: 800px;">
	<button type="button" class="btn btn-outline-info"
	onclick="location.href='addform.jsp'"><i class="bi bi-pencil">글쓰기</i></button>

<br><br>
<h6><b>총 <%=totalCount %>개의 게시글이 있습니다.</b></h6>
<table class="table table-bordered">
	<caption align="top"><b>간단 게시판 목록</b></caption>
	<tr>
		<th width="60">번호</th>
		<th width="360">제목</th>
		<th width="100">작성자</th>
		<th width="150">작성일</th>
		<th width="60">조회</th>
	</tr>
	
	<%
	if(list.size()==0){
		%>
		<tr>
			<td colspan="5" align="center">
			<h6><b>등록된 게시물이 없습니다</b></h6>
			</td>
		</tr>
		<%
	}else{
		
		for(int i=0;i<list.size();i++){
			SimpleBoardDto dto=list.get(i);
			%>
			<tr>
				<td align="center"><%=no-- %></td>
				<td><a href="detailview.jsp?num=<%=dto.getNum() %>"><%=dto.getSubject() %></a></td>
				<td align="center"><%=dto.getWriter() %></td>
				<td align="center"><%=sdf.format(dto.getWriteday()) %></td>
				<td align="center"><%=dto.getReadcount() %></td>
			</tr>
			<%
		}
		
	}
	
	%>
</table>
<!-- 페이지 번호 출력 -->
<div>
	<ul class="pagination justify-content-center">
	<%
		//이전
		if(startPage>1){
			%>
			<li>
				<a class="page-link" href="boardlist.jsp?currentPage=<%=startPage-1 %>" aria-label="Previous">
					<span aria-hidden="true">&laquo;</span>
        		</a>
        	</li>
			<%
		}
		for(int pp=startPage;pp<=endPage;pp++){
			
			if(pp==currentPage){
				%>
				<li class="page-item active">
					<a class="page-link" href="boardlist.jsp?currentPage=<%=pp %>"><%=pp %></a>
				</li>
				<%
			}else{
				%>
				<li>
					<a class="page-link" href="boardlist.jsp?currentPage=<%=pp %>"><%=pp %></a>
				</li>
				<%
			}
		}
		if(totalPage>endPage){
			%>
			<li class="page-item">
      			<a class="page-link" href="boardlist.jsp?currentPage=<%=endPage+1 %>" aria-label="Next">
        			<span aria-hidden="true">&raquo;</span>
      			</a>
    		</li>
			<%
		}
	
	%>
 	</ul>
</div>




</div>
</body>
</html>