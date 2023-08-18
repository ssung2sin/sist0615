<%@page import="java.util.Arrays"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.NumberFormat"%>
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
<link href="https://fonts.googleapis.com/css2?family=Dongle:wght@300&family=Nanum+Pen+Script&family=Noto+Serif+KR:wght@200&display=swap&family=Sunflower:wght@300&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<style>
   th{
      font-family: Noto Serif KR;
   }
   caption{
        font-family: Noto Serif KR;
        font-size: 1.2em;
   }
   table.information1,table.information2{
      margin: 50px;
      float: left;
   }
   .click,caption>a{
      cursor: pointer;
   }
   tr{
      text-align: center;
   }
   .detail{
         background-color: white;
      position: absolute;
      margin: 50px 50px;
      border: 2px solid black;
      width: 700px;
      height: 620px;
   }
   .detail_stu{
      background-color: white;
      position: absolute;
      margin: 50px 50px;
      border: 2px solid black;
      width: 700px;
      height: 650px;
   }
   .detail_admin{
      background-color: white;
      position: absolute;
      margin: 50px 50px;
      border: 2px solid black;
      width: 700px;
      height: 680px;
   }
   table.info{
      position: absolute;
      top: 30px;
      left: 170px;
   
   }
   img.image{
      position: absolute;
      top: 30px;
      left: 20px;
      border: 1px solid gray;
      width: 125px;
      height: 160px;
   }
   table.subject{
      position: absolute;
      top: 200px;
      left: 20px;
   }
   .modal{
      overflow: hidden;
   }
   .modal-dialog{
      margin-right: 0px;
      margin-left: 340px;
   }
   .navbar{
      background-color: #666666;
   }
   ul.dropdown-menu{
      background-color: #808080;
      opacity: 0.87;
   }
   a.dropdown-item:hover{
      background-color: #646464;
      color: white;
   }
   nav b,.dropdown-item{
      color: white;
   }
</style>

<script type="text/javascript">
   $(function() {
      <%
      request.setCharacterEncoding("utf-8");
      
      MyschoolDao dao_getSchool=new MyschoolDao();
      MyschoolDao dao_getSubject=new MyschoolDao();
      String thisNum=request.getParameter("thisNum");
      thisNum=(thisNum==null?"2":thisNum);
      //System.out.println(thisNum);
       
      MyschoolDto dto_getSchool=dao_getSchool.getNumSchool(thisNum);
      MyschoolDto dto_getSubject=dao_getSchool.getNumSubject(thisNum);
      
      if((String)session.getAttribute("modal")!=null){
         %>
         $("img.image").attr("src","<%=dto_getSchool.getMyimg() %>");
         $("#modal-open").click();
         <%session.removeAttribute("modal");}
      else if((String)session.getAttribute("stuUpdate")!=null){
         %>
         $("#update-modal").click();
         <%
         session.removeAttribute("stuUpdate");
         }
      else if((String)session.getAttribute("adminUpdate")!=null){
         %>
         $("#admin-modal").click();
         <%
         session.removeAttribute("adminUpdate");
         }%>
   });
</script>

