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
   <%
   //절대경로잡기
   String root=request.getContextPath();
   %>
	<link rel="stylesheet" type="text/css" href="<%=root %>/menu/css/font-awesome.css">
	<link rel="stylesheet" type="text/css" href="<%=root %>/menu/css/menu.css">
    
	<script type="text/javascript" src="<%=root %>/menu/js/jquery.js"></script>
	<script type="text/javascript" src="<%=root %>/menu/js/function.js"></script>
</head>
<body>
<div id="wrap">
   <header>
      <div class="inner relative">
         <a class="logo" href="#"></a>
         <a id="menu-toggle" class="button dark" href="#"><i class="icon-reorder"></i></a>
         <nav id="navigation">
            <ul id="main-menu">
               <li><a href="<%=root%>/index.jsp">Home</a></li>
               <li class="parent">
                  <a href="<%=root%>/">About 회원</a>
                  <ul class="sub-menu">
                     <li><a href="<%=root%>/index.jsp?main=login/loginmain.jsp"><i class="icon-wrench"></i>로그인</a></li>
                     <li><a href="<%=root%>/index.jsp?main=member/memberform.jsp"><i class="icon-credit-card"></i>회원가입</a></li>
                     <li><a href="<%=root%>/index.jsp?main=member/memberlist.jsp"><i class="icon-gift"></i>회원목록</a></li>
                  </ul>
               </li>
               <li><a href="<%=root%>/index.jsp?main=guest/guestlist.jsp">방명록</a></li>
               <li class="parent"><a href="#">고객의소리</a>
                  <ul class="sub-menu">
                     <li><a href="<%=root%>/index.jsp?main=board/boardlist.jsp">회원게시판</a></li>
                     <li><a href="#">스마트게시판</a></li>
                     <li><a href="#">Q&A</a></li>
                  </ul>
               </li>
               <li><a href="#">찾아오시는길</a></li>
            </ul>
         </nav>

      </div>
   </header>   
</div>    

</body></html>