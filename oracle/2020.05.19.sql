-- 2020.05.19

-- 특정 데이터를 축출하기 : where 절을 이용
-- select 컬럼명 from 테이블 이름 where 조건(true/false)

-- 전체 사원중의 월 급여가 3000이상인 사원의 이름 리스트
select ename, sal
from emp
where sal >= 3000
;

-- 전체 사원 중 10번 부서의 소속 사원의 이름과 직급을 출력
select ename, job
from emp
where deptno=10
;

-- 컬럼의 값과 일치 여부 확인 : =
select *
from emp
where deptno=10
;

-- 문자열 표현 : ' 작은 따옴표로 묶는다.
select *
from emp
where job = 'MANAGER'
;
select *
from emp
where ename = 'SCOTT'
;

select *
from emp
where hiredate = '80-12-17' -- 날짜를 비교할 때 -> '작은 따옴표 이용'
;


-- 논리 연산자 : and
-- 10번 부서 소속인 사원들 중에서
-- 직급이 MANAGER인 사람을 검색하여
-- 사원명, 부서번호, 직급을 출력하려고 한다면
-- 조건1 : 10번 부서 소속 -> deptno=10
-- 조건2 : job='MANAGER'

select * --ename, deptno, job 
from emp
where deptno=10 and job='MANAGER'
;

-- 논리연산자 : or
-- 10번 부서에 소속된 사원 "이거나" -> or
-- 직급이 MANAGER인 사람을 검색하여
-- 사원명, 부서번호, 직급을 출력합시다.
-- 조건1 : 10번 부서 소속 -> deptno=10
-- 조건2 : job='MANAGER'

select ename, deptno, job
from emp
where deptno=10 or job='MANAGER'
;

-- 논리연산자 : NOT
-- 부서번호가 10번이 아닌 사원의
-- 사원이름, 부서번호, 직급을 출력

select * 
from emp
-- where deptno != 10
-- where deptno <> 10
where not deptno=10
;

-- 범위 연산 : 논리연산의 사용 and
-- 2000에서 3000사이의 급여를 받는 사원의 정보를 출력
select *
from emp
where sal >= 2000 and sal <= 3000
;

-- 범위 연산자 : between A and B -> A 이상 B 이하
-- 2000에서 3000 사이의 급여를 받는 사원의 정보를 출력
select *
from emp
where sal BETWEEN 2000 and 3000
;

-- 2000을 초과하고 3000 미만의 급여를 받는 사원
-- sal>2000 and sal<3000
-- sal between 2001 and 2999

select *
from emp
-- where sal>2000 and sal<3000
where sal between 2000 and 3000
;

-- 1987년 입사자 리스트를 출력
select *
from emp
-- where hiredate > '1987-01-01' -- 1987년 이후
-- where hiredate >= '1981-01-01' and hiredate <= '1981-12-31'
where hiredate between '1981-01-01' and '1981-12-31'
;

-- or 연산을 간소화시키는 IN 연산자
-- 컬럼 이름 IN(데이터1, 데이터2, 데이터3, ...)
-- 컬럼 = 데이터1 or 컬럼 = 데이터2 or 컬럼 = 데이터3 or ...

-- 커미션이 300이거나 500이거나 1400인 사원을
-- 검색하기 위해서 IN 연산자를 사용
select *
from emp
-- where comm=300 or comm=500 or comm=1400
where comm in(300, 500, 1400)
;

-- 패턴 검색 : like 연산자
-- 컬럼이름 like 패턴
-- 패턴 : %, _
-- % -> 0개 이상 문자열이 가능하다
-- 's%' : s로 시작하는 문자열을 찾음
-- '%s' : s로 끝나는 문자열을 찾음
-- '%s%' : s를 포함하는 문자열을 찾음

-- 이름이 s로 시작하는 사원의 리스트
select *
from emp
--where ename like 'S' -- ename='S'
--where ename like 'S%'
--where ename like '%IN'
where ename like '%AR%'
;

-- _ -> 1개의 자리수에 어떠한 문자가 와도 가능하다
select *
from emp
-- where ename like '_A%'
-- where ename like '__A%'
where ename like '%E_'
;

-- null 값 확인을 위한 연산자 : is null, is not null
-- 컬럼명 is null : 해당 컬럼의 값이 null인 경우 true
-- 컬럼명 is not null : 해당 컬럼의 값이 null이 아닌 경우 true
select ename, comm
from emp
-- where comm is null
where comm is not null
;

-- row의 정렬
-- 오름차순 : 작은 쪽에서 -> 큰 쪽, asc(생략 가능, 기본 값)
-- 내림차순 : 큰 쪽 -> 작은 쪽, desc(명시적 사용)
select ename, sal, hiredate, comm
from emp
-- where empno>0
-- order by ename asc -- 문자의 오름차순
-- order by ename -- 문자의 오름차순 생략
-- order by ename desc -- 문자의 내림차순
-- order by sal asc -- 숫자의 오름차순
-- order by hiredate -- 날짜의 오름차순
order by comm -- null의 오름차순
;
select ename, deptno
from emp
order by deptno, ename, sal
;





select ename, sal, sal*12+100 as Income
from emp
order by sal*12+100 desc;

select * from tab;
desc book;
desc customer;
desc orders;
select * from book;
select * from customer;
select * from orders;

select count(ORDERID) 
from ORDERS
where CUSTID = 1;




