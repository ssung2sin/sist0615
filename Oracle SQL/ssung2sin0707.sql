--복습
select * from emp;
--Q1. emp에서 job 종류별로 중복되지않게
select DISTINCT job from emp;

--Q2. emp테이블에서 사원명이 A나 S로 시작하는 사람만 출력해보세요(사원번호 사원명)
select empno 사원번호, ename 사원명 from emp where ename like 'A%' or ename like 'S%';

--Q3. emp에서 deptno가 10인부서만 출력하시오
select ename 사원명, deptno 부서번호 from emp where deptno=10;

--Q4.emp에서 급여(sal)가 평균보다 더 높은 사람만 사원명 급여를 출력
select ename 사원명,sal 급여 from emp where sal>(select avg(sal) from emp);

--Q5.SCOTT의 급여와 동일하거나 더 많이 받는 사람의 사원명과 급여를 출력하시오.
select ename 사원명,sal 급여 from emp where sal>=(select sal from emp where ename='SCOTT') order by 2;

--Q6.emp에서 hiredate에서 월이 5월인 사람만 사원명 입사일자를 출력하시오(to_char사용)
select ename 사원명,hiredate 입사일자 from emp where to_char(hiredate,'mm')='05';
--to_char(hiredate,'mm')='05' => hiredate의 month가 5월인 

--7월7일
--1.table 생성
--primary key는 기본 키를 의미 not null+unique를 의미한다

--test 테이블
create table test(num number(5) primary key,
name varchar(20),score number(6,2),birth date);

DESC test;
--구조보기
select * from test;

--test에 전체데이터 insert
insert into test values(1,'손석구',67.2,'1997-11-11');

--test에 일부데이터 insert
insert into test (num,name) values (2,'강호동');

--insert 에러
--무결성 제약 조건(SSUNG2SIN.SYS_C008353) 2번이 똑같이 들어가서
insert into test values(4,'이영애',68.78,'1989-11-12');

--sysdate 현재날짜 의미
insert into test values(5,'이효리',88.96,sysdate);

--alter
--나이를 저장할 column 추가, 무조건 null로 추가
--ALTER TABLE 테이블명 ADD 추가할column명 데이터타입;
alter table test add age number(5);
-- 이미 추가된 목록들은 다 null 이다.

--주소를 저장할 column을 추가하는데 초기값을 강남구라고 지정
alter table test add addr varchar2(30) default '강남구';

--주소저장 column을 30=>50으로 변경
--ALTER TABLE 테이블명 MODIFY 컬럼명 데이터타입;
alter table test modify addr varchar(50);

--age 타입을 문자열(10)으로 변경하고 초기값을 20으로 설정하기
alter table test modify age varchar2(10) default '20';
--이렇게 하면 기존값을 null, 새로 추가하는 값은 20으로 초기화됨.

insert into test (num,name) values (10,'강호동');

--num의 오름차순 출력
select * from test order by num;

--drop(삭제)
--age라는 column을 삭제
alter table test drop column age;

--addr 삭제
alter table test drop column addr;

--column명 변경
--ALTER TABLE 테이블명 RENAME COLUMN OLD컬럼명 TO NEW컬럼명;
--score=>jumsu
alter table test rename column 점수 to jumsu;

--birth=>birthday
alter table test rename column birth to birthday;

--테이블 삭제 test
drop table test;

select * from test;




--시퀀스 생성
--시퀀스 기본으로 생성, 1부터 1씩증가하는 시퀀스 생성됨
create sequence seq1;

--전체시퀀스 확인
select * from seq;

--다음 시퀀스값을 발생 콘솔에 출력
select seq1.nextval from dual;

--현재 발생한 시퀀스 값
select seq1.currval from dual;

--seq1삭제
drop sequence seq1;

--10부터 5씩 증가하는 시쿼스생성-cache값 없애기
create sequence seq2 start with 10 increment by 5 nocache;
--10부터 시작 : start with 10
--5씩 증가 : increment by 5
--cache값 없애기 nocache;

