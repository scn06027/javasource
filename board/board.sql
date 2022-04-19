create table board(
	bno number(8), --글번호
	name nvarchar2(10) not null, --작성자
	password varchar2(15) not null, --비밀번호
	title nvarchar2(50) not null, --제목
	content nvarchar2(1000) not null, --내용
	attach nvarchar2(100), --파일첨부
	re_ref number(8) not null, --답변글 작성 시 참조되는 글 번
	re_lev number(8) not null, --답변글 레벨
	re_seq number(8) not null, -- 답변글 순서
	readcount number(8) default 0, --조회수
	regdate date default sysdate --작성날짜
	);
--틀린게 없는데 안 만들어져!! 그럼 오라클에서 사용하고있는걸수도 있으니까
--저렇게 쌍따옴표 표시해주면 됨
alter table board add constraint pk_board primary key(bno);
create sequence board_seq;

drop table board;

insert into board(bno,name,password,title,content,attach,re_ref,re_lev,re_seq)
values(board_seq.nextval,'홍길동','1234','jsp/servlet 게시판','게시판을 작성해봅시다',null,board_seq.currval,0,0);


--댓글,검색, 페이지 나누기 작업 해야 됨 ...................
--더미데이타
insert into board(bno,name,password,title,content,re_ref,re_lev,re_seq)
(select board_seq.nextval,name,password,title,content,board_seq.currval,re_lev,re_seq from board);
select count(*) from board;
--마지막 글번호 확인
select max(bno) from board;

select bno,title,re_ref,re_seq,re_lev from board where bno=941;

-- re_ref : 원본글의 re_ref값과 동일하게 삽입해야된다
-- re_lev : 원본글의 re_lev+1 삽입
-- re_seq : 원본글의 re_seq+1 삽입
insert into board(bno,name,password,title,content,attach,re_ref,re_lev,re_seq)
values(board_seq.nextval,'댓글로','1234','re : 댓글 얍','댓글작성',null,941,1,1);
--원본글과 댓글 을 그룹으로 가져올거다
select bno,title,re_ref,re_seq,re_lev from board where re_ref=941;

-- 댓글 작성할 때 : 최신순으로 추출할 수 있어야 한다. (re_seq 사용)
-- 기존 댓글의 re_seq값을 업데이트 해주고 , 
--update board set re_seq=re_seq+1 where re_ref =원본글의 re_ref and re_seq> 원본글의 re_seq
-- 그 다음에 새로운 값을 삽입해준다

insert into board(bno,name,password,title,content,attach,re_ref,re_lev,re_seq)
values(board_seq.nextval,'댓글로22','1234','re : 댓글22 얍','댓글작성222',null,941,1,1);