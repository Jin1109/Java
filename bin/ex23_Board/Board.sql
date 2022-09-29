1. ����� board/1234 �����մϴ�.
    conn system/1234
    CREATE USER board IDENTIFIED BY 1234;
    GRANT RESOURCE, CONNECT TO board;
    CONN board/1234

2. ���̺� ����
drop table board  cascade constraints purge; --���������� �ִ� ���  ���������� �����մϴ�. 
                                             -- �θ� ���̺��� ��� �ڽĿ� ���� ���� ���ǵ� �����˴ϴ�.

-- �� ����� ������ ��
CONSTRAINT_NAME      TABLE_NAME           R_CONSTRAINT_NAME
-------------------- -------------------- --------------------
SYS_C0010022         C1                   SYS_C0010021
SYS_C0010021         P1

-- �� ��� ��
--��ȸ ����� �����ϴ�.

CREATE TABLE BOARD(
	BOARD_NUM          NUMBER(5),         --�� ��ȣ(�⺻Ű)
	BOARD_NAME         VARCHAR2(30),   --�ۼ���
	BOARD_PASS          VARCHAR2(30),   --��й�ȣ
	BOARD_SUBJECT      VARCHAR2(300),  --����
	BOARD_CONTENT    VARCHAR2(4000), --����
	BOARD_FILE             VARCHAR2(50),   --÷�ε� ���� ��(�ý��ۿ� ����Ǵ� ���ϸ�)
	BOARD_ORIGINAL     VARCHAR2(50),   --÷�ε� ���� ��(�ý��ۿ� ����� ������ ���� ���ϸ�)
	BOARD_RE_REF         NUMBER(5),         --�亯 �� �ۼ��� �����Ǵ� ���� ��ȣ
	BOARD_RE_LEV         NUMBER(5),         --�亯 ���� ����(������:0, �亯:1, �亯�� �亯2, �亯�� �亯�� �亯 :3)
	BOARD_RE_SEQ         NUMBER(5),         --�亯 ���� ����(������ �������� �����ִ� ����)
	BOARD_READCOUNT NUMBER(5),         --���� ��ȸ��
	BOARD_DATE DATE,                --���� �ۼ� ��¥
	PRIMARY KEY(BOARD_NUM)
);

select * from board;
delete from board;
3. �� ��ȣ�� �������� ����մϴ�.
           ������ �̸� : board_seq
                 ���۰� : 1
                 ������ : 1
drop SEQUENCE BOARD_SEQ;          
CREATE SEQUENCE BOARD_SEQ;

4. ���̺� ��ȸ�� ���� �������� ����ǵ��� INSERT���� �ۼ��ϼ���.
          ����1) �������� ��� BOARD_RE_REF �÷��� ���� ���� �� ��ȣ�� �����ϴ�.                   
          ����2) BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT ���� ��� 0 �Դϴ�.
          ����3) BOARD_DATE�� �ý��� ��¥�Դϴ�.
          ����4) BOARD_FILE, BOARD_ORIGINAL�� null�� ó���մϴ�.
          ����5) ��й�ȣ ������ ������ ��ȸ �� �����մϴ�.

  
     ���̺� ��ȸ���)     
      RNUM BOARD_NUM BOARD_NAME BOARD_SUBJECT BOARD_CONTENT BOARD_FILE BOARD_ORIGINAL BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DATE
     ---- --------- ---------- ------------- ------------- ---------- --------------- ----------- ------------ ------------ --------------- ---------------------
        1         1  admin      JSP ���δ� ����־�� ������ �غ���       NULL        NULL          1            0            0               3 2019-09-17 23:18:13.0
      
      SQL��)         
      insert into board 
	 (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	  BOARD_CONTENT, BOARD_RE_REF,
	  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	  BOARD_DATE) 
          values(board_seq.nextval, 'admin' , '1' , 'JSP ���δ� ����־��',
                   '������ �غ���',  board_seq.nextval, 
                   0,0,0,  
                   sysdate);

