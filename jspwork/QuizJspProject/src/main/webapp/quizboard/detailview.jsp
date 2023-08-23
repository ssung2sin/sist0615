<%@page import="db.quizboard.QuizBoardDto"%>
<%@page import="java.text.SimpleDateFormat"%>
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
<style type="text/css">

</style>
</head>
<body>
<jsp:useBean id="dao" class="db.quizboard.QuizBoardDao"/>
<%
	//num을 읽는다
	String num=request.getParameter("num");
	System.out.println(num);

	//dao선언
	//조회수 1증가
	dao.updateReadCount(num);
	
	//dto
	QuizBoardDto dto=dao.getQuizBoard(num);
	
	//날짜형식
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
%>
<div style="margin: 30px 30px;">
	<table>
    	<tr><td width='400' style='margin:20px;' id='subject'><h3><%=dto.getTitle() %></h3></td></tr>
        <tr><td id='writer'><%=dto.getWriter() %></td></tr>
        <tr><td style='color:gray'><%=sdf.format(dto.getWriteday()) %>
        &nbsp;&nbsp;조회: <%=dto.getReadcount() %></td></tr>
        <tr><td><hr style='width:500px; border:2px solid gray; left:20px;'></td></tr>
        <!-- pre태그안에 쓰거나 replace()이용한다:db저장시 br태그가 \n으로 저장된다...
        그러므로 다시 br로 변환한다 -->
        <tr>
        	<td>
        		<%=dto.getContent().replace("\n","<br>")%>
        	</td>
        </tr>
       <%--  <tr><td><pre id='story'><%=dto.getStory() %></pre></td></tr> --%>
       	<tr>
      		<td align="right">
      		<br><br>
      			<button type="button" class="btn btn-outline-success"
      			onclick="location.href='quizform.jsp'"><i class="bi bi-pencil-fill"></i>글쓰기</button>
      			<button type="button" class="btn btn-outline-success"
      			onclick="location.href='quizlist.jsp'"><i class="bi bi-card-list"></i>목록</button>
<%--       			<button type="button" class="btn btn-outline-success"
      			onclick="location.href='updatepassform.jsp?num=<%=dto.getQ_num()%>'"><i class="bi bi-pencil-square"></i>수정</button>
      			<button type="button" class="btn btn-outline-success"
      			onclick="location.href='deletepassform.jsp?num=<%=dto.getQ_num()%>'"><i class="bi bi-trash"></i>삭제</button> --%>
       		</td>
       	</tr>
	</table>
</div>
</body>
</html>