--시퀀스2 삭제
drop sequence seq2;


--seq1 시작값:5 증가값:2 끝값:30 캐시:no, cycle:y
create sequence seq1 start with 5 increment by 2 maxvalue 30 nocache cycle;

--seg2 시작값1 증가값1 cache:n
create sequence seq2 nocache;
--기본이 시작1 증가1이기때문에 굳이 안써도됨

--seq3 시작값1 증가값2 cache:n
create sequence seq3 start with 1 increment by 2 nocache;

--출력
select seq1.nextval,seq2.nextval,seq3.nextval from dual;

--제거
drop sequence seq3; 

--------------------시쿼스 1개 생성, 테이블 생성
create sequence seq_start nocache;

create table personinfo (num number(5) primary key,
name varchar2(20), job varchar2(30), gender varchar2(20),
age number(5),hp varchar2(20),birthday date);

desc personinfo;

drop table personinfo;
--birthday=>hiredate
alter table personinfo rename column birthday to hiredate;

--insert
insert into personinfo values (seq_start.nextval,'박병주','엔지니어','남자','26','010-222-3333','2023-02-11');
insert into personinfo values (seq_start.nextval,'김영준','교사','여자','28','010-222-4561','2023-01-11');
insert into personinfo values (seq_start.nextval,'이영자','연예인','남자','26','010-222-3333','2021-02-11');
insert into personinfo values (seq_start.nextval,'유재석','연예인','남자','22','010-222-3333','2021-02-11');
insert into personinfo values (seq_start.nextval,'강호동','교사','남자','31','010-111-3333','2020-02-11');
insert into personinfo values (seq_start.nextval,'하하','엔지니어','남자','27','010-222-4444','2020-02-10');
insert into personinfo values (seq_start.nextval,'김영주','프로그래머','여자','29','010-888-3333','2021-01-11');
insert into personinfo values (seq_start.nextval,'김선아','배우','여자','25','010-874-3333','2023-02-10');
insert into personinfo values (seq_start.nextval,'손흥민','축구선수','남자','30','010-2242-9235','2022-08-11');
insert into personinfo values (seq_start.nextval,'이강인','축구선수','남자','22','010-3020-3923','2022-05-11');
commit;
--최종저장 commit을 해야 최종저장이 된다. 안하면 완료한게 아니다.


--c최종인원 확인
select count(*) from personinfo;
--조회연습
select * from personinfo order by name asc;
select * from personinfo order by age desc;
select * from personinfo order by 5;
select * from personinfo order by gender,age desc;

select job from personinfo;
select DISTINCT job from personinfo;

--성이 강씨만
select * from personinfo where name like '강%';
--이름의 두번째글자가 영인사람 출력
select * from personinfo where name like '_영%';

--핸드폰 마지막 자리가 3333 인사람
select * from personinfo where hp like '%3333';

--입사일자가 1월인 사람
select * from personinfo where to_char(hiredate,'mm')='01';

--입사년이 2023년인사람
select * from personinfo where to_char(hiredate,'yyyy')='2023';

--나이가 20~30사이 출력
select * from personinfo where age between 20 and 30;
select * from personinfo where age>=20 and age<=30;

--직업이 연예인이건나 프로그래머인 사람
select * from personinfo where job in('연예인','프로그래머');

--직업이 연예인이건나 프로그래머가 아닌 사람
select * from personinfo where job not in('연예인','프로그래머');

--평균나이,소수점 한자리로 구하기
select round(avg(age),1) from personinfo;

--DB내용수정(update)
--3번 직업 나이 수정학,조건이없으면 모든 데이터가 수정된다. 조건필수!!
--update 테이블명 set 컬럼1='변경할데이터' where 컬럼2='데이터값';
update personinfo set job='간호사',age=35;
--이렇게하면 다바뀜!!
rollback;
--commit 하지만 않으면 돌릴 수 있다.