select * from board;




			
5. �����ۿ� �亯�� �޵��� �������� �ۼ��ϼ���.(INSERT��)
   ����1) �� ��ȣ�� �������� �����մϴ�.
   ����2) BOARD_RE_REF �÷��� ���� �������� �� ��ȣ�� ��ġ�մϴ�. 
   ����3) BOARD_RE_LEV,BOARD_RE_SEQ�� �������� BOARD_RE_LEV,BOARD_RE_SEQ ���� 1�� �����մϴ�.                        
   ����4) BOARD_DATE�� �ý��� ��¥�Դϴ�.
 
          
            ���̺� ��ȸ���)              
       RNUM BOARD_NUM BOARD_NAME BOARD_SUBJECT      BOARD_CONTENT BOARD_FILE BOARD_ORIGINAL BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DATE
       ---- --------- ---------- ------------- ------------- ---------- ------------ ------------ ------------ --------------- ---------------------
         1         1   admin      JSP ���δ� ����־��    ������ �غ���            NULL        NULL             1            0            0               0 2019-09-17 23:18:13.0
         2         2   admin      JAVA��             JAVA��                  NULL       NULL             1            1            1               0 2019-09-17 23:43:45.0           

        SQL��)   
       insert into board 
	 (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	  BOARD_CONTENT, BOARD_RE_REF,
	  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	  BOARD_DATE) 
        values(board_seq.nextval,'admin','1','JAVA��',
              'JAVA��',  1,
               1,1,0,
               sysdate);

         RNUM BOARD_NUM BOARD BOARD_SUBJECT         BOARD_CONTENT        BOA BOA BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DA
---------- --------- ----- --------------------- -------------------- --- --- ------------ ------------ ------------ --------------- --------
         1         1 admin JSP ���δ� ����־�� ������ �غ���                           1            0            0               0 19/09/18
         2         2 admin JAVA��                JAVA��                                  1            1            1               0 19/09/18

           
6.���̺� ��ȸ��  BOARD_RE_REF�� �������� ������������ �����ϰ�,BOARD_RE_REF ������ BOARD_RE_SEQ�� �������� �������� �����մϴ�.
  ���ı������� ó������ 10���� ��ȸ�մϴ�.(SELECT�� ���)
  
  
  1�ܰ�)
   select * from board
   order by BOARD_RE_REF desc,
   BOARD_RE_SEQ asc    
  
  
  2�ܰ�)
   select rownum rnum,BOARD_NUM,BOARD_NAME,BOARD_SUBJECT,
   	      BOARD_CONTENT,BOARD_FILE,BOARD_ORIGINAL,BOARD_RE_REF,BOARD_RE_LEV,
          BOARD_RE_SEQ,BOARD_READCOUNT,BOARD_DATE
   from  (select * from board
          order by BOARD_RE_REF desc,
          BOARD_RE_SEQ asc)
   where rownum <= 10
   
  3�ܰ�) 
  SQL> select * 
       from (select rownum rnum,BOARD_NUM,BOARD_NAME,BOARD_SUBJECT,
                    BOARD_CONTENT,BOARD_FILE,BOARD_ORIGINAL,BOARD_RE_REF,BOARD_RE_LEV,
                    BOARD_RE_SEQ,BOARD_READCOUNT,BOARD_DATE
             from  (select * from board
                    order by BOARD_RE_REF desc,
                    BOARD_RE_SEQ asc)
             where rownum <= 40)
       where rnum>=31 and rnum<=40;
                            


7.  �����ۿ�  �亯�� �߰��ϴ� ��� �����۵��� BOARD_RE_SEQ�� 1�����մϴ�.
    ����) BOARD_RE_REF�� �������� ��ȣ�̰� BOARD_RE_SEQ���� �������� BOARD_RE_SEQ���� ū ��쿡�� �亯�� BOARD_RE_SEQ�� 1�����մϴ�. (UPDATE�� ���)
    ��)    UPDATE BOARD
           SET BOARD_RE_SEQ = BOARD_RE_SEQ + 1
           WHERE BOARD_RE_REF = 1 
           AND BOARD_RE_SEQ>0;                           
    
               RNUM BOARD_NUM BOARD BOARD_SUBJECT         BOARD_CONTENT        BOA BOA BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DA
---------- --------- ----- --------------------- -------------------- --- --- ------------ ------------ ------------ --------------- --------
         1         1 admin JSP ���δ� ����־�� ������ �غ���                           1            0            0               0 19/09/18
         2         2 admin JAVA��                JAVA��                                  1            1            2               0 19/09/18


