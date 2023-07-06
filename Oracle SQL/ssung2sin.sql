--emp테이블에서 ename만 조회하시오
select ename from emp;
--emp테이블에서 이름과 직업만 조회하시오
select ename,job from emp;
--emp테이블 전체조회
select * from emp;
--student 테이블 전체조회
select * from student;
--표현식 //하나의 표현식 column이 더생김
select name,'지금 실습중' from student;
--컬럼 별칭 allias출력
select name "이름",grade as "학년", birthday 생일 from student;
--emp에서 사원명, 직업, 입사일자 을 조회하시오
select ename "사원명",job 직업,hiredate as "입사일자" from emp;
--DISTINCT:중복된 값을 제거하고 출력하기
--EMP에서 직업군을 중복하지말고 출력
select DISTINCT job 직업군 from emp;
--emp에서 부서번호를 중복없이 출력
select DISTINCT deptno 부서번호 from emp;
--합성연산자: 컬럼을 붙여서 출력
select name ||grade 학년별학생명 from student;
--professor 전체조회
select * from professor;
--하나의 컬럼으로 출력_조인형 님은 정교수 입니다.
select name || '님은' || position || '입니다' 교수별직급 from professor;
--smith님의 job은 clerk 입니다.
select ename||'님의 job은 ' || job||' 입니다' from emp;
--student에서 서진수님의 키는 180cm, 몸무게는 72kg입니다.
select name||'님의 키는 '||height||'cm, 몸무게는 '||weight||'kg입니다.' from student;
--emp에서 내직업은 slaesman 이고 연봉은 ***입니다.
select '내직업은 '||job||'이고 연봉은 '||sal||'입니다.' from emp;
--정렬
--student에서 학생명 학년 생일을 학생명의 오름차순으로 조회하시오. asc : 오름차순 (생략가능) / desc : 내림차순
select name 학생명,grade 학년,birthday 생일 from student order by name asc;
select name 학생명,grade 학년,birthday 생일 from student order by birthday;

--emp에서 사원명,직업,급여를 급여가 낮은 사람 순으로 조회
select ename 사원명, job 직업,sal 급여 from emp order by 3 desc;--컬럼번호로도 정렬가능
--emp에서 직업군을 중복없이 출력하고 직업군의 오름차순으로 출력하시오
select DISTINCT job from emp order by 1;

--산술연산자
--emp에서 sal에 특별보너스 100을 더하여 출력하시오
select ename 사원명,sal 기본급,sal+100 특별보너스 from emp;

--where절 : 조건
--emp에서 10번부서의 근무하시는 사람의 사원명, 급여와 부서번호를 출력하세요
select ename 사원명,sal 급여,deptno 부서번호 from emp where deptno=10;
--emp에서 이름이 KING인 사람의 사원명, 직업을 조회하시오
select ename 사원명,job 직업 from emp where ename='KING';
--emp에서 급여가 3000이상인 사람의 사원명 급여를 조회하시오
select ename 사원명,sal 급여 from emp where sal>=3000;
--학생테이블에서 키가 180이상인 학생명 , 키 를 출력
select name 학생명,height 키 from student where height>=180;
--키가 160~180사이인 학생명과 키 출력 between a and b // a가 작은숫자부터
select name 학생명,height 키 from student where height between 160 and 180 order by height;
--in(a,b) : a b만 조회
--emp에서 deptno가 20,30인 사람의 사원명과 부서번호 조회
select ename 사원명,deptno 부서번호 from emp where deptno in(20,30);
--null값만 출력
--emp에서 comm이 null인 사람의 이름과 보너스를 출력하시오
select ename 사원명,comm 보너스 from emp where comm is null;
--emp에서 comm이 null이 아닌 사람의 이름과 보너스를 출력하시오
select ename 사원명,comm 보너스 from emp where comm is not null;

--NVL : null값 바꾸기
select ename 사원명,nvl(comm,0) 보너스 from emp;

