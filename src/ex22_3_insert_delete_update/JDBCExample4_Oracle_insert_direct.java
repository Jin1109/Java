//데이터베이스의 테이블로부터 조건에 맞는 데이터를 입력받아 처리하는 프로그램
//arguments탭에 "디지털 TV"라고 입력하세요
package ex22_3_insert_delete_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample4_Oracle_insert_direct {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger" );
			stmt = conn.createStatement();
			
			/*
			 * 1. 직접 데이터를 입력하는 경우
			 * insert into goodsinfo
			 * values('A1000', '고급 핸드폰'. 100, 'LG')
			 */
			String sql= 
				 "insert into goodsinfo "
				+ "values('A1000', '고급 핸드폰', 100, 'LG')";
			
			System.out.println(sql);
			int rowNum = stmt.executeUpdate(sql);
			System.out.println(rowNum + "행이 추가 되었습니다.");
		
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다."    + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally { //연결한 반대의 순서대로 끊어 준다.
			try {
				if (stmt != null)
					stmt.close();	//Statement를 끊는다
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
