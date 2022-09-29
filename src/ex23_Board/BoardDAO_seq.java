package ex23_Board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO_seq {
	
	public List<Board> getBoardList(int page, int limit) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		// page : ������
		// limit : ������ �� ����� �� 
		// BOARD_RE_REF desc, BOARD_RE_SEQ asc�� ���� ������ ����
		// �������� �´� rnum�� ���� ��ŭ �������� �������Դϴ�.
		String board_list_sql = 
				  "select * "
		  		+ "from "
				+ "		(select rownum rnum,BOARD_NUM,BOARD_NAME,"
		  		+ "				BOARD_SUBJECT, BOARD_CONTENT,BOARD_FILE, "
				+ "BOARD_ORIGINAL,BOARD_RE_REF,BOARD_RE_LEV,BOARD_RE_SEQ, "
		  		+ "BOARD_READCOUNT,BOARD_DATE from "
				+ "									(select * from board "
		    	+ " 	  							 order by BOARD_RE_REF desc, "
		    	+ "	  								 BOARD_RE_SEQ asc)"
		    	+ "		where rownum<=?) "
		    	+ "where rnum>=? and rnum<=?";
		    		  
		List<Board> list = null;
		// ���������� 10���� ����� ���								1������,	2������, 3������, 4������
		int startrow = (page -1) * limit + 1; // �б� ������ row ��ȣ(1		11		21		31		...
		int endrow = startrow + limit -1;	  // ���� ������ row ��ȣ(10	11		30		31		...
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "board", "1234");
			pstmt = conn.prepareStatement(board_list_sql);
			pstmt.setInt(1, endrow);
			pstmt.setInt(2, startrow);
			pstmt.setInt(3, endrow);	
			rs = pstmt.executeQuery();
			
			int count = 0;
			while (rs.next()) {
				if(count++ == 0)
					list = new ArrayList<Board>();
				Board board = new Board();
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_NAME(rs.getString("BOARD_NAME"));
				board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
				board.setBOARD_FILE(rs.getString("BOARD_FILE"));
				board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
				board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
				board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				board.setBOARD_DATE(rs.getString("BOARD_DATE"));
				list.add(board);
				
			}
			return list; //����Ʈ�� ȣ���� ������ �����ɴϴ�.
		} catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("getBoardList() ����: " + ex);
		} finally {
			try {
				if(rs!=null)
					rs.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			try {
				if(pstmt != null)
					pstmt.close();
			} catch(SQLException ex) {
				ex.printStackTrace();
			}
			try {
				if(conn != null)
					conn.close();
			}catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return null;
	}// getBoard()�޼��� end
	
	
	// �� ����ϱ�
	public int boardInsert(Board board) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		String sql = "";
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "board", "1234");
			
			sql = "insert into board "
		        + "(BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,"
		        + " BOARD_CONTENT,BOARD_RE_REF,"
		        + " BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,"
		        + " BOARD_DATE)"
		        + " values(board_seq.nextval,?,?,?,"
		        + "          ?, board_seq.nextval,"
		        + "          ?,?,?,"
		        + "          sysdate)";
			
			// ���ο� ���� ����ϴ� �κ� �Դϴ�.
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBOARD_NAME());
			pstmt.setString(2, board.getBOARD_PASS());
			pstmt.setString(3, board.getBOARD_SUBJECT());
			pstmt.setString(4, board.getBOARD_CONTENT());
			
			// ������ ��� BOARD_RE_LEV, BOARD_RE_SEQ �ʵ� ���� 0 �Դϴ�.
			pstmt.setInt(5, 0);	// BOARD_RE_LEV �ʵ�
			pstmt.setInt(6, 0); // BOARD_RE_SEQ �ʵ�
			pstmt.setInt(7, 0); // BOARD_READCOUNT �ʵ�
			
			result = pstmt.executeUpdate();
	
		} catch(Exception ex) {
	         System.out.println("boardInsert() ����: " + ex);
	         ex.printStackTrace();
	      } finally {
	         try {
	            if(pstmt != null)
	               pstmt.close();
	         } catch(SQLException ex) {
	            ex.printStackTrace();
	         }
	         try {
	            if(conn != null)
	               conn.close();
	         } catch (SQLException ex) {
	            ex.printStackTrace();
	         }
	      } 
		  return result;
	}// boardInsert()�޼��� end
	
	
		//�� ���� ���� 
		public Board getDetail(int num) {
			PreparedStatement pstmt = null;
			Connection conn = null;
			ResultSet rs = null;
			Board board = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				conn = DriverManager.getConnection(url, "board", "1234");
				pstmt = conn.prepareStatement("select * from board where BOARD_NUM =?");
				pstmt.setInt(1, num);
				rs = pstmt.executeQuery();
				
				if (rs.next()) {
					board = new Board();
					board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
					board.setBOARD_PASS(rs.getString("BOARD_PASS"));//��й�ȣ Ȯ�ν� ���˴ϴ�.
					board.setBOARD_NAME(rs.getString("BOARD_NAME"));
					board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
					board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
					//board.setBOARD_FILE(rs.getString("BOARD_FILE"));
					board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
					board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
					board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
					board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
					board.setBOARD_DATE(rs.getString("BOARD_DATE"));
				}
			} catch(Exception ex) {
		         System.out.println("getDetail() ����: " + ex);
		         ex.printStackTrace();
		      } finally {
		         try {
			           if(rs != null)
			               rs.close();
		         } catch(SQLException ex) {
		            ex.printStackTrace();
		         }
		         try {
		            if(pstmt != null)
		               pstmt.close();
		         } catch (SQLException ex) {
		            ex.printStackTrace();
		         }
		         try {
		        	 if (conn != null)
		        		 conn.close();
		         } catch (SQLException ex) {
		        	 ex.printStackTrace();
		         }
		     } 
			return board;
		}// getDetail()�޼��� end
	
		public int boardModify(Board modifyboard) {
			PreparedStatement pstmt = null;
			Connection conn = null;
			String sql = "update  board "
			           + "set 	  BOARD_SUBJECT= ?, "
			           + "		  BOARD_CONTENT= ? "
			           + "where   BOARD_NUM=? ";		
			int result = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				conn = DriverManager.getConnection(url, "board", "1234");
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, modifyboard.getBOARD_SUBJECT());
				pstmt.setString(2, modifyboard.getBOARD_CONTENT());
				pstmt.setInt(3, modifyboard.getBOARD_NUM());
				result = pstmt.executeUpdate();
			} catch(Exception ex) {
		         System.out.println("boardModify() ����: " + ex);
		         ex.printStackTrace();
		      } finally {
		         try {
		            if(pstmt != null)
		               pstmt.close();
		         } catch (SQLException ex) {
		            ex.printStackTrace();
		         }
		         try {
		        	 if (conn != null)
		        		 conn.close();
		         } catch (SQLException ex) {
		        	 ex.printStackTrace();
		         }
		     } 
			return result;
		}// boardModify()�޼��� end

		// �� �亯
		public int boardReply(Board board) {
	         PreparedStatement pstmt = null;
	         Connection conn = null;
	         String sql = "";      
	         int result = 0;
	         
	         /*
	          * �亯�� �� ���� �� �׷� ��ȣ �Դϴ�.
	          * �亯�� �ް� �Ǹ� �亯 ���� �� ��ȣ�� ���� ���ñ� ��ȣ�� ���� ó���Ǹ鼭
	          * ���� �׷쿡 ���ϰ� �˴ϴ�. �� ��Ͽ��� �����ٶ� �ϳ��� �׷����� ������ ��µ˴ϴ�.
	          */
	         int re_ref = board.getBOARD_RE_REF();
	         
	         /*
	          * ����� ���̸� �ǹ��մϴ�.
	          * ������ ���� ����� ��µ� �� �� �� �鿩���� ó���� �ǰ� ��ۿ� ���� ����� �鿩���Ⱑ �ι� ó���ǰ�
	          * �մϴ�. ������ ��쿡�� �� ���� 0�̰� ������ ����� 1, ����� ����� 2�� �˴ϴ�.
	          */
	         int re_lev = board.getBOARD_RE_LEV();
	         
	         // ���� ���� �� �߿��� �ش� ���� ��µǴ� �����Դϴ�.
	         int re_seq = board.getBOARD_RE_SEQ();
	         
	         try{
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            String url = "jdbc:oracle:thin:@localhost:1521:xe";
	            conn = DriverManager.getConnection(url, "board", "1234");
	            
	            // Ʈ������� �̿��ϱ� ���ؼ� setAutoCommit�� false�� �����մϴ�.
	            conn.setAutoCommit(false);
	            
	            // BOARD_RE_RFFE, BOARD_RE_SEQ ���� Ȯ���Ͽ� ���� �ۿ� �ٸ� ����� ������
	            // �ٸ� ��۵��� BOARD_RE_SEQ���� 1�� �����մϴ�.
	            // ���� ���� �ٸ� ��ۺ��� �տ� ��µǰ� �ϱ� ���ؼ� �Դϴ�.
	            sql = " update board " 
	                    + "set    BOARD_RE_SEQ = BOARD_RE_SEQ + 1 " 
	                   + "where  BOARD_RE_REF = ? "
	                     + "and    BOARD_RE_SEQ > ?";
	            
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setInt(1, re_ref);
	            pstmt.setInt(2, re_seq);
	            result = pstmt.executeUpdate();
	            pstmt.close();
	            
	            // ����� �亯 ���� BOARD_RE_LEV, BOARD_RE_SEQ ���� ���� �ۺ��� 1�� ������ŵ�ϴ�.
	            re_seq = re_seq + 1;
	            re_lev = re_lev + 1;
	            
	            sql = "insert into board " 
	                    + "(BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,"
	                   + " BOARD_CONTENT, BOARD_FILE, BOARD_RE_REF," 
	                    + " BOARD_RE_LEV, BOARD_RE_SEQ,"
	                   + " BOARD_READCOUNT,BOARD_DATE) " 
	                    + "values(board_seq.nextval,?,?,?,?,?,?,?,?,?,sysdate)";
	            
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setString(1, board.getBOARD_NAME());
	            pstmt.setString(2, board.getBOARD_PASS());
	            pstmt.setString(3, board.getBOARD_SUBJECT());
	            pstmt.setString(4, board.getBOARD_CONTENT());
	            pstmt.setString(5, ""); // �亯���� ������ ���ε����� �ʽ��ϴ�.
	            pstmt.setInt(6, re_ref);
	            pstmt.setInt(7, re_lev);
	            pstmt.setInt(8, re_seq);
	            pstmt.setInt(9, 0); // BOARD_READCOUNT(��ȸ��)�� 0
	            result = pstmt.executeUpdate();
	            conn.commit(); // commit�մϴ�.
	            
	         } catch(Exception ex) {
	            ex.printStackTrace();
	               System.out.println("boardReply() ����: " + ex);
	             try {
	               if (conn != null)
	                  conn.rollback();
	            } catch (SQLException e) {
	               e.printStackTrace();
	            }
	      } finally {
	               try {
	                  if(pstmt != null)
	                     pstmt.close();
	               } catch (SQLException ex) {
	                  ex.printStackTrace();
	               }
	               try {
	                  if (conn != null)
	                     conn.close();
	               } catch (SQLException ex) {
	                  ex.printStackTrace();
	               }
	           }
	         return result;
	      }

		//�� ����
		public int boardDelete(Board board) {
			/*
		       * ������ ����
		       * 1. ������ �۰� ���� BOARD_RE_REF ���� ���´�.
		       * 2. ������ �۰� ���ų� ���� BOARD_RE_LEV ���� ���´�.
		       * 3. ������ �۰� ���ų� ���� BOARD_RE_SEQ ���� ���´�.
		       *    ��, BOARD_RE_SEQ ������ ������ �۰�
		       *        BOARD_RE_REF, BOARD_RE_LEV ���� ���� ������ ����
		       *        BOARD_RE_SEQ���� ū �͵� �� ���� ���������� 1�� �� ���� ���´�.
		       *        ���� �������� ������ BOARD_RE_REF �� �� ���� ū BOARD_RE_SEQ���� ���´�.
		       */
			
			PreparedStatement pstmt = null;
			Connection conn = null;
			
			String board_delete_sql =
					"delete from board "
					+ "			 where  BOARD_RE_REF = ?"
					+ " 		  and   BOARD_RE_LEV >=?"
					+ "			  and   BOARD_RE_SEQ >=?"
					+ " 		  and   BOARD_RE_SEQ <=("
					+ "									nvl((SELECT min(board_re_seq)-1"
					+ "			                             FROM   BOARD "
					+ " 		                             WHERE  BOARD_RE_REF=? "
					+ "			                             AND    BOARD_RE_LEV=? "
					+ " 		                             AND    BOARD_RE_SEQ>?) , " 
					+ "			                            (SELECT max(board_re_seq) "
					+ " 		                             FROM   BOARD "
					+ "                                    	 WHERE  BOARD_RE_REF=? ))"
	                + "			                        )";
	        int result = 0;
	        try {
	        	Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				conn = DriverManager.getConnection(url, "board", "1234");
				pstmt = conn.prepareStatement(board_delete_sql);
				pstmt.setInt(1, board.getBOARD_RE_REF());
				pstmt.setInt(2, board.getBOARD_RE_LEV());
				pstmt.setInt(3, board.getBOARD_RE_SEQ());
				pstmt.setInt(4, board.getBOARD_RE_REF());
				pstmt.setInt(5, board.getBOARD_RE_LEV());
				pstmt.setInt(6, board.getBOARD_RE_SEQ());
				pstmt.setInt(7, board.getBOARD_RE_REF());
				
				// ���� ���� �� ������ �ο�(���ڵ�)������ ��ȯ�˴ϴ�.
				result = pstmt.executeUpdate();
	        } catch (Exception ex) {
	        	ex.printStackTrace();
	        	System.out.println("boardDelete() ����: " + ex);
	        } finally {
	        	if (pstmt != null)
	        		try {
	        			pstmt.close();
	        	} catch (SQLException ex) {
	        		ex.printStackTrace();
	        	}
	        }
			return result;
		}// boardDelte�޼��� end


		public int count() {
			PreparedStatement pstmt = null;
			Connection conn = null;
			ResultSet rs = null;
			String sql = "select count(*) from board";
			int count = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				conn = DriverManager.getConnection(url, "board", "1234");
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					count = rs.getInt(1);
				}
				
			} catch (Exception ex) {
				ex.printStackTrace();
				System.out.println("getBoardList() ���� : " + ex);
			} finally {
				try {
			         if(rs != null)
			        	rs.close();
		         } catch(SQLException ex) {
		            ex.printStackTrace();
		         }
		         try {
		            if(pstmt != null)
		               pstmt.close();
		         } catch (SQLException ex) {
		            ex.printStackTrace();
		         }
		         try {
		        	 if (conn != null)
		        		 conn.close();
		         } catch (SQLException ex) {
		        	 ex.printStackTrace();
		         }
			}
			return count;
		}

}
	


