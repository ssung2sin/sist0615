<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css2?family=Dongle:wght@300&family=Gaegu:wght@300&family=Nanum+Pen+Script&family=Sunflower:wght@300&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<style type="text/css">
   div.loginform{
      margin-top: 100px;
      margin-left: 200px;
   }
   input{
      margin-bottom: 9px;
   }
</style>
</head>
<%
   String myid=(String)session.getAttribute("idok");
   String saveid=(String)session.getAttribute("saveok");
   
   boolean save=true;
   
   if(saveid==null){
      myid=""; //아이디 저장을 체크하지 않을경우 아이디 없앤다
      save=false;
   }
%>
<body>
   <div class="loginform">
      <form action="loginAction.jsp" method="post" class="form-inline">
         <table>
            <caption align="top" style="font-size:1.2em"><b>로그인</b></caption>
            <tr>
               <th style="width: 75px">아이디</th>
               <td>
                  <input type="text" name="id" style="width: 200px;" class="form-control" placeholder="아이디" required="required" value=<%=myid %>><br>
               </td>
            </tr>
            <tr>
               <th>비밀번호</th>
               <td>
                  <input type="password" name="pass" style="width: 200px;" class="form-control" placeholder="비밀번호" required="required"><br>
               </td>
            </tr>
            <tr>
               <td></td>
               <td>
                  <button type="submit" class="btn btn-success" style="width: 200px;">로그인</button><br>
                  <input type="checkbox" name="savechk" <%=save?"checked":"" %>>아이디 저장
               </td>
            </tr>
         </table>
      </form>
   </div>
</body>
</html>