<body>
   <%
   MyschoolDao dao=new MyschoolDao();
   ArrayList<MyschoolDto> list=dao.getAllDatas();
   SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
   NumberFormat nf = new DecimalFormat("0.##");
   %>
   <!-- A grey horizontal navbar that becomes vertical on small screens -->
   <nav class="navbar navbar-expand-sm" style="font-family: Noto Serif KR;">
   
     <div class="container-fluid">
       <!-- Links -->
       <ul class="navbar-nav">
         <li class="nav-item">
           <a class="navbar-brand" href="#"><img src="../cartoon/sistgood.png" width="100" height="36"><b style="font-family: Sunflower;font-size: 1.3em;">학적관리 통합시스템</b></a>
         </li>
         <li class="nav-item dropdown">
         <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"><b>학사일정</b></a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">시험기간</a></li>
            <li><a class="dropdown-item" href="#">방학기간</a></li>
            <li><a class="dropdown-item" href="#">월별 시간표</a></li>
          </ul>
        </li>
         <li class="nav-item dropdown">
         <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"><b>상벌점관리</b></a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">상벌점 조회</a></li>
            <li><a class="dropdown-item" href="#">정정 요구</a></li>
          </ul>
        </li>
         <li class="nav-item dropdown">
         <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"><b>질의응답</b></a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">학사질의</a></li>
            <li><a class="dropdown-item" href="#">기타질의</a></li>
            <li><a class="dropdown-item" href="#">자주 묻는 질문</a></li>
            <li><a class="dropdown-item" href="#">마음의 소리</a></li>
            <li><a class="dropdown-item" href="#">신고사항</a></li>
          </ul>
        </li>
       </ul>
       <form class="d-flex" action="myschoolMain.jsp" method="post">
           <input class="form-control me-2" type="text" placeholder="이름 검색 (부분 검색 가능)" name="search">
           <button class="btn btn-dark" type="submit" style="width: 80px;">검색</button>
         </form>
     </div>
   
   </nav>
   <%
   String loginName=dao.getName((String)session.getAttribute("id"));
   System.out.println("log="+loginName);
   %>
   <table class="table table-striped information1" style="width: 990px">
        <caption align="top"><b><%=loginName.equals("")||loginName.equals("나교장")?"학생":loginName+" 님" %> 정보 관리</b>&nbsp;<a id="toggle" style="font-size: 3px;">▲</a></caption>
      <tr>
         <th style="background-color: #aaaaaa;text-align: center;width: 50px">학번</th>
         <th style="background-color: #aaaaaa;text-align: center;width: 70px">아이디</th>
         <th style="background-color: #aaaaaa;text-align: center;width: 70px">이름</th>
         <th style="background-color: #aaaaaa;text-align: center;width: 150px">연락처</th>
         <th style="background-color: #aaaaaa;text-align: center;width: 120px">주소</th>
         <th style="background-color: #aaaaaa;text-align: center;width: 110px">생년월일</th>
         <th style="background-color: #aaaaaa;text-align: center;width: 90px">학년</th>
         <th style="background-color: #aaaaaa;text-align: center;width: 90px">반</th>
         <th style="background-color: #aaaaaa;text-align: center;width: 110px">가입일</th>
         <th style="background-color: #aaaaaa;text-align: center;width: 130px">편집</th>
      </tr>
      <%if(list.size()!=0)
      {
         if(session.getAttribute("id")==null){
            for(int i=1;i<list.size();i++)
                {
                   MyschoolDto dto=list.get(i);%>
                   <tr class="tgl">
                      <td><%=dto.getNum() %></td>
                      <td><%=dto.getMyid() %></td>
                      <td><%=dto.getMyname() %></td>
                      <td>권한 없음</td>
                      <td>권한 없음</td>
                      <td>권한 없음</td>
                      <td>권한 없음</td>
                      <td>권한 없음</td>
                      <td>권한 없음</td>
                      <td>권한 없음</td>
                   </tr>
                <%}
         }else if(!session.getAttribute("id").equals("admin")){
            for(int i=1;i<list.size();i++)
                {
                   MyschoolDto dto=list.get(i); 
                   if(dto.getMyid().equals(session.getAttribute("id"))){%>
                   <tr class="tgl">
                      <td class="thisNum click"><%=dto.getNum() %></td>
                      <td class="click"><%=dto.getMyid() %></td>
                      <td class="click"><%=dto.getMyname() %></td>
                      <td class="click"><%=dto.getMyhp() %></td>
                      <td class="click"><%=dto.getMyaddr() %></td>
                      <td class="click"><%=sdf.format(dto.getMybirthday()) %></td>
                      <td class="click"><%=dto.getMygrade()!=null?dto.getMygrade()+"학년":"" %></td>
                      <td class="click"><%=dto.getMyclass()!=null?dto.getMyclass()+"반":"" %></td>
                      <td class="click"><%=sdf.format(dto.getWriteday()) %></td>
                      <td>
                        <button type="button" class="btn btn-outline-secondary btn-sm stuUpdate" value="<%=dto.getNum()%>">수정</button>
                     </td>
                   </tr>
                <%}}
         }else{
            for(int i=1;i<list.size();i++)
            {
               MyschoolDto dto=list.get(i); %>
               <tr class="tgl">
                  <td class="thisNum click"><%=dto.getNum() %></td>
                  <td class="click"><%=dto.getMyid() %></td>
                  <td class="click"><%=dto.getMyname() %></td>
                  <td class="click"><%=dto.getMyhp() %></td>
                  <td class="click"><%=dto.getMyaddr() %></td>
                  <td class="click"><%=sdf.format(dto.getMybirthday()) %></td>
                  <td class="click"><%=dto.getMygrade()!=null?dto.getMygrade()+"학년":"" %></td>
                  <td class="click"><%=dto.getMyclass()!=null?dto.getMyclass()+"반":"" %></td>
                  <td class="click"><%=sdf.format(dto.getWriteday()) %></td>
                  <%if(session.getAttribute("loginok")!=null&&session.getAttribute("idok").equals("admin"))
                  {%>
                     <td>
                        <button type="button" class="btn btn-outline-secondary btn-sm adminUpdate" value="<%=dto.getNum()%>">수정</button>
                        <button type="button" class="btn btn-outline-dark btn-sm" onclick="deleteMyschool.jsp?num=<%=dto.getNum() %>">삭제</button>
                     </td>
                  <%}else{%>
                     <td>권한 없음</td>
                  <%}%>
               </tr>
            <%}}
      }else{%>
         <tr class="tgl">
            <td colspan="10" align="center">
               <b>입력한 데이터가 없습니다</b>
            </td>
         </tr>
      <%}
      if(session.getAttribute("loginok")!=null)
      {%>
         <tr>
            <td align="right" style="background-color: #d2d2d2" colspan="10">
               <button type="button" class="btn btn-outline-dark btn-sm" onclick="location.href='../login/logoutAction.jsp'">로그아웃</button>
            </td>
         </tr>
      <%}else{%>
         <tr>
            <td align="right" style="background-color: #d2d2d2" colspan="10">
               <button type="button" class="btn btn-outline-dark btn-sm" onclick="location.href='../login/loginForm.jsp'">로그인</button>
            </td>
         </tr>
      <%} %>
   </table>
   
   <div id="search">
      <table class="table table-striped information2" style="width: 150px">
            <caption align="top"><b>검색 결과</b>&nbsp;<a style="font-size: 3px;">▲</a></caption>
            <tr>
            <th style="background-color: #aaaaaa;text-align: center;width: 50px">학번</th>
            <th style="background-color: #aaaaaa;text-align: center;width: 100px">이름</th>
         </tr>
      <%      
      String search_name=request.getParameter("search");
         System.out.println(search_name);
      
       MyschoolDao search_dao=new MyschoolDao();
      ArrayList<MyschoolDto> search_list=search_dao.searchFromName(search_name);
      
       if(search_name==null||search_name.equals(""))
       {%>
          <tr class="tgl">
             <td colspan="2" align="center">검색 대기중</td>
          </tr>
       <%}else if(search_list.size()!=0){
         for(int i=0;i<search_list.size();i++)
         {
            MyschoolDto search_dto=search_list.get(i);%>
            <tr class="tgl">
               <td class="thisNum click"><%=search_dto.getNum() %></td>
               <td class="click"><%=search_dto.getMyname() %></td>
            </tr>
         <%}
      }else{%>
         <tr class="tgl">
            <td colspan="2" align="center">검색결과 없음</td>
         </tr>
      <%} %>         
      </table>
   </div>
   
   <!-- The Modal -->
