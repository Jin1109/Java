//데이터베이스의 테이블에 데이터를 삭제하는 프로그램
//executeUpdate 메서드 사용
package ex22_3_insert_delete_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample6_Oracle_update {
	//1004 오라클
	// 4 1004 		전자사전		180000		오라클
	public static void main(String[] args) {
		if (args.length != 2) { //아이리버 -> 오라클
			System.out.println("상품코드 제조사 입력하세요");
			return;
		}
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger" );
			stmt = conn.createStatement();
			
			String single = "'";
			String update_sql 
					   = " update goodsinfo "
					   + " set 	  maker = " + single + args[1] + single
					   + " where  code  = " + single + args[0] + single;
			System.out.println(update_sql);
			
			int rowNum = stmt.executeUpdate(update_sql);
			System.out.println(rowNum + "행이 수정 되었습니다.");
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
