1. 사용자 board/1234 생성합니다.
    conn system/1234
    CREATE USER board IDENTIFIED BY 1234;
    GRANT RESOURCE, CONNECT TO board;
    CONN board/1234

2. 테이블 생성
drop table board  cascade constraints purge; --제약조건이 있는 경우  제약조건을 삭제합니다. 
                                             -- 부모 테이블인 경우 자식에 대한 제약 조건도 삭제됩니다.

-- 위 명령을 내리기 전
CONSTRAINT_NAME      TABLE_NAME           R_CONSTRAINT_NAME
-------------------- -------------------- --------------------
SYS_C0010022         C1                   SYS_C0010021
SYS_C0010021         P1

-- 위 명령 후
--조회 결과가 없습니다.

CREATE TABLE BOARD(
	BOARD_NUM          NUMBER(5),         --글 번호(기본키)
	BOARD_NAME         VARCHAR2(30),   --작성자
	BOARD_PASS          VARCHAR2(30),   --비밀번호
	BOARD_SUBJECT      VARCHAR2(300),  --제목
	BOARD_CONTENT    VARCHAR2(4000), --내용
	BOARD_FILE             VARCHAR2(50),   --첨부될 파일 명(시스템에 저장되는 파일명)
	BOARD_ORIGINAL     VARCHAR2(50),   --첨부될 파일 명(시스템에 저장된 파일의 원래 파일명)
	BOARD_RE_REF         NUMBER(5),         --답변 글 작성시 참조되는 글의 번호
	BOARD_RE_LEV         NUMBER(5),         --답변 글의 깊이(원문글:0, 답변:1, 답변의 답변2, 답변의 답변의 답변 :3)
	BOARD_RE_SEQ         NUMBER(5),         --답변 글의 순서(원문글 기준으로 보여주는 순서)
	BOARD_READCOUNT NUMBER(5),         --글의 조회수
	BOARD_DATE DATE,                --글의 작성 날짜
	PRIMARY KEY(BOARD_NUM)
);

select * from board;
delete from board;
3. 글 번호는 시퀀스를 사용합니다.
           시퀀스 이름 : board_seq
                 시작값 : 1
                 증가값 : 1
drop SEQUENCE BOARD_SEQ;          
CREATE SEQUENCE BOARD_SEQ;

4. 테이블 조회와 같이 원문글이 저장되도록 INSERT문을 작성하세요.
          조건1) 원문글의 경우 BOARD_RE_REF 컬럼의 값은 원문 글 번호와 같습니다.                   
          조건2) BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT 값은 모두 0 입니다.
          조건3) BOARD_DATE는 시스템 날짜입니다.
          조건4) BOARD_FILE, BOARD_ORIGINAL는 null로 처리합니다.
          조건5) 비밀번호 삽입은 하지만 조회 시 제외합니다.

  
     테이블 조회결과)     
      RNUM BOARD_NUM BOARD_NAME BOARD_SUBJECT BOARD_CONTENT BOARD_FILE BOARD_ORIGINAL BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DATE
     ---- --------- ---------- ------------- ------------- ---------- --------------- ----------- ------------ ------------ --------------- ---------------------
        1         1  admin      JSP 공부는 재미있어요 열심히 해봐요       NULL        NULL          1            0            0               3 2019-09-17 23:18:13.0
      
      SQL문)         
      insert into board 
	 (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	  BOARD_CONTENT, BOARD_RE_REF,
	  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	  BOARD_DATE) 
          values(board_seq.nextval, 'admin' , '1' , 'JSP 공부는 재미있어요',
                   '열심히 해봐요',  board_seq.nextval, 
                   0,0,0,  
                   sysdate);

select * from board;




			
5. 원문글에 답변을 달도록 쿼리문을 작성하세요.(INSERT문)
   조건1) 글 번호는 시퀀스로 증가합니다.
   조건2) BOARD_RE_REF 컬럼의 값은 원문글의 글 번호와 일치합니다. 
   조건3) BOARD_RE_LEV,BOARD_RE_SEQ는 원문글의 BOARD_RE_LEV,BOARD_RE_SEQ 보다 1씩 증가합니다.                        
   조건4) BOARD_DATE는 시스템 날짜입니다.
 
          
            테이블 조회결과)              
       RNUM BOARD_NUM BOARD_NAME BOARD_SUBJECT      BOARD_CONTENT BOARD_FILE BOARD_ORIGINAL BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DATE
       ---- --------- ---------- ------------- ------------- ---------- ------------ ------------ ------------ --------------- ---------------------
         1         1   admin      JSP 공부는 재미있어요    열심히 해봐요            NULL        NULL             1            0            0               0 2019-09-17 23:18:13.0
         2         2   admin      JAVA도             JAVA도                  NULL       NULL             1            1            1               0 2019-09-17 23:43:45.0           

        SQL문)   
       insert into board 
	 (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	  BOARD_CONTENT, BOARD_RE_REF,
	  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	  BOARD_DATE) 
        values(board_seq.nextval,'admin','1','JAVA도',
              'JAVA도',  1,
               1,1,0,
               sysdate);

         RNUM BOARD_NUM BOARD BOARD_SUBJECT         BOARD_CONTENT        BOA BOA BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DA
