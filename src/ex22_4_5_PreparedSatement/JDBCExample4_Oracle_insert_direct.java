//데이터베이스의 테이블로부터 조건에 맞는 데이터를 입력받아 처리하는 프로그램
//arguments탭에 "디지털 TV"라고 입력하세요
package ex22_4_5_PreparedSatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample4_Oracle_insert_direct {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger" );
//			stmt = conn.createStatement();
			
			/*
			 * 1. 직접 데이터를 입력하는 경우
			 * insert into goodsinfo
			 * values('A1000', '고급 핸드폰'. 100, 'LG')
			 */
//			String sql= 
//				 "insert into goodsinfo "
//				+ "values('A1000', '고급 핸드폰', 100, 'LG')";
			
			String sql= 
					 "insert into goodsinfo "
					+ "values(?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, "A1002");
			pstmt.setString(2, "고급소파");
			pstmt.setInt(3, 900000);
			pstmt.setString(4, "삼성");
			
			System.out.println(sql);
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum + "행이 추가 되었습니다.");
		
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