8.  BOARD_NUM 1��(������)�� �亯�� �߰��� �޵��� �������� �ۼ��մϴ�. (�ֽ��� �亯���� ������ �ٷ� �Ʒ��� ��ġ�մϴ�.)  
    *  ��ȸ����� ���� �亯�� �߰��մϴ�.
        ���̺� ��ȸ���)             
       RNUM BOARD_NUM BOARD_NAME BOARD_SUBJECT      BOARD_CONTENT BOARD_FILE BOARD_ORIGINAL BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DATE
       ---- --------- ---------- ------------- ------------- ---------- -------------- ------------ ------------ ------------ --------------- ---------------------
         1         1   admin      JSP ���δ� ����־��    ������ �غ���           NULL       NULL                      1            0            0               0 2019-09-17 23:18:13.0
         2         3   admin      ���� ����                       �����Դϴ�.      NULL       NULL                      1            1            1               0 2019-09-18 00:00:48.0
         3         2   admin      JAVA��                        JAVA��      NULL       NULL                      1            1            2               0 2019-09-17 23:43:45.0           

                  ����)  �۹�ȣ 3��    BOARD_RE_REF�� ������(�۹�ȣ 1) ��ȣ �Դϴ�. (INSERT�� ���)
                            BOARD_RE_LEV�� �������� �亯�̹Ƿ� 1�Դϴ�.
                            BOARD_RE_SEQ�� ������ �����̹Ƿ� ��������   BOARD_RE_SEQ���� 1 Ů�ϴ�.
                            BOARD_DATE�� �ý��� ��¥�Դϴ�
                      ��) insert into board 
	                  (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	                  BOARD_CONTENT, BOARD_RE_REF,
	                  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	                  BOARD_DATE) 
                             values(board_seq.nextval,'admin','1','���� ����',
                                       ' �����Դϴ�.',  1,
                                        1,1,0,
                                       sysdate);
  
    
      
9. �۹�ȣ 2�� �亯�� ��ϴ�.(INSERT ��)
   ����1) BOARD_RE_REF��  �����۹�ȣ�� �����ϴ�.
   ����2) BOARD_RE_LEV�� �۹�ȣ 2��  BOARD_RE_LEV ���� 1 �����մϴ�.
   ����3) BOARD_RE_SEQ�� �۹�ȣ 2�� BOARD_RE_SEQ ���� 1�����մϴ�. 

           insert into board 
	 (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	  BOARD_CONTENT, BOARD_RE_REF,
	  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	  BOARD_DATE) 
        values(board_seq.nextval,'admin','1','���� �����̿� ',
              '����',  1,
               2,3,0,
               sysdate);



                       
         ���̺� ��ȸ���)             
       RNUM BOARD_NUM BOARD_NAME BOARD_SUBJECT      BOARD_CONTENT BOARD_FILE BOARD_ORIGINAL BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DATE
       ---- --------- ---------- ------------- ------------- ---------- -------------- ------------ ------------ ------------ --------------- ---------------------
         1         1   admin      JSP ���δ� ����־��    ������ �غ���           NULL       NULL                      1            0            0               0 2019-09-17 23:18:13.0
         2         3   admin      ���� ����                       �����Դϴ�.      NULL       NULL                      1            1            1             0 2019-09-18 00:00:48.0
         3         2   admin      JAVA��                        JAVA��                 NULL       NULL                      1            1            2              0 201               
         4         4   admin      ���� �����̿�                 ����                      NULL       NULL                      1            2           3               1 2019-09-18 00:21:45.0
    
    
10. ������(BOARD_NUM=1)�� �亯�� ��ϴ�.���� ���ǿ� �´� �������� �ۼ��ϼ���(UPDATE)
              
             ����1) �۹�ȣ 3,2,4��       BOARD_RE_SEQ�� ������ ������ 1�� �����մϴ�. 
                    BOARD_RE_REF�� ���� ������ ��ȣ�̰�
                    BOARD_RE_SEQ���� �������� BOARD_RE_SEQ���� ū ��쿡�� 
                    �亯�� BOARD_RE_SEQ�� 1�����մϴ�. 
 
                       UPDATE BOARD
                        SET BOARD_RE_SEQ = BOARD_RE_SEQ + 1
                        WHERE BOARD_RE_REF = 1 
                        AND BOARD_RE_SEQ>0;    

      RNUM BOARD_NUM BOARD BOARD_SUBJECT         BOARD_CONTENT        BOA BOA BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DA
