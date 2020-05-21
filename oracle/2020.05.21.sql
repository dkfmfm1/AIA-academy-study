-- 2020.05.21
----------------------
------JOIN
----------------------

select * from emp;
select * from dept;


-- cross join
select *
from emp, dept
;

select e.ename, d.dname, e.deptno, d.deptno
from emp e, dept d
where e.deptno = d.deptno
;

-- book, customer, orders
select * from orders;
select * from book;
select * from customer;
-- cross JOIN

select *
from orders o, book b, customer c
where o.bookid = b.bookid and o.custid = c.custid
and name = '박지성'
;

select * from emp;
select * from salgrade;

select ename, sal, s.grade
from emp e, salgrade s
-- where e.sal >= s.losal and e.sal <= s.hisal
where sal between losal and hisal
;


-- 관리자의 이름을 알아보자
select * from emp;

-- select e.ename || '의 상사는 ' || m.ename || '입니다.'
select e.ename, e.empno, e.sal, e.comm, m.ename
from emp e, emp m
where e.mgr = m.empno
;

-- cross join
select *
from emp, dept;

select *
from emp cross join dept;

-- inner join
select ename, dname
from emp inner join dept
on emp.deptno=dept.deptno;

select ename, dname
from emp e inner join dept d
on e.deptno=d.deptno;

select ename, dname
from emp natural join dept
;

select *
from emp e left outer join emp m
on e.mgr=m.empno
;