--Like 연산자 // %김 : 김으로 끝나는 / 김% : 김으로 시작하는 / %김% : 김을 포함하는
--학생테이블에서 김씨만 조회
select * from student where name like '김%';
--학생 테이블 총 몇명? count(*) 전체의 열
select count(*) cnt from student;

--emp에서 job이 salesman,manager인 사원명,직업군만 출력하세요.(or in연산자)
select ename 사원명,job 직업군 from emp where job in('SALESMAN','MANAGER');
select ename 사원명,job 직업군 from emp where job='SALESMAN' or job='MANAGER';
--emp에서 급여가 2000 ~3000 인 사원명,직업군,급여를 출력하세요(and between연산자)
select ename 사원명,job 직업군, sal 급여 from emp where sal between 2000 and 3000 order by 3;
select ename 사원명,job 직업군, sal 급여 from emp where sal>=2000 and sal<=3000 order by 3;

--Q.student 테이블에서 1학년의 학생명,키를 출력하시오(단 키가 작은 순)
select name 학생명,height 키 from student order by height;
--Q.student 에서 2학년 학생의 학생명 생일 키 몸무게를 출력하시오(단 생일이 빠른 순서)
select name 학생명,birthday 생일,height 키,weight 몸무게 from student order by birthday;
--Q.professor에서 교수들의 이름 중 조 씨 성을 가진 교수의 교수명 직위 입사일자를 출력하시오
select name 교수명,position 직위,hiredate 입사일자 from professor where name like '조%';
--Q.emp에서 사원명,급여,급여*12 급여총계를 구하시오
select ename 사원명,sal 급여,sal*12 "급여*12",nvl(comm,0) 보너스,sal*12+nvl(comm,0) 급여총계 from emp;
--Q.emp에서 입사일자가 1982/01/01 이후에 들어온 사람의 사원명과 입사일자를 조회하시오(입사일자순)
select ename 사원명,hiredate 입사일자 from emp where hiredate>='82/01/01' order by hiredate;
--Like % ,_ 언더바 이용해서 특정순번에 있는 글을 출력
--emp에서 사원명이 두번째글자가 A인 사람의 사원명 출력
select ename 사원명 from emp where ename like '__A%';

--emp에서 사원명이 2번째 글자가 A인 사람 또는 3번째 글자가 A인 사람 사원명 출력
select ename 사원명 from emp where ename like '_A%' or ename like '__A%';

--날짜 리터럴 ' ' 반드시 사용
--emp에서 직급이 clerk 이고 입사일이 87/05/23일 인 사람의 사원명 입사일 구하기
select ename 사원명,hiredate 입사일 from emp where job='CLERK' and hiredate='87/05/23';

--emp에서 매니저 이거나 82년이후 입사자의 사원명 직업군 입사일 출력
select ename 사원명,job 직업군,hiredate 입사일 from emp where job='MANAGER' or hiredate>='82/01/01' order by 3;



--2시수업
--다중정렬
--student에서 1학년 학생의 이름과 키와 몸무게 출력(키는 작은사람부터 몸무게는 많은 사람부터)
select name 학생명,height 키,weight 몸무게 from student where grade=1 order by height asc,weight desc;
--emp에서 급여내림차순 후 다시 이름으로 오름차순으로_사원번호 사원명 급여 조회
select empno 사원번호,ename 사원명,sal 급여 from emp order by sal desc,ename asc;

select * from student;
--union 합집합
--unionAll 합집합+중복
--intersect 교집합

select name,deptno1,deptno2 from student where deptno1=101 union all
select name,deptno1,deptno2 from student where deptno2=201;

--Q.gogak point가 30만~50만 고객명과 포인트를 출력(포인트 많은 순)
select GNAME 고객명,POINT 포인트 from GOGAK where POINT between 300000 and 500000 order by POINT desc;

--Q.emp의 comm의 널을 0로 바꿔서 직업이 manager인 사람만 이름과 보너스 출력
select ename 이름,nvl(comm,0) 보너스 from emp where job='MANAGER';

