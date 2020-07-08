-- 방명록 테이블

create table guestbook_massage (
    message_id number(4) PRIMARY key,
    guest_name varchar2(50) not null,
    password varchar2(10) not null,
    message varchar2(2000) not null 
);

create sequence message_id_seq INCREMENT by 1 START WITH 1;

insert into guestbook_message values (message_id_seq.nextVal, '테스터', '1111', '글쓰기 테스트');

select * from guestbook_message;

ROLLBACK;