--3번만
update personinfo set job='간호사',age=35 where num=13;

--중간이름이 영씨 이면서 간호사인 사람의 젠더를 여자로 수정하기
update personinfo set gender='여자' where name like '_영%' and job='간호사';

--num이 18번인 사람의 직업을 교사로 입사일을 2000-12-24로수 수정
update personinfo set job='교사',hiredate='2000-12-24' where num=18;

commit;

--삭제
--DELETE FROM 테이블명;
delete from personinfo;
rollback;

--13번 삭제
delete  from personinfo where num=13;

--여자중에서 나이가 26세이상만 모두 삭제
delete from personinfo where gender='여자' and age>=26;

--핸드폰을 ***-****-**** tnwjd
update personinfo set hp='***-****-****';


-테이블삭제
drop table personinfo;
drop sequence seq_start;

select * from personinfo;



--dept에서 30번 부서를 시애틀로 변경
select * from dept;
update dept set loc='시애틀' where deptno='30'; 

--emp테이블에Totalsal열을 하나 더 추가(number(20)으로 줄것)
alter table emp add Totalset number(20);

--emp테이블 Totalset에 sal과 comm을 더한 가격을 수정하시오
update emp set totalset=sal+nvl(comm,0);

--emp에서 WARD 삭제
delete from emp where ename='WARD';

--product테이블에서 100번을 쵸코페이로 수정
update product set p_name='쵸코페이' where p_code=100;
select * from product;



--Group by
--professor에서 학과별로 교수들의 평균급여를 출력하시오.
select deptno, avg(pay) "평균 급여"
from professor group by deptno;

--select절에 사용된 그룹함수 이외의 컬럼이나 표현식은 반드시 group by에 사용되어야함.

--professor에서 직급별 평균보너스
select position 직급,avg(nvl(bonus,0)) "평균 보너스" from professor group by position;

--학과별 직급별로 교수들의 평균급여
select deptno,position,avg(pay) "평균 급여" from professor
group by deptno,position;

--student에서 학년별 최고키와 최고몸무게 출력
select grade,max(height) "최고 신장",max(weight) "최고 몸무게" from student
group by grade;

--교수의 직급별 총급여와 최고보너스를 구하시오
select position,sum(pay) "총 급여",max(bonus) "최고 보너스"
from professor group by position;

--emp에서 동일한 직업끼리의 사원 수 구하기
select job 직무,count(job) "사원 수" from emp
group by job;

--Having절_조건주고 검색하기_반드시 GROUP BY 뒤에!!....
--평균 급여가 2000이상인 부서의 부서번호와 평균 급여를 구하시오
--where절은 그룹함수의 비교조건으로 쓸 수 없다.
--group함수의 비교조건으로 쓰려면 having 필요!
select deptno 부서번호,avg(sal) "평균 급여"
from emp group by deptno
having avg(sal)>2000;

--professor에서 평균급여가 300이상인 학과번호와 평균급여를 구하시오.
select deptno 학과번호,avg(pay) "평균 급여"
from professor group by deptno
having avg(pay)>425;

--emp에서 job별로 sal의 평균급여를 구하시오
select job 직업,round(avg(sal),2) 평균급여
from emp
group by job;

--profecssor에서 직급별 총급여를 구하시오
select position 직급,sum(pay)
from professor
group by position;


--emp에서 직업별 인원 수 최대급여 최소급여 출력하세여(job의 오름차순)
select job 직업,count(*) "인원 수",max(sal) "최대 급여",min(sal) "최소 급여"
from emp group by job order by job;

