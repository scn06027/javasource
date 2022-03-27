select * from member;

--주소/이메일 변경을 하고싶다고?!
update MEMBER
set addr='서울시 구로구'
where id=2;

update MEMBER
set email='sarada@hanmail.net'
where id=2;
--아이디도 하나 더 필요함 where절에 써줘야되니까~!!!