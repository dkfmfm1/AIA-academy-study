-- 2020.05.27


--------------------------------------------------
-- DML 
--------------------------------------------------

drop table emp01;

create table emp01
as
select * from emp
;

-- 컬럼의 데이터 변경(수정)
-- update 테이블이름 set 컬럼이름1 = 값, 컬럼이름2 = 값, ... where 행을 찾는 조건식
-- where 절이 없는 경우 테이블의 모든 행이 영향을 받는다.

select * from emp01;

-- 1. 모든 사원의 부서번호를 30번으로 수정합시다.
update emp01
set deptno = 30
;


-- 2. 이번엔 모든 사원의 급여를 10% 인상시키는 UPDATE문을 보겠습니다.
update emp01
--set sal = sal+sal*0.1
set sal = sal*1.1
;


-- 3. 모든 사원의 입사일을 오늘로 수정하려면 다음과 같이 합니다.
update emp01
set hiredate = sysdate
;

select * from emp01;

commit;

rollback;

--부서번호가 10번인 사원의 부서번호를 30번으로 수정

update emp01
set deptno = 30
where deptno = 10
;


--급여가 3000 이상인 사원만 급여를 10% 인상

update emp01
set sal = sal*1.1
where sal>=3000
;


--1987년에 입사한 사원의 입사일이 오늘로 수정합시다.
--사원의 입사일을 오늘로 수정한 후에 테이블 내용을 살펴봅시다.

select * from emp01
--where hiredate between '1987/01/01' and '1987/12/31'
where substr(hiredate, 1, 2) = '87'
;

update emp01
set hiredate = sysdate
where substr(hiredate, 1, 2)= '87'
;

--1. SCOTT 사원의 부서번호는 10번으로,
--   직급은 MANAGER로 한꺼번에 수정

update emp01
set deptno = 10, job = 'MANAGER'
where ename = 'SCOTT'
;

select * from emp01 where ename = 'SCOTT';

-- 2. SCOTT 사원의 입사일자는 오늘로,
--급여를 50 으로 커미션을 4000 으로 수정

update emp01
set hiredate = sysdate, sal = 50, comm = 4000
where ename = 'SCOTT'
;


--20번 부서의 지역명을 40번 부서의 지역명으로 변경하기 위해서
--서브쿼리문을 사용해 봅시다. 

update dept01
set loc = (
    select loc from dept01 where deptno = 40
)
where deptno = 20
;

rollback;

drop table dept01;
create table dept01
as
select * from dept
;

select * from dept01;


-- 서브 쿼리를 이용해서 부서번호가 20인 부서의
-- 부서명과 지역명을
-- 부서번호가 40번인 부서와 동일하게 변경

update dept01
set dname = (select dname from dept01 where deptno = 40),
loc = (select loc from dept01 where deptno = 40)
where deptno = 20
;

update dept01
set (dname, loc) = (select dname, loc from dept01 where deptno = 40)
where deptno=20
;

rollback;


---------------------------------------------
-- DML : 삭제
---------------------------------------------

-- delete from 테이블 이름 where 행을 찾을 조건식
-- where 절이 없으면 모든행에 영향을 준다.

-- 부서 테이블의 모든 행을 삭제
delete from dept01;
select * from dept01;

-- 부서 테이블에서 30번 부서만 삭제
rollback;

delete from dept01 where deptno = 30;

-- 사원 테이블에서 부서명이 SALES인 사원을 모두 삭제

select deptno from dept where dname = 'SALES';

select * from emp01;

delete from emp01 where deptno = (
    select deptno from dept where dname = 'SALES'
)
;


------------------------------------------------
-- 수정을 위한 SQL
------------------------------------------------
-- 1. 회사친구의 정보 변경

-- 기본 정보 + 회사정보 수정
-- 기본 정보 수정
-- 회사 정보 수정

update phoneinfo_com
set fr_c_company = 'fcBarcelona'
where idx = 0002
;

-- 2. 학교친구의 정보 변경
-- 기본정보 + 학교정보 수정
-- 기본정보 수정
-- 학교정보 수정


update phoneinfo_univ
set fr_u_major = 'keeper학과'
where idx = 0001
;



------------------------------------------------
-- 삭제를 위한 SQL
------------------------------------------------
-- 1. 회사친구 정보를 삭제

delete from phoneinfo_com where idx = 000;


-- 2. 학교친구 정보를 삭제

delete from phoneinfo_univ where idx = 0001;