--emp에서 입사년도 그룹별로 출력(입사년도,인원수,급여평군(소수첨1자리) _ 입사년도 오름차순
select to_char(hiredate,'yyyy') 입사년도,count(*) 인원수, round(avg(sal),1) 급여평균
from emp group by to_char(hiredate,'yyyy') 
order by to_char(hiredate,'yyyy');

--Rollup함수
--자동으로 소계/합계 구해주는 함수
--group by절에 주어진 조건으로 소계값을 구해준다
select deptno 학과번호,position 직위,sum(pay) 총급여 
from professor
group by position,rollup(deptno);

select deptno 학과번호,position 직위,sum(pay) 총급여 
from professor
group by deptno,rollup(position);

select deptno,position,count(*),sum(pay)
from professor
group by rollup(deptno,position);

--cube함수
--rollup처럼 각소계에 전체총계까지 구해준다

select deptno,position, count(*),sum(pay)
from professor
group by cube(deptno,position);

--오늘의 총복습
--Q1. emp에서 평균연봉이 2000이상인 부서의 부서번호와 평균급여를 구하시오
select deptno 부서번호, round(avg(sal),1)
from emp group by deptno
 having avg(sal)>2000;
 
 --Q2. emp에서 deptno가 deptno별 10,20,30인 부서의 개수는?
 select deptno, count(*)
 from emp group by deptno;

--Q3. emp에서 job별 인원수를 구하시오(단 인원이 2명이상인곳만 구할것)
select job, count(*) from emp
group by job having count(*)>=2;

--Q4. emp에서 job별로 급여합계를 구하는데(president는 제외할것) 급여합계가 5000이상만 구하시고 급여합계가 높은것부터 출력
select job, sum(sal) from emp
where job not in ('PRESIDENT')
group by job
having sum(sal)>=5000
order by sum(sal);

--제약조건
--테이블 생성 pk = primary key
create table sawon(num number(5) CONSTRAINT sawon_pk_num primary key,
name varchar2(20),
gender varchar2(10),
buseo varchar2(20) CONSTRAINT sawon_ck_buseo check(buseo in('홍보부','인사부','교육부')),
pay number(10) default 2000000);

--시퀀스 생선
create sequence seq_sawon nocache;

--데이터 10정도 insert
--insert into swaon values(seq_sawon.nextval,'이영미','여자','게임개발부',3500000);
insert into sawon values(seq_sawon.nextval,'이영미','여자','인사부',3500000);
insert into sawon values(seq_sawon.nextval,'김영철','남자','홍보부',3100000);
insert into sawon values(seq_sawon.nextval,'이건희','남자','교육부',2900000);
insert into sawon values(seq_sawon.nextval,'윤영철','남자','홍보부',2800000);
insert into sawon values(seq_sawon.nextval,'전소미','여자','인사부',4200000);
insert into sawon values(seq_sawon.nextval,'신영미','여자','인사부',3800000);
insert into sawon values(seq_sawon.nextval,'윤건영','남자','홍보부',3200000);
insert into sawon values(seq_sawon.nextval,'김남희','남자','교육부',2600000);
insert into sawon values(seq_sawon.nextval,'홍미나','여자','교육부',3000000);
insert into sawon values(seq_sawon.nextval,'이수연','여자','교육부',3500000);
commit;

--부서별 인원수와 최고급여,최저급여 조회
select buseo 부서,count(*) ,max(pay) 최고급여,min(pay) 최저급여
from sawon group by buseo;

--위의 쿼리문에서 최고급여,최저급여에 화폐단위 붙히고 3자리 컴마도 나오게 해주세요
select buseo 부서,count(*) ,to_char(max(pay),'L999,999,999') 최고급여,
to_char(min(pay),'L999,999,999') 최저급여
from sawon group by buseo;

--성별 인원수와 평균급여를 출력하시오(인원수 뒤에 명 이라고 나오도록..)
select gender 성별,count(*)||'명' 총인원, avg(pay) from sawon
group by gender;

--부서별 인원수와 평균급여를 구하되 인원이 4명이상인 경우에만 출력되도록 하세요
select buseo, count(*)||'명',round(avg(pay),2) from sawon
group by buseo
having count(*)>=4;

select * from sawon;

desc sawon;
