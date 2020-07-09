-- 방명록 테이블
select * from guestbook_message;


select rownum, MESSAGE_ID, message 
from (select * from guestbook_message order by guestbook_message.message_id);

delete from guestbook_message;

--commit;
--
--rollback;

select rownum, message_id, guest_name, password, message 
from guestbook_message order by message_id desc;


select rownum, message_id, guest_name, password, message 
from (
    select * from guestbook_message order by guestbook_message.message_id desc
);

-- 2page : 4~6

select rownum, message_id, guest_name, password, message 
from (
    select * from guestbook_message order by guestbook_message.message_id desc
) where rownum <= 6;

select * from guestbook_message where message_id=10;
create table guestbook_message(
    message_id number(4) PRIMARY key,
    guest_name varchar2(50) not null,
    password varchar(10) not null,
    message varchar2(2000) not null
);

create sequence message_id_seq INCREMENT by 1 start with 1;

insert into guestbook_message 
values (message_id_seq.nextVal, '테스터11', '1111', '글쓰기 테스트11');
insert into guestbook_message 
values (message_id_seq.nextVal, '테스터10', '1111', '글쓰기 테스트2');
insert into guestbook_message 
values (message_id_seq.nextVal, '테스터9', '1111', '글쓰기 테스트3');
insert into guestbook_message 
values (message_id_seq.nextVal, '테스터8', '1111', '글쓰기 테스트4');
insert into guestbook_message 
values (message_id_seq.nextVal, '테스7', '1111', '글쓰기 테스트5');
insert into guestbook_message 
values (message_id_seq.nextVal, '테스터6', '1111', '글쓰기 테스트6');
insert into guestbook_message 
values (message_id_seq.nextVal, '테스터5', '1111', '글쓰기 테스트7');
insert into guestbook_message 
values (message_id_seq.nextVal, '테스터4', '1111', '글쓰기 테스트8');
insert into guestbook_message 
values (message_id_seq.nextVal, '테스터3', '1111', '글쓰기 테스트9');
insert into guestbook_message 
values (message_id_seq.nextVal, '테스터2', '1111', '글쓰기 테스트10');
insert into guestbook_message 
values (message_id_seq.nextVal, '테스터1', '1111', '글쓰기 테스트1');

commit;

delete from guestbook_message;