---------- --------- ----- --------------------- -------------------- --- --- ------------ ------------ ------------ --------------- --------
         1         1 admin JSP 공부는 재미있어요 열심히 해봐요                           1            0            0               0 19/09/18
         2         2 admin JAVA도                JAVA도                                  1            1            1               0 19/09/18

           
6.테이블 조회는  BOARD_RE_REF를 기준으로 내림차순으로 정렬하고,BOARD_RE_REF 같으면 BOARD_RE_SEQ를 오름차순 기준으로 정렬합니다.
  정렬기준으로 처음부터 10개를 조회합니다.(SELECT문 사용)
  
  
  1단계)
   select * from board
   order by BOARD_RE_REF desc,
   BOARD_RE_SEQ asc    
  
  
  2단계)
   select rownum rnum,BOARD_NUM,BOARD_NAME,BOARD_SUBJECT,
   	      BOARD_CONTENT,BOARD_FILE,BOARD_ORIGINAL,BOARD_RE_REF,BOARD_RE_LEV,
          BOARD_RE_SEQ,BOARD_READCOUNT,BOARD_DATE
   from  (select * from board
          order by BOARD_RE_REF desc,
          BOARD_RE_SEQ asc)
   where rownum <= 10
   
  3단계) 
  SQL> select * 
       from (select rownum rnum,BOARD_NUM,BOARD_NAME,BOARD_SUBJECT,
                    BOARD_CONTENT,BOARD_FILE,BOARD_ORIGINAL,BOARD_RE_REF,BOARD_RE_LEV,
                    BOARD_RE_SEQ,BOARD_READCOUNT,BOARD_DATE
             from  (select * from board
                    order by BOARD_RE_REF desc,
                    BOARD_RE_SEQ asc)
             where rownum <= 40)
       where rnum>=31 and rnum<=40;
                            


7.  원문글에  답변을 추가하는 경우 기존글들의 BOARD_RE_SEQ는 1증가합니다.
    조건) BOARD_RE_REF가 원문글의 번호이고 BOARD_RE_SEQ값이 원문글의 BOARD_RE_SEQ보다 큰 경우에만 답변의 BOARD_RE_SEQ는 1증가합니다. (UPDATE문 사용)
    답)    UPDATE BOARD
           SET BOARD_RE_SEQ = BOARD_RE_SEQ + 1
           WHERE BOARD_RE_REF = 1 
           AND BOARD_RE_SEQ>0;                           
    
               RNUM BOARD_NUM BOARD BOARD_SUBJECT         BOARD_CONTENT        BOA BOA BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DA
---------- --------- ----- --------------------- -------------------- --- --- ------------ ------------ ------------ --------------- --------
         1         1 admin JSP 공부는 재미있어요 열심히 해봐요                           1            0            0               0 19/09/18
         2         2 admin JAVA도                JAVA도                                  1            1            2               0 19/09/18


8.  BOARD_NUM 1번(원문글)에 답변을 추가로 달도록 쿼리문을 작성합니다. (최신의 답변글이 원문글 바로 아래에 위치합니다.)  
    *  조회결과와 같은 답변을 추가합니다.
        테이블 조회결과)             
       RNUM BOARD_NUM BOARD_NAME BOARD_SUBJECT      BOARD_CONTENT BOARD_FILE BOARD_ORIGINAL BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DATE
       ---- --------- ---------- ------------- ------------- ---------- -------------- ------------ ------------ ------------ --------------- ---------------------
         1         1   admin      JSP 공부는 재미있어요    열심히 해봐요           NULL       NULL                      1            0            0               0 2019-09-17 23:18:13.0
         2         3   admin      나도 찬성                       찬성입니다.      NULL       NULL                      1            1            1               0 2019-09-18 00:00:48.0
         3         2   admin      JAVA도                        JAVA도      NULL       NULL                      1            1            2               0 2019-09-17 23:43:45.0           

                  조건)  글번호 3의    BOARD_RE_REF는 원문글(글번호 1) 번호 입니다. (INSERT문 사용)
                            BOARD_RE_LEV은 원문글의 답변이므로 1입니다.
                            BOARD_RE_SEQ는 원문글 다음이므로 원문글의   BOARD_RE_SEQ보다 1 큽니다.
                            BOARD_DATE는 시스템 날짜입니다
                      답) insert into board 
	                  (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	                  BOARD_CONTENT, BOARD_RE_REF,
	                  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	                  BOARD_DATE) 
                             values(board_seq.nextval,'admin','1','나도 찬성',
                                       ' 찬성입니다.',  1,
                                        1,1,0,
                                       sysdate);
  
    
      
