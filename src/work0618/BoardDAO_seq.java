package work0618;

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
}
	
	//	public ArrayList<BoardDAO_seq> search(int col_index, String search_word) {
//		ArrayList<BoardDAO_seq> list=null;
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//		String column_name[] = {"BOARD_NUM", "BOARD_NAME", "BOARD_PASS", "BOARD_SUBJECT",
//				 				"BOARD_CONTENT", "BOARD_RE_REF", 
//				 				"BOARD_RE_LEV", "BOARD_RE_SEQ", "BOARD_READCOUNT",
//				 				"BOARD_DATE"};
//		String sql = "select * from board";
//		
//		if (col_index != 7) {// 8�� ���Ḧ �ǹ�
//			
//			String single = "";
//			if (col_index == 1 || col_index == 2 || col_index == 4)
//				// ename, job, hiredate�� ' �ʿ�
//				single = "'";
//			
//			sql = sql + " where " + column_name[col_index] + "=" + single + search_word + single;
//		}
//		
//		System.out.println("\n" + sql.toString() + "\n");
//		
//		try {
//			//1�ܰ� : JDBC ����̹��� �ε��Ѵ�.
//			String driver = "oracle.jdbc.driver.OracleDriver";
//			Class.forName(driver);
//			
//			//2�ܰ� : DB�� �����Ѵ�.
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			conn = DriverManager.getConnection(url, "board", "1234" );
//			
//			/* ������ ���̽��� �մ� ���̺��� �����͸� �о���� ���� Statement ��ü�� �ʿ� �մϴ�.
//			   2�ܰԿ��� ���� Connection ��ü�� ���� createStatement �޼ҵ带 ȣ�⿡�� ����ϴ�.
//			 */
//			stmt = conn.createStatement();
//			
//			/*
//			 	Statement Ÿ���� java.sql ��Ű���� ���ϴ� �������̽� �̸�����
//			 	Select���� �����ϴ� excuteQuery��� �޼ҵ尡 �ֽ��ϴ�.
//			 	�� �޼ҵ��� �Ķ���ͷ� select ������ �Ѱ��־�� �մϴ�.
//			 	������ �����ϰ�, �� ����� ResultSet ��ü�� �����մϴ�.
//			 */
//			
//			rs = stmt.executeQuery(sql);
//			
//			/*
//			 ResultSet ��ü�κ��� select���� ���� ����� ��� ���ؼ��� ���� next() �޼ҵ带 ȣ���ؾ� �մϴ�.
//			 rs.next() - ���� �� ��ġ�� �̵��ϴ� �޼ҵ�
//			 			 ���ϰ��� boolean���� ������ ���� �о� �Դ��� �����Դϴ�.
//			 */
//			int i = 0;
//			
//			while (rs.next()) {//�� �̻� ���� �����Ͱ� ���� ������ �ݺ�
//				if(i++ ==0) {
//					list = new ArrayList<BoardDAO_seq>();
//				}
//				Board st = new Board();
//				st.setBOARD_NUM(rs.getInt(1));
//				st.setBOARD_NAME(rs.getString(2));
//				st.setBOARD_PASS(rs.getString(3));
//				st.setBOARD_SUBJECT(rs.getString(4));
//				st.setBOARD_CONTENT(rs.getString(5));
//				st.setBOARD_FILE(rs.getString(6));
//				st.setBOARD_ORIGINAL(rs.getString(7));
//				st.setBOARD_RE_REF(rs.getInt(8));
//				st.setBOARD_RE_LEV(rs.getInt(9));
//				st.setBOARD_RE_SEQ(rs.getInt(10));
//				st.setBOARD_READCOUNT(rs.getInt(11));
//				st.setBOARD_DATE(rs.getString(12));
//				list.add(st);
//			}
//		} catch (ClassNotFoundException cnfe) {
//			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�."    + cnfe.getMessage());
//		} catch (SQLException se) {
//			System.out.println(se.getMessage());
//		} finally { //������ �ݴ��� ������� ���� �ش�.
//			try {
//				if (rs != null)	
//					rs.close();	//ResultSet�� ���´�
//			} catch (SQLException e) {
//				System.out.println(e.getMessage());
//			}
//			try {
//				if (stmt != null)
//					stmt.close();	//Statement�� ���´�
//			} catch (SQLException e) {
//				System.out.println(e.getMessage());
//			}
//			try {
//				if (conn != null)
//					conn.close(); //4�ܰ� : DB������ ���´�.
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//		}//finally
//		return list;
//		//return null;
//	}