--Q.profecssor 103번 학과 교수들의 이름과 급여,보너스,연봉을 출력
select name 이름,pay 급여,nvl(bonus,0) 보너스,pay*12+nvl(bonus,0) 연봉 from professor where deptno=103;

--SQL 그룹함수(count,sum,avg)
--count(*): null값 포함, count(컬럼) : null값 제외
--sum의 경우 null값이 있어도 합해진다.
select count(*),count(hpage) from professor;
select avg(bonus) from professor;
select sum(bonus),count(bonus) from professor;

--max min
select min(sal),max(sal) from emp;
select min(hiredate),max(hiredate) from emp;

--소수점
--emp에서 sal 평균
select round(avg(sal),1) from emp; --소수점 1자리
select round(avg(sal),2) from emp; --2자리
select round(avg(sal),0) from emp; --반올림
select round(avg(sal),-1) from emp; --10단위
select round(avg(sal),-2) from emp; --100단위


--콘솔에 출력
--현재 날짜를 콘솔에 출력
select sysdate from dual;

--내일 날짜 출력
select sysdate+1 from dual;

--to char : 날짜및 수치 데이터를 문자로 변환하기 위한 함수
--날짜에서 년도만 출력
select to_char(sysdate,'year')from dual; --영어로나옴
SELECT to_char(sysdate,'yyyy')from dual; --2023

select to_char(sysdate,'month')from dual; --7월
select to_char(sysdate,'mm')from dual; --07

select to_char(sysdate,'yyyy-mm-dd') from dual;

--to_char 숫자에도 적용 가능하다
select to_char(245897770,'999,999,999')from dual;

--emp
select empno 사원번호,ename 사원명,to_char(hiredate,'yyyy') 년도 from emp;

--emp에서 사원번호,사원명,급여 출력(급여는 천단위구분기호)
select empno 사원번호,ename 사원명,to_char(sal,'l99,999') 급여 from emp;

--서브쿼리
--쿼리안에 또다른 쿼리 담김(KING보다 급여를 많이 받는 사람은?)_2가지 질문
--서브쿼리가 먼저수행되어 그 결과를 메인쿼리에 전해주고 그 값을 받아 최종 메인 쿼리가 실행이 된다.
--서브쿼리 안에는 order by절 못옴.

--emp에서 KING보다 급여많이 받는 사람의 사원명 급여를 구해보자
select ename 사원명,sal 급여 from emp where sal>(select sal from emp where ename='JAMES');

--emp에서 평균급여보다 많이 받는 사람의 사원번호,사원명,급여를 나타내시오
select empno 사원번호,ename 사원명,sal 급여 from emp where sal>(select avg(sal) from emp);

--emp에서 이름이 WARD 인 사람의 MGR과 같은 값을 가진 사람의 목록 출력
select * from emp where mgr = (select mgr from emp where ename='WARD');

--emp에서 평균급여보다 많이 받는 사람수?
select count(*) from emp where sal > (select avg(sal) from emp);

--서브쿼리문제
--Q1. emp에서 ADAMS와 같은 직업군을 가진 사람의 이름 연봉 직업군 출력
select ename 이름,sal 연봉,job 직업군 from emp where job =(select job from emp where ename='ADAMS');

--Q2. emp에서 SCOTT와 같은 연봉을 받는 사람의 이름과 연봉 출력
select ename 이름,sal 연봉 from emp where sal =(select sal from emp where ename='SCOTT');

--Q3. student에서 제1전공이 일지매 학생과 동일한  학생들의 학생명 제1전공 출력
select name 학생명,deptno1 제1전공 from student where deptno1 = (select deptno1 from student where name='일지매');

--Q4. student에서 제1전공이 101인 학과의 평균몸무게가 많은 학생들의 이름과 몸무게 출력
select name 이름,weight 몸무게,deptno1 제1전공 from student where weight > (select avg(weight) from student where deptno1=101);

--Q5. professor에서 입사일이  김영조 교수보다 나중에 입사한 사람의 이름과 입사일 학과번호를 출력
select name 이름,hiredate 입사일,deptno 학과번호 from professor where hiredate > (select hiredate from professor where name='김영조');