9. 글번호 2에 답변을 답니다.(INSERT 문)
   조건1) BOARD_RE_REF는  원문글번호를 가집니다.
   조건2) BOARD_RE_LEV는 글번호 2의  BOARD_RE_LEV 보다 1 증가합니다.
   조건3) BOARD_RE_SEQ는 글번호 2의 BOARD_RE_SEQ 보다 1증가합니다. 

           insert into board 
	 (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	  BOARD_CONTENT, BOARD_RE_REF,
	  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	  BOARD_DATE) 
        values(board_seq.nextval,'admin','1','나도 찬성이요 ',
              '찬성',  1,
               2,3,0,
               sysdate);



                       
         테이블 조회결과)             
       RNUM BOARD_NUM BOARD_NAME BOARD_SUBJECT      BOARD_CONTENT BOARD_FILE BOARD_ORIGINAL BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DATE
       ---- --------- ---------- ------------- ------------- ---------- -------------- ------------ ------------ ------------ --------------- ---------------------
         1         1   admin      JSP 공부는 재미있어요    열심히 해봐요           NULL       NULL                      1            0            0               0 2019-09-17 23:18:13.0
         2         3   admin      나도 찬성                       찬성입니다.      NULL       NULL                      1            1            1             0 2019-09-18 00:00:48.0
         3         2   admin      JAVA도                        JAVA도                 NULL       NULL                      1            1            2              0 201               
         4         4   admin      나도 찬성이요                 찬성                      NULL       NULL                      1            2           3               1 2019-09-18 00:21:45.0
    
    
10. 원문글(BOARD_NUM=1)에 답변을 답니다.다음 조건에 맞는 쿼리문을 작성하세요(UPDATE)
              
             조건1) 글번호 3,2,4의       BOARD_RE_SEQ는 기존의 값에서 1씩 증가합니다. 
                    BOARD_RE_REF의 값이 원문글 번호이고
                    BOARD_RE_SEQ값이 원문글의 BOARD_RE_SEQ보다 큰 경우에만 
                    답변의 BOARD_RE_SEQ는 1증가합니다. 
 
                       UPDATE BOARD
                        SET BOARD_RE_SEQ = BOARD_RE_SEQ + 1
                        WHERE BOARD_RE_REF = 1 
                        AND BOARD_RE_SEQ>0;    

      RNUM BOARD_NUM BOARD BOARD_SUBJECT         BOARD_CONTENT        BOA BOA BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DA
---------- --------- ----- --------------------- -------------------- --- --- ------------ ------------ ------------ --------------- --------
         1         1 admin JSP 공부는 재미있어요 열심히 해봐요                           1            0            0               0 19/09/18
         2         3 admin 나도 찬성              찬성입니다.                            1            1            2               1 19/09/18
         3         2 admin JAVA도                JAVA도                                  1            1            3               0 19/09/18
         4         4 admin 나도 찬성이요         찬성                                    1            2            4               0 19/09/18
                      
             조건2) 새로 입력하는 답변글의  BOARD_RE_REF는 원문글 번호 입니다.(INSERT)
                       BOARD_RE_LEV는 원문글의 BOARD_RE_LEV보다 1증가 합니다.
                       BOARD_RE_SEQ 는 원문글의 BOARD_RE_SEQ 보다 1증가 합니다.

                          insert into board 
	 (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	  BOARD_CONTENT, BOARD_RE_REF,
	  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	  BOARD_DATE) 
        values(board_seq.nextval,'admin','1','저도요 ',
             '저도요',  1,
               1,1,0,
               sysdate);
   
                       
           테이블 조회결과)             
       RNUM BOARD_NUM BOARD_NAME BOARD_SUBJECT      BOARD_CONTENT BOARD_FILE BOARD_ORIGINAL BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DATE
       ---- --------- ---------- ------------- ------------- ---------- -------------- ------------ ------------ ------------ --------------- ---------------------
         1         1   admin      JSP 공부는 재미있어요    열심히 해봐요           NULL       NULL                      1            0            0               0 2019-09-17 23:18:13.0
         2         5   admin      저도요           저도요           NULL       NULL                                   1            1            1               2 2019-09-18 00:29:59.0
         3         3   admin      나도 찬성                       찬성입니다.      NULL       NULL                      1            1            2            0 2019-09-18 00:00:48.0
         4         2   admin      JAVA도                        JAVA도                 NULL       NULL                      1            1            3             0 201               
         5         4   admin      나도 찬성이요                 찬성                      NULL       NULL                      1            2            4              1 2019-09-18 00:21:45.0             
     
