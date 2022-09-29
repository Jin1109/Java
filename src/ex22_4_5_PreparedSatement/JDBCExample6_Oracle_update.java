//데이터베이스의 테이블에 데이터를 삭제하는 프로그램
//executeUpdate 메서드 사용
package ex22_4_5_PreparedSatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample6_Oracle_update {
	public static void main(String[] args) {
		//"HTA" "10001"
		if (args.length != 2) { //아이리버 -> 오라클
			System.out.println("상품코드 제조사 입력하세요");
			return;
		}
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger" );
			
//			String single = "'";
//			String update_sql 
//					   = " update goodsinfo "
//					   + " set 	  maker = " + single + args[1] + single
//					   + " where  code  = " + single + args[0] + single;
			
			String update_sql 
			   			= " update goodsinfo "
			   			+ " set    maker = ?" 
			   			+ "where  code  = ?";
			
			pstmt = conn.prepareStatement(update_sql.toString());
			System.out.println(update_sql);
			
			pstmt.setString(1, args[0]); //"10001"
			pstmt.setString(2, args[1]); //"HTA" 
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum + "행이 수정 되었습니다.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다."    + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally { //연결한 반대의 순서대로 끊어 준다.
			try {
				if (pstmt != null)
					pstmt.close();	//Statement를 끊는다
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close(); //4단계 : DB연결을 끊는다.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally
	}
}