---------- --------- ----- --------------------- -------------------- --- --- ------------ ------------ ------------ --------------- --------
         1         1 admin JSP ���δ� ����־�� ������ �غ���                           1            0            0               0 19/09/18
         2         3 admin ���� ����              �����Դϴ�.                            1            1            2               1 19/09/18
         3         2 admin JAVA��                JAVA��                                  1            1            3               0 19/09/18
         4         4 admin ���� �����̿�         ����                                    1            2            4               0 19/09/18
                      
             ����2) ���� �Է��ϴ� �亯����  BOARD_RE_REF�� ������ ��ȣ �Դϴ�.(INSERT)
                       BOARD_RE_LEV�� �������� BOARD_RE_LEV���� 1���� �մϴ�.
                       BOARD_RE_SEQ �� �������� BOARD_RE_SEQ ���� 1���� �մϴ�.

                          insert into board 
	 (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	  BOARD_CONTENT, BOARD_RE_REF,
	  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	  BOARD_DATE) 
        values(board_seq.nextval,'admin','1','������ ',
             '������',  1,
               1,1,0,
               sysdate);
   
                       
           ���̺� ��ȸ���)             
       RNUM BOARD_NUM BOARD_NAME BOARD_SUBJECT      BOARD_CONTENT BOARD_FILE BOARD_ORIGINAL BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DATE
       ---- --------- ---------- ------------- ------------- ---------- -------------- ------------ ------------ ------------ --------------- ---------------------
         1         1   admin      JSP ���δ� ����־��    ������ �غ���           NULL       NULL                      1            0            0               0 2019-09-17 23:18:13.0
         2         5   admin      ������           ������           NULL       NULL                                   1            1            1               2 2019-09-18 00:29:59.0
         3         3   admin      ���� ����                       �����Դϴ�.      NULL       NULL                      1            1            2            0 2019-09-18 00:00:48.0
         4         2   admin      JAVA��                        JAVA��                 NULL       NULL                      1            1            3             0 201               
         5         4   admin      ���� �����̿�                 ����                      NULL       NULL                      1            2            4              1 2019-09-18 00:21:45.0             
     
11. ������ ����
        insert into board 
	 (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	  BOARD_CONTENT, BOARD_RE_REF,
	  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	  BOARD_DATE) 
                     values(board_seq.nextval,'admin','1','��������',
              '��������',  board_seq.nextval,
               0,0,0,
               sysdate);

  RNUM BOARD_NUM BOARD BOARD_SUBJECT         BOARD_CONTENT        BOA BOA BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DA
 ---------- --------- ----- --------------------- -------------------- --- --- ------------ ------------ ------------ --------------- --------
         1         6 admin ��������              ��������                                6            0            0               0 19/09/18
         2         1 admin JSP ���δ� ����־�� ������ �غ���                           1            0            0               0 19/09/18
         3         5 admin ������                ������                                  1            1            1               0 19/09/18
         4         3 admin ���� ����              �����Դϴ�.                            1            1            2               0 19/09/18
         5         2 admin JAVA��                JAVA��                                  1            1            3               0 19/09/18
         6         4 admin ���� �����̿�         ����                                    1            2            4               0 19/09/18


12.  6���ۿ� �亯�� �޾ƿ�
           insert into board 
	 (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	  BOARD_CONTENT, BOARD_RE_REF,
	  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	  BOARD_DATE) 
        values(board_seq.nextval,'admin','1','RE: ��������',
              '��ϼ���',  6,
               1,1,0,
               sysdate);

 RNUM BOARD_NUM BOARD BOARD_SUBJECT         BOARD_CONTENT        BOA BOA BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DA
---------- --------- ----- --------------------- -------------------- --- --- ------------ ------------ ------------ --------------- --------
         1         6 admin ��������              ��������                                6            0            0               0 19/09/18
         2         7 admin RE: ��������          ��ϼ���                              6            1            1               0 19/09/18
         3         1 admin JSP ���δ� ����־�� ������ �غ���                           1            0            0               0 19/09/18
         4         5 admin ������                ������                                  1            1            1               0 19/09/18
         5         3 admin ���� ����              �����Դϴ�.                            1            1            2               0 19/09/18
         6         2 admin JAVA��                JAVA��                                  1            1            3               0 19/09/18
         7         4 admin ���� �����̿�         ����                                    1            2            4               0 19/09/18

13. 3���ۿ� ���� �亯�� ��ϴ�.
            ����1) 2, 4�� �ۿ� ���� BOARD_RE_SEQ�� ���� ������ 1���� �մϴ�. (8�� ����)
              update board
               set board_re_seq = board_re_seq + 1
               where board_re_ref = 1
                and board_re_seq>2;

     RNUM BOARD_NUM BOARD BOARD_SUBJECT         BOARD_CONTENT        BOA BOA BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DA