11. 원본글 삽입
        insert into board 
	 (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	  BOARD_CONTENT, BOARD_RE_REF,
	  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	  BOARD_DATE) 
                     values(board_seq.nextval,'admin','1','힘내세요',
              '힘내세요',  board_seq.nextval,
               0,0,0,
               sysdate);

  RNUM BOARD_NUM BOARD BOARD_SUBJECT         BOARD_CONTENT        BOA BOA BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DA
 ---------- --------- ----- --------------------- -------------------- --- --- ------------ ------------ ------------ --------------- --------
         1         6 admin 힘내세요              힘내세요                                6            0            0               0 19/09/18
         2         1 admin JSP 공부는 재미있어요 열심히 해봐요                           1            0            0               0 19/09/18
         3         5 admin 저도요                저도요                                  1            1            1               0 19/09/18
         4         3 admin 나도 찬성              찬성입니다.                            1            1            2               0 19/09/18
         5         2 admin JAVA도                JAVA도                                  1            1            3               0 19/09/18
         6         4 admin 나도 찬성이요         찬성                                    1            2            4               0 19/09/18


12.  6번글에 답변을 달아요
           insert into board 
	 (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	  BOARD_CONTENT, BOARD_RE_REF,
	  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	  BOARD_DATE) 
        values(board_seq.nextval,'admin','1','RE: 힘내세요',
              '운동하세요',  6,
               1,1,0,
               sysdate);

 RNUM BOARD_NUM BOARD BOARD_SUBJECT         BOARD_CONTENT        BOA BOA BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DA
---------- --------- ----- --------------------- -------------------- --- --- ------------ ------------ ------------ --------------- --------
         1         6 admin 힘내세요              힘내세요                                6            0            0               0 19/09/18
         2         7 admin RE: 힘내세요          운동하세요                              6            1            1               0 19/09/18
         3         1 admin JSP 공부는 재미있어요 열심히 해봐요                           1            0            0               0 19/09/18
         4         5 admin 저도요                저도요                                  1            1            1               0 19/09/18
         5         3 admin 나도 찬성              찬성입니다.                            1            1            2               0 19/09/18
         6         2 admin JAVA도                JAVA도                                  1            1            3               0 19/09/18
         7         4 admin 나도 찬성이요         찬성                                    1            2            4               0 19/09/18

13. 3번글에 대한 답변을 답니다.
            조건1) 2, 4번 글에 대한 BOARD_RE_SEQ를 기존 값에서 1증가 합니다. (8번 참조)
              update board
               set board_re_seq = board_re_seq + 1
               where board_re_ref = 1
                and board_re_seq>2;

     RNUM BOARD_NUM BOARD BOARD_SUBJECT         BOARD_CONTENT        BOA BOA BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DA
---------- --------- ----- --------------------- -------------------- --- --- ------------ ------------ ------------ --------------- --------
         1         6 admin 힘내세요              힘내세요                                6            0            0               0 19/09/18
         2         7 admin RE: 힘내세요          운동하세요                              6            1            1               0 19/09/18
         3         1 admin JSP 공부는 재미있어요 열심히 해봐요                           1            0            0               0 19/09/18
         4         5 admin 저도요                저도요                                  1            1            1               0 19/09/18
         5         3 admin 나도 찬성              찬성입니다.                            1            1            2               0 19/09/18
         6         2 admin JAVA도                JAVA도                                  1            1            4               0 19/09/18
         7         4 admin 나도 찬성이요         찬성                                    1            2            5               0 19/09/18

       
       조건2) 8번 글의 BOARD_RE_REF는 1, BOARD_RE_LEV은 답변의 답변이므로 2, BOARD_RE_SEQ는 
              3번 글의 답변이므로 3번 글의 BOARD_RE_SEQ보다 1증가 합니다.  
               즉, 답변은 답변을 다는 글의 BOARD_RE_LEV, BOARD_RE_SEQ 보다 각각 1씩 증가합니다. 

      insert into board 
	 (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	  BOARD_CONTENT, BOARD_RE_REF,
	  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	  BOARD_DATE) 
        values(board_seq.nextval,'admin','1','RE: 나도 찬성',
              '하하',  1,
               2,3,0,
               sysdate);

      RNUM BOARD_NUM BOARD BOARD_SUBJECT         BOARD_CONTENT BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DA
