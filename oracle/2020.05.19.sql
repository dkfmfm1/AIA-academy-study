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