---------- --------- ----- --------------------- -------------------- --- --- ------------ ------------ ------------ --------------- --------
         1         6 admin ��������              ��������                                6            0            0               0 19/09/18
         2         7 admin RE: ��������          ��ϼ���                              6            1            1               0 19/09/18
         3         1 admin JSP ���δ� ����־�� ������ �غ���                           1            0            0               0 19/09/18
         4         5 admin ������                ������                                  1            1            1               0 19/09/18
         5         3 admin ���� ����              �����Դϴ�.                            1            1            2               0 19/09/18
         6         2 admin JAVA��                JAVA��                                  1            1            4               0 19/09/18
         7         4 admin ���� �����̿�         ����                                    1            2            5               0 19/09/18

       
       ����2) 8�� ���� BOARD_RE_REF�� 1, BOARD_RE_LEV�� �亯�� �亯�̹Ƿ� 2, BOARD_RE_SEQ�� 
              3�� ���� �亯�̹Ƿ� 3�� ���� BOARD_RE_SEQ���� 1���� �մϴ�.  
               ��, �亯�� �亯�� �ٴ� ���� BOARD_RE_LEV, BOARD_RE_SEQ ���� ���� 1�� �����մϴ�. 

      insert into board 
	 (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
	  BOARD_CONTENT, BOARD_RE_REF,
	  BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
	  BOARD_DATE) 
        values(board_seq.nextval,'admin','1','RE: ���� ����',
              '����',  1,
               2,3,0,
               sysdate);

      RNUM BOARD_NUM BOARD BOARD_SUBJECT         BOARD_CONTENT BOARD_RE_REF BOARD_RE_LEV BOARD_RE_SEQ BOARD_READCOUNT BOARD_DA
---------- --------- ----- --------------------- -------------------- --- --- ------------ ------------ ------------ --------------- --------
         1         6 admin ��������               ��������    	    6            0            0               0 19/09/18
         2         7 admin  RE: ��������          ��ϼ���        6            1            1               0 19/09/18
         3         1 admin JSP ���δ� ����־��    ������ �غ���      1            0            0               0 19/09/18
         4         5 admin ������                 ������           1            1            1               0 19/09/18
         5         3 admin ���� ����              �����Դϴ�.		1            1            2               0 19/09/18
         6         8 admin  RE: ���� ����         ����             1            2            3               0 19/09/18
         7         2 admin JAVA��                JAVA��          1            1            4               0 19/09/18
         8         4 admin  RE: ���� �����̿�      ����             1            2            5               0 19/09/18

14. 
* �����ϰ��� �ϴ� ��Ģ�� ã���ϴ�.		
		 1. �۹�ȣ 3�� ������ 8���� ���� �����մϴ�.
		    1) 3���� �����ϱ� ������  BOARD_RE_REF(1)   BOARD_RE_LEV(1)   BOARD_RE_SEQ(2)�� ���� �� �� �ֽ��ϴ�.
		    2) ��� BOARD_RE_SEQ���� ������ �� ������ ���ؾ� �մϴ�.
		    3) ���� ��ó�� 3�� ���� �����ϸ�  3�� ���� BOARD_RE_REF, BOARD_RE_LEV ���� ����  
                        BOARD_RE_SEQ�� 2���� ū �� �߿���  ���� ���� BOARD_RE_SEQ ���� ã���ϴ�.
		        
		       =>   SELECT min(board_re_seq )
				    FROM   BOARD  
				    WHERE  BOARD_RE_REF=? 
				    AND    BOARD_RE_LEV=?
				    AND    BOARD_RE_SEQ>?
		         
		    4) 3)���� ����  BOARD_RE_SEQ(4)���� 1�� �� 3���� ���մϴ�.
		       => SELECT min(board_re_seq )-1
				  FROM   BOARD  
				  WHERE  BOARD_RE_REF=? 
				  AND    BOARD_RE_LEV=?
				  AND    BOARD_RE_SEQ>?
		    5)  ������ ���� ��������  BOARD_RE_REF�� ����  BOARD_RE_LEV�� ���ų� ũ�� 
		        BOARD_RE_SEQ�� �ڱ���  BOARD_RE_SEQ ����  4������ ���� ���� �����մϴ�.
		         =>  delete from board
				     where  BOARD_RE_REF = ? 
				     and    BOARD_RE_LEV >=?
				     and    BOARD_RE_SEQ >=?
				     and    BOARD_RE_SEQ <= 4������ ���� ��  
		    
	      2. �۹�ȣ 1���� �����ϴ� ���
	         1)  �۹�ȣ 1���� BOARD_RE_REF,   BOARD_RE_LEV ���� �����鼭  BOARD_RE_SEQ=0���� ū ���� �������� �ʽ��ϴ�.
	         2)  �� ����  ���� BOARD_RE_REF �߿��� BOARD_RE_SEQ�� ���� ū ���� ���ϸ� �˴ϴ�.
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