---------- --------- ----- --------------------- -------------------- --- --- ------------ ------------ ------------ --------------- --------
         1         6 admin 힘내세요               힘내세요    	    6            0            0               0 19/09/18
         2         7 admin  RE: 힘내세요          운동하세요        6            1            1               0 19/09/18
         3         1 admin JSP 공부는 재미있어요    열심히 해봐요      1            0            0               0 19/09/18
         4         5 admin 저도요                 저도요           1            1            1               0 19/09/18
         5         3 admin 나도 찬성              찬성입니다.		1            1            2               0 19/09/18
         6         8 admin  RE: 나도 찬성         하하             1            2            3               0 19/09/18
         7         2 admin JAVA도                JAVA도          1            1            4               0 19/09/18
         8         4 admin  RE: 나도 찬성이요      찬성             1            2            5               0 19/09/18

14. 
* 삭제하고자 하는 규칙을 찾습니다.		
		 1. 글번호 3를 삭제시 8번도 같이 삭제합니다.
		    1) 3번을 선택하기 때문에  BOARD_RE_REF(1)   BOARD_RE_LEV(1)   BOARD_RE_SEQ(2)의 값은 알 수 있습니다.
		    2) 어느 BOARD_RE_SEQ까지 선택할 지 범위를 구해야 합니다.
		    3) 위의 예처럼 3번 글을 선택하면  3번 글의 BOARD_RE_REF, BOARD_RE_LEV 값이 같고  
                        BOARD_RE_SEQ는 2보다 큰 값 중에서  가장 작은 BOARD_RE_SEQ 값을 찾습니다.
		        
		       =>   SELECT min(board_re_seq )
				    FROM   BOARD  
				    WHERE  BOARD_RE_REF=? 
				    AND    BOARD_RE_LEV=?
				    AND    BOARD_RE_SEQ>?
		         
		    4) 3)에서 구한  BOARD_RE_SEQ(4)에서 1을 뺀 3까지 구합니다.
		       => SELECT min(board_re_seq )-1
				  FROM   BOARD  
				  WHERE  BOARD_RE_REF=? 
				  AND    BOARD_RE_LEV=?
				  AND    BOARD_RE_SEQ>?
		    5)  선택한 글을 기준으로  BOARD_RE_REF는 같고  BOARD_RE_LEV는 같거나 크고 
		        BOARD_RE_SEQ는 자기의  BOARD_RE_SEQ 부터  4번에서 구한 값을 적용합니다.
		         =>  delete from board
				     where  BOARD_RE_REF = ? 
				     and    BOARD_RE_LEV >=?
				     and    BOARD_RE_SEQ >=?
				     and    BOARD_RE_SEQ <= 4번에서 구한 값  
		    
	      2. 글번호 1번을 삭제하는 경우
	         1)  글번호 1번의 BOARD_RE_REF,   BOARD_RE_LEV 값이 같으면서  BOARD_RE_SEQ=0보다 큰 글은 존재하지 않습니다.
	         2)  이 경우는  같은 BOARD_RE_REF 중에서 BOARD_RE_SEQ가 가장 큰 값을 구하면 됩니다.
	             =>SELECT max(board_re_seq)
				   FROM   BOARD  
				   WHERE  BOARD_RE_REF=? 
	

                       =>
				delete from board
				where  BOARD_RE_REF = &REF
				and    BOARD_RE_LEV >=&LEV
				and    BOARD_RE_SEQ >=&SEQ
				and    BOARD_RE_SEQ <=(  nvl((SELECT min(board_re_seq)-1
				                             FROM   BOARD
				                             WHERE  BOARD_RE_REF=&REF
				                             AND    BOARD_RE_LEV=&LEV
				                             AND    BOARD_RE_SEQ>&SEQ) , 
				                            (SELECT max(board_re_seq)
				                             FROM   BOARD
							                 WHERE  BOARD_RE_REF=&REF ))
                                                       );

                                                       
                                                       
                                                       
   
drop table board_copy purge
select * from board_copy;

create table board_copy
as
select * from board;


insert into board
select * from board_copy;



select count(*) from board;