<div class="modal" id="myModal">
  <div class="modal-dialog">
    <div class="modal-content">

     <div class="detail">
   <form action="updateAction">
   <img class="image" src="<%=dto_getSchool.getMyimg()%>" style="width: 125px; height: 160px;">
      <table class="table table-bordered info" style="width: 500px;">
         <tr>
            <th width="100" style="background-color: #E2E2E2;">이름</th>
            <td><%=dto_getSchool.getMyname()%></td>
            <th width="100" style="background-color: #E2E2E2;">아이디</th>
            <td><%=dto_getSchool.getMyid()%></td>
         </tr>
         <tr>
            <th style="background-color: #E2E2E2;">연락처</th>
            <td width="150"><%=dto_getSchool.getMyhp()%></td>
            <th style="background-color: #E2E2E2;">생년월일</th>
            <td><%=(dto_getSchool.getMybirthday()!=null?sdf.format(dto_getSchool.getMybirthday()):"")%></td>
         </tr>
         <tr>
            <th style="background-color: #E2E2E2;">주소</th>
            <td colspan="3" width="150"><%=dto_getSchool.getMyaddr()%></td>   
         </tr>
         <tr>
            <th width="100" style="background-color: #E2E2E2;">학년</th>
            <td><%=dto_getSchool.getMygrade()%>학년</td>
            <th width="100" style="background-color: #E2E2E2;">반</th>
            <td><%=dto_getSchool.getMyclass()%>반</td>
         </tr>
      </table>
      <table class="table table-bordered subject" style="width: 650px;">
         <tr align="center">
            <th width="100" style="background-color: #E2E2E2;">과목</th>
            <th width="100" style="background-color: #E2E2E2;">점수</th>
            <th width="100" style="background-color: #E2E2E2;">과목평균</th>
            <th width="100" style="background-color: #E2E2E2;">과목석차</th>
         </tr>
         <tr align="center">
            <td>국어</td>
            <td><%=dto_getSubject.getKorean()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("korean")))%></td>
            <td><%=dao.sortSubject("korean",dao.totStudent(),dto_getSubject.getKorean()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr align="center">
            <td>영어</td>
            <td><%=dto_getSubject.getEnglish()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("english")))%></td>
            <td><%=dao.sortSubject("english",dao.totStudent(),dto_getSubject.getEnglish()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr align="center">
            <td>수학</td>
            <td><%=dto_getSubject.getMath()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("math")))%></td>
            <td><%=dao.sortSubject("math",dao.totStudent(),dto_getSubject.getMath()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr align="center">
            <td>사회</td>
            <td><%=dto_getSubject.getSociety()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("society")))%></td>
            <td><%=dao.sortSubject("society",dao.totStudent(),dto_getSubject.getSociety()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr align="center">
            <td>과학</td>
            <td><%=dto_getSubject.getScience()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("science")))%></td>
            <td><%=dao.sortSubject("science",dao.totStudent(),dto_getSubject.getScience()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr align="center">
            <td>음악</td>
            <td><%=dto_getSubject.getMusic()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("music")))%></td>
            <td><%=dao.sortSubject("music",dao.totStudent(),dto_getSubject.getMusic()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr align="center">
            <td>미술</td>
            <td><%=dto_getSubject.getArt()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("art")))%></td>
            <td><%=dao.sortSubject("art",dao.totStudent(),dto_getSubject.getArt()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr align="center">
            <td>체육</td>
            <td><%=dto_getSubject.getPe()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("pe")))%></td>
            <td><%=dao.sortSubject("pe",dao.totStudent(),dto_getSubject.getPe()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr align="center">
            <th width="100" style="background-color: #E2E2E2;">전과목평균</th>
            <td><%=nf.format(dao.avgSubject(thisNum)) %></td>
            <th width="100" style="background-color: #E2E2E2;">전체석차</th>
            <td><%
            int i=0;
            int rank=0;
            double avg[]=new double[dao.totStudent()];
            for(i=0;i<dao.totStudent();i++){
               String num=(i+2)+"";
               avg[i]=dao.avgSubject(num);
               }
            Arrays.sort(avg);
               for(i=0;i<dao.totStudent();i++){
                  if(avg[i]==dao.avgSubject(thisNum)){
                  break;
                  }
                  rank=dao.totStudent()-i;
               }
               rank=dao.totStudent()-i;
            %><%=rank %></td>
         </tr>
      </table>
   </form>
</div>

    </div>
  </div>
</div>
  <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#myModal"
  id="modal-open" style="display:none">
    Open modal
  </button>

<!-- The Modal -->
<div class="modal" id="stuUpdate">
  <div class="modal-dialog stuUp1">
    <div class="modal-content">

     <div class="detail_stu">
     <form action="updateAction.jsp">
     <input type="hidden" name="thisNum" value="<%=dto_getSchool.getNum()%>">
   <img class="image" src="<%=dto_getSchool.getMyimg()%>" style="width: 125px; height: 160px;">
      <table class="table table-bordered info" style="width: 500px;">
         <tr>
            <th width="100" style="background-color: #E2E2E2;">이름</th>
            <td><%=dto_getSchool.getMyname()%></td>
            <th width="100" style="background-color: #E2E2E2;">아이디</th>
            <td><%=dto_getSchool.getMyid()%></td>
         </tr>
         <tr>
            <th style="background-color: #E2E2E2;">연락처</th>
            <td><input type="text" name="myhp" style="width: 120px;"
            required="required" value="<%=dto_getSchool.getMyhp() %>"></td>
            <th style="background-color: #E2E2E2;">비밀번호</th>
            <td><input type="password" name="mypass" style="width: 120px;"
            required="required" value="<%=dto_getSchool.getMypass()%>"></td>
         </tr>
         <tr>
            <th style="background-color: #E2E2E2;">주소</th>
            <td><input type="text" name="myaddr" style="width: 120px;"
            required="required" value="<%=dto_getSchool.getMyaddr() %>"></td>   
         <th style="background-color: #E2E2E2;">생년월일</th>
            <td><%=(dto_getSchool.getMybirthday()!=null?sdf.format(dto_getSchool.getMybirthday()):"")%></td>         
         </tr>
         <tr>
            <th width="100" style="background-color: #E2E2E2;">학년</th>
            <td><%=dto_getSchool.getMygrade()%>학년</td>
            <th width="100" style="background-color: #E2E2E2;">반</th>
            <td><%=dto_getSchool.getMyclass()%>반</td>
         </tr>
      </table>
      <table class="table table-bordered subject" style="width: 650px;">
         <tr align="center">
            <th width="100" style="background-color: #E2E2E2;">과목</th>
            <th width="100" style="background-color: #E2E2E2;">점수</th>
            <th width="100" style="background-color: #E2E2E2;">과목평균</th>
            <th width="100" style="background-color: #E2E2E2;">과목석차</th>
         </tr>
         <tr align="center">
            <td>국어</td>
            <td><%=dto_getSubject.getKorean()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("korean")))%></td>
            <td><%=dao.sortSubject("korean",dao.totStudent(),dto_getSubject.getKorean()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr align="center">
            <td>영어</td>
            <td><%=dto_getSubject.getEnglish()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("english")))%></td>
            <td><%=dao.sortSubject("english",dao.totStudent(),dto_getSubject.getEnglish()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr align="center">
            <td>수학</td>
            <td><%=dto_getSubject.getMath()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("math")))%></td>
            <td><%=dao.sortSubject("math",dao.totStudent(),dto_getSubject.getMath()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr align="center">
            <td>사회</td>
            <td><%=dto_getSubject.getSociety()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("society")))%></td>
            <td><%=dao.sortSubject("society",dao.totStudent(),dto_getSubject.getSociety()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr align="center">
            <td>과학</td>
            <td><%=dto_getSubject.getScience()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("science")))%></td>
            <td><%=dao.sortSubject("science",dao.totStudent(),dto_getSubject.getScience()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr align="center">
            <td>음악</td>
            <td><%=dto_getSubject.getMusic()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("music")))%></td>
            <td><%=dao.sortSubject("music",dao.totStudent(),dto_getSubject.getMusic()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr align="center">
            <td>미술</td>
            <td><%=dto_getSubject.getArt()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("art")))%></td>
            <td><%=dao.sortSubject("art",dao.totStudent(),dto_getSubject.getArt()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr align="center">
            <td>체육</td>
            <td><%=dto_getSubject.getPe()%></td>
            <td><%=nf.format((dao.gradeAvgSubject("pe")))%></td>
            <td><%=dao.sortSubject("pe",dao.totStudent(),dto_getSubject.getPe()) %>/<%=dao.totStudent() %></td>
         </tr>
         <tr>
            <td colspan="4" align="right"><button type="submit" class="btn btn-success">수정</button>
            <button type="button" class="btn btn-danger" 
            onclick="location.href='myschoolMain.jsp?thisNum=<%=dto_getSchool.getNum()%>'">취소</button></td>
         </tr>
      </table>
     </form>
</div>


    </div>
  </div>
</div>
  <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#stuUpdate"
  id="update-modal" style="display:none">
    Open modal
  </button>

   <!-- The Modal -->
<div class="modal" id="adminUpdate">
  <div class="modal-dialog adminUp1">
    <div class="modal-content">

     <div class="detail_admin">
   <form action="adminUpdate.jsp">
   <input type="hidden" name="thisNum" value="<%=dto_getSchool.getNum()%>">
   <img class="image" src="<%=dto_getSchool.getMyimg()%>" style="width: 125px; height: 160px;">
      <table class="table table-bordered info" style="width: 500px;">
         <tr>
            <th width="100" style="background-color: #E2E2E2;">이름</th>
            <td><%=dto_getSchool.getMyname()%></td>
            <th width="100" style="background-color: #E2E2E2;">아이디</th>
            <td><%=dto_getSchool.getMyid()%></td>
         </tr>
         <tr>
            <th style="background-color: #E2E2E2;">연락처</th>
            <td width="150"><%=dto_getSchool.getMyhp()%></td>
            <th style="background-color: #E2E2E2;">생년월일</th>
            <td><%=(dto_getSchool.getMybirthday()!=null?sdf.format(dto_getSchool.getMybirthday()):"")%></td>
         </tr>
         <tr>
            <th style="background-color: #E2E2E2;">주소</th>
            <td colspan="3" width="150"><%=dto_getSchool.getMyaddr()%></td>   
         </tr>
         <tr>
            <th width="100" style="background-color: #E2E2E2;">학년</th>
            <td><input type="text" name="mygrade" style="width: 120px;"
            required="required" value="<%=dto_getSchool.getMygrade()%>"></td>
            <th width="100" style="background-color: #E2E2E2;">반</th>
            <td><input type="text" name="myclass" style="width: 120px;"
            required="required" value="<%=dto_getSchool.getMyclass()%>"></td>
         </tr>
      </table>
      <table class="table table-bordered subject" style="width: 650px;">
         <tr align="center">
            <th width="200" style="background-color: #E2E2E2;">과목</th>
            <th width="200" style="background-color: #E2E2E2;">점수</th>
         </tr>
         <tr align="center">
            <td>국어</td>
            <td><input type="text" name="korean" style="width: 80px;"
            required="required" value="<%=dto_getSubject.getKorean()%>"></td>
         </tr>
         <tr align="center">
            <td>영어</td>
            <td><input type="text" name="english" style="width: 80px;"
            required="required" value="<%=dto_getSubject.getEnglish()%>"></td>
         </tr>
         <tr align="center">
            <td>수학</td>
            <td><input type="text" name="math" style="width: 80px;"
            required="required" value="<%=dto_getSubject.getMath()%>"></td>
         </tr>
         <tr align="center">
            <td>사회</td>
            <td><input type="text" name="society" style="width: 80px;"
            required="required" value="<%=dto_getSubject.getSociety()%>"></td>
         </tr>
         <tr align="center">
            <td>과학</td>
            <td><input type="text" name="science" style="width: 80px;"
            required="required" value="<%=dto_getSubject.getScience()%>"></td>
         </tr>
         <tr align="center">
            <td>음악</td>
            <td><input type="text" name="music" style="width: 80px;"
            required="required" value="<%=dto_getSubject.getMusic()%>"></td>
         </tr>
         <tr align="center">
            <td>미술</td>
            <td><input type="text" name="art" style="width: 80px;"
            required="required" value="<%=dto_getSubject.getArt()%>"></td>
         </tr>
         <tr align="center">
            <td>체육</td>
            <td><input type="text" name="pe" style="width: 80px;"
            required="required" value="<%=dto_getSubject.getPe()%>"></td>
         </tr>
         <tr>
            <td colspan="2" align="right"><button type="submit" class="btn btn-success">수정</button>
            <button type="button" class="btn btn-danger" 
            onclick="location.href='myschoolMain.jsp?thisNum=<%=dto_getSchool.getNum()%>'">취소</button></td>
         </tr>
      </table>
   </form>
</div>
    </div>
  </div>
</div>
  <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#adminUpdate"
  id="admin-modal" style="display:none">
    Open modal
  </button>

   
   <script>   
      $(".click").click(function(){
         var thisNum=$(this).parent().children("td.thisNum").text();
         //alert(thisNum);
         location.href="detaildec.jsp?thisNum="+thisNum;
      });
      $(".stuUpdate").click(function(){
          var thisNum=$(this).val();
          //alert(thisNum);
          location.href="updateForm.jsp?thisNum="+thisNum;
       });
       $(".adminUpdate").click(function(){
          var thisNum=$(this).val();
          //alert(thisNum);
          location.href="adminUpdateForm.jsp?thisNum="+thisNum;
       });
      $("#toggle").on("click",function(){
         if($(this).text()=="▲"){$(this).text("▼");}
         else{$(this).text("▲");}
         $("table.information1").find("tr.tgl").fadeToggle('fast');
      });
      $("#search caption a").on("click",function(){
         if($(this).text()=="▲"){$(this).text("▼");}
         else{$(this).text("▲");}
         $("table.information2").find("tr.tgl").fadeToggle('fast');
      });
   </script>
</body>
</html>