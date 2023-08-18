<%@page import="java.text.SimpleDateFormat"%>
<%@page import="myschool.model.MyschoolDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="myschool.model.MyschoolDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Dongle:wght@300&family=Nanum+Pen+Script&family=Noto+Serif+KR:wght@200&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<style>
   a{
      text-decoration: none;
      cursor: pointer;
   }
   table{
      margin: 50px;
   }
</style>
<body>
   <%
   MyschoolDao dao=new MyschoolDao();
   ArrayList<MyschoolDto> list=dao.getAllDatas();
   SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
   %>
   <table class="table table-bordered" style="width: 900px">
      <tr>
         <th style="background-color: aqua;text-align: center">학번</th>
         <th style="background-color: aqua;text-align: center">아이디</th>
         <th style="background-color: aqua;text-align: center">이름</th>
         <th style="background-color: aqua;text-align: center">연락처</th>
         <th style="background-color: aqua;text-align: center">주소</th>
         <th style="background-color: aqua;text-align: center">생년월일</th>
         <th style="background-color: aqua;text-align: center">학년</th>
         <th style="background-color: aqua;text-align: center">반</th>
         <th style="background-color: aqua;text-align: center">가입일</th>
         <th style="background-color: aqua;text-align: center">편집</th>
      </tr>
      <%if(list.size()!=0)
      {
         for(int i=0;i<list.size();i++)
         {
            MyschoolDto dto=list.get(i); %>
            <tr>
               <td><%=dto.getNum() %></td>
               <td><%=dto.getMyid() %></td>
               <td><a><%=dto.getMyname() %></a></td>
               <td><%=dto.getMyhp() %></td>
               <td><%=dto.getMyaddr() %></td>
               <td><%=sdf.format(dto.getMybirthday()) %></td>
               <td><%=dto.getMygrade()!=null?dto.getMygrade()+"학년":"" %></td>
               <td><%=dto.getMyclass()!=null?dto.getMyclass()+"반":"" %></td>
               <td><%=sdf.format(dto.getWriteday()) %></td>
               <%if(session.getAttribute("loginok")!=null&&session.getAttribute("idok").equals("admin"))
               {%>
                  <td>
                     <button type="button" class="btn btn-success btn-sm" onclick="">수정</button>
                     <button type="button" class="btn btn-danger btn-sm" onclick="">삭제</button>
                  </td>
               <%}else{%>
                  <td>
                     권한 없음
                  </td>
               <%}%>
            </tr>
         <%}
      }else{%>
         <tr>
            <td colspan="10" align="center">
               <b>입력한 데이터가 없습니다</b>
            </td>
         </tr>
      <%}
      if(session.getAttribute("loginok")!=null)
      {%>
         <tr>
            <td align="right" style="background-color: aliceblue" colspan="10">
               <button type="button" class="btn btn-warning btn-sm" onclick="locaion.href='logoutAction.jsp'">로그아웃</button>
            </td>
         </tr>
      <%}else{%>
         <tr>
            <td align="right" style="background-color: aliceblue" colspan="10">
               <button type="button" class="btn btn-success btn-sm" onclick="location.href='../login/loginForm.jsp'">로그인</button>
            </td>
         </tr>
      <%} %>
   </table>
</body>
</html>