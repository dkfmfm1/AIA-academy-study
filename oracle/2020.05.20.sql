-- 2020.05.20 : 마당서적 추가문제

-------------함수

-- 숫자함수

select mod(sal,10)
from emp
;

select abs(sal)
from emp;

select trunc(1282.23873, 2)
from dual;

select trunc(sal, -2)
from emp;

select round(3.141592, 3)
from dual;

select sysdate
from dual;

-- TO_CHAR
-- date -> varchar2
select sysdate, to_char(sysdate, 'YYYY.MM.DD')
from dual;

select ename, hiredate, to_char(hiredate, 'YYYY.MM.DD') as hiredate
from emp;

select sysdate, to_char(sysdate, 'YYYY.MM.DD') as hiredate
from emp;

-- 2020.05.20. 11:41:54
select to_char(sysdate, 'YYYY.MM.DD. HH24:MI:SS')
from dual;

-- 2020.05.20. 11:26
select to_char(sysdate, 'YYYY.MM.DD. HH24:MI')
from dual;

-- to_char
-- number -> varchar2
select to_char(12500, '000,000')
from dual;

select to_char(12500, '999,999')
from dual;

select to_char(12500, 'L999,999')
from dual;

select to_char(3.14, '000,000.000')
from dual;

select to_char(3.141592, '999,999.999')
from dual;

select sal, to_char(sal*1000, 'L999,999,999'),
to_char(sal*1000*12+nvl(comm,0), 'L999,999,999') as Income
from emp
order by income desc;

-- TO_DATE
-- TO_DATE(원본, 패턴)
-- str(문자열) -> date

select to_date('19810220', 'YYYYMMDD')
from dual;

select to_date('1981/02/20', 'YYYY/MM/DD')
from dual;

select ename, hiredate
from emp
where hiredate = to_date('1981/02/20', 'YYYY/MM/DD');

select sysdate,to_date('20201225', 'YYYYMMDD'),
trunc(to_date('20201225', 'YYYYMMDD')-sysdate)
from dual;

select sysdate, trunc(sysdate-to_date('19951016', 'YYYYMMDD'))
from dual;

-- TO_NUMBER
-- TO_NUMBER(원본, '패턴')
-- str -> number : 산술, 관계 연산을 목적으로 변환

select to_number('20,000', '999,999,999')-to_number('9,000','999,999')
from dual;

-- DECODE 함수 : if switch 구문과 유사
select ename, deptno,
decode(deptno,
            10, 'ACCOUNTING', 
            20, 'RESEARCH',
            30, 'SALES',
            40, 'OPERAING'
)
from emp;


-- 직급에 따라 급여를 인상하도록 하자.
-- 직급이 'ANAlYST'인 사원은 5%,
-- 'SALESMAN'인 사원은 10%, 
-- 'MANAGER'인 사원은 15%,
-- 'CLERK'인 사원은 20% 인상한다.

select ename, sal, 
decode(job,
        'ANAlYST', sal+sal*0.05, --sal*1.05 = 5%인상
        'SALESMAN', sal+sal*0.1, --sal*1.1 = 10%인상
        'MANAGER', sal+sal*0.15, --sal*1.15 = 15%인상
        'CLERK', sal+sal*0.2 --sal*1.2= 20%인상
)AS UPSAL
from emp;


select ename, deptno,
case
    when deptno = 10 then 'ACCOUTING'
    when deptno = 20 then 'RESEARCH'
    when deptno = 30 then 'SALES'
    when deptno = 40 then 'OPERATING'
    else 'no name'
end as deptName
from emp
order by deptno desc;


------------------------------------------
-- 그룹함수 (집합함수)
------------------------------------------
-- sum, avg, count, max, min

-- sum(컬럼이름) : 해당 컬름의 데이터들의 합 반환
-- 매월 지급되는 급여의 총 합
select sum(sal) as totalSal
from emp;

select to_char(sum(sal), '999,999') as totalSal
from emp;

select sum(comm)
from emp;

-- avg(컬럼명) : 해당 컬럼의 데이터들의 평균값을 반환
select trunc(avg(sal))
from emp;

select 29025/14 from dual;

select sum(comm) from emp;

select avg(comm)
from emp;

select * from emp order by comm;



-- MAX, MIN : 해당 컬럼의 데이터중에서 최대값, 최소값을 반환
select max(sal), min(sal), max(comm)
from emp;

-- 그룹함수와 일반 컬럼을 함께 사용하지 않음
-- ename이 들어가면 오류생김
-- select enmae, max(sal), min(sal), max(comm), min(comm)
-- from emp;

-- count(컬럼명 or *) : 행 (row)의 개수를 반환
--*>> 별이 들어가면 특정 컬럼이 아닌 모두 구할 때 null은 포함되지 않음.
select count(*) from emp; --emp 테이블에 저장된 전체갯수가 출력됨


select count (comm) --null을 포함하는 행은 개수로 포함하지 않는다.
from emp;

-- 저장된 직급의 개수반환
select count(job)
from emp
order by job;

-- 직급의 이름을 모두 출력
select job from emp order by job;

-- 중복을 제외하고 개수만 반환
select count(distinct job) from emp order by job;


-- group by 절 : 특정 컬럼으로 그룹핑을 해준다.
-- group by 하면 select에 * 못함...?
select deptno
from emp
group by deptno
;

select job
from emp
group by job
;

-- 소속 부서별
-- 평균 급여 구하는 예제입니다.
select deptno, round(avg(sal),0)
from emp
group by deptno
;

-- 소속 부서별 최대 급여와 최소 급여를 구하자

select deptno, max(sal), min(sal)
from emp
group by deptno
;


-- 부서별로
-- 사원 수와 커미션을 받는 사원들의 수를 계산하자
select deptno, count(*), count(comm)
from emp
where comm <> 0
group by deptno;

-- where은 null을 찾는것, having은 조건 주어질 때??

-- 부서별로
-- 평균 급여가 2000 이상인(HAVING)
-- 부서번호와 부서별 평균 급여를 출력
select deptno, avg(sal), count(*), count(comm), sum(comm)
from emp
group by deptno
having avg(sal)>=2000
;

-- 직급별, 지표 출력      -- 한글로 표현하는건 큰 따옴표
select job, count(*) as "직급별 인원",
            sum(sal) as "직급별 월 총 급여",
            trunc(avg(sal)) as "직급별 월 평균 급여",
            nvl(sum(comm), 0) as "부서별 수령 커미션의 총 합",
            max(sal) as "직급별 최고 급여 금액"
from emp
group by job
-- having count(*)>=2     
-- 직급의 인원이 2명 이상인 직급
having avg(sal) >= 2000 and count(*)>1
;

select deptno, job
from emp
group by deptno, job
order by job
;

select *
from emp;

select * from dept;