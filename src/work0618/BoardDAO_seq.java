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
		// page : 페이지
		// limit : 페이지 당 목록의 수 
		// BOARD_RE_REF desc, BOARD_RE_SEQ asc에 의해 정렬한 것을
		// 조건절에 맞느 rnum의 밤위 만큼 가져오는 쿼리문입니다.
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
		// 한페이지당 10개씩 목록인 경우								1페이지,	2페이지, 3페이지, 4페이지
		int startrow = (page -1) * limit + 1; // 읽기 시작한 row 번호(1		11		21		31		...
		int endrow = startrow + limit -1;	  // 읽을 마지막 row 번호(10	11		30		31		...
		
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
			return list; //리스트를 호출한 곳으로 가져옵니다.
		} catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("getBoardList() 에러: " + ex);
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
	}// getBoard()메서드 end
	
	
	// 글 등록하기
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
			
			// 새로운 글을 등록하는 부분 입니다.
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBOARD_NAME());
			pstmt.setString(2, board.getBOARD_PASS());
			pstmt.setString(3, board.getBOARD_SUBJECT());
			pstmt.setString(4, board.getBOARD_CONTENT());
			
			// 원문의 경우 BOARD_RE_LEV, BOARD_RE_SEQ 필드 값은 0 입니다.
			pstmt.setInt(5, 0);	// BOARD_RE_LEV 필드
			pstmt.setInt(6, 0); // BOARD_RE_SEQ 필드
			pstmt.setInt(7, 0); // BOARD_READCOUNT 필드
			
			result = pstmt.executeUpdate();
	
		} catch(Exception ex) {
	         System.out.println("boardInsert() 에러: " + ex);
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
	}// boardInsert()메서드 end
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
//		if (col_index != 7) {// 8은 종료를 의미
//			
//			String single = "";
//			if (col_index == 1 || col_index == 2 || col_index == 4)
//				// ename, job, hiredate는 ' 필요
//				single = "'";
//			
//			sql = sql + " where " + column_name[col_index] + "=" + single + search_word + single;
//		}
//		
//		System.out.println("\n" + sql.toString() + "\n");
//		
//		try {
//			//1단계 : JDBC 드라이버를 로드한다.
//			String driver = "oracle.jdbc.driver.OracleDriver";
//			Class.forName(driver);
//			
//			//2단계 : DB에 연결한다.
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			conn = DriverManager.getConnection(url, "board", "1234" );
//			
//			/* 데이터 베이스에 잇는 테이블의 데이터를 읽어오기 위해 Statement 객체가 필요 합니다.
//			   2단게에서 얻은 Connection 객체에 대해 createStatement 메소드를 호출에서 얻습니다.
//			 */
//			stmt = conn.createStatement();
//			
//			/*
//			 	Statement 타입은 java.sql 패키지에 속하는 인터페이스 이름으로
//			 	Select문을 실해하는 excuteQuery라는 메소드가 있습니다.
//			 	이 메소드의 파라미터로 select 문장을 넘겨주어야 합니다.
//			 	보내서 실해하고, 그 결과를 ResultSet 객체를 리턴합니다.
//			 */
//			
//			rs = stmt.executeQuery(sql);
//			
//			/*
//			 ResultSet 객체로부터 select문의 실행 결과를 얻기 위해서는 먼저 next() 메소드를 호출해야 합니다.
//			 rs.next() - 다음 행 위치로 이동하는 메소드
//			 			 리턴값은 boolean으로 실제로 행을 읽어 왔는지 여부입니다.
//			 */
//			int i = 0;
//			
//			while (rs.next()) {//더 이상 읽을 데이터가 없을 때까지 반복
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
//			System.out.println("해당 클래스를 찾을 수 없습니다."    + cnfe.getMessage());
//		} catch (SQLException se) {
//			System.out.println(se.getMessage());
//		} finally { //연결한 반대의 순서대로 끊어 준다.
//			try {
//				if (rs != null)	
//					rs.close();	//ResultSet를 끊는다
//			} catch (SQLException e) {
//				System.out.println(e.getMessage());
//			}
//			try {
//				if (stmt != null)
//					stmt.close();	//Statement를 끊는다
//			} catch (SQLException e) {
//				System.out.println(e.getMessage());
//			}
//			try {
//				if (conn != null)
//					conn.close(); //4단계 : DB연결을 끊는다.
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//		}//finally
//		return list;
//		//return null;
//	}

