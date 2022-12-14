//데이터베이스의 테이블로부터 조건에 맞는 데이터를 입력받아 처리하는 프로그램
//arguments탭에 "디지털 TV"라고 입력하세요
package work0617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample3_Oracle2_where_input {
	public static void main(String[] args) {
		if (args.length !=1) {
			System.out.println("상품명을 입력하세요");
			return;
		}
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger" );
//			stmt = conn.createStatement();
			
//			String sel_where_sql = 
//				 "select code, name, price, maker "
//				+ "from goodsinfo "
//				+ "where name = '" + args[0] + "'";

			String sel_where_sql = 
					 "select code, name, price, maker "
					+ "from goodsinfo "
					+ "where name = ? or name = ? or name = ?";

			
			
			pstmt = conn.prepareStatement(sel_where_sql.toString());
			
			pstmt.setString(1, "디지털 TV");
			pstmt.setString(2, "DVD 플레이어");
			pstmt.setString(3, "디지털 카메라");
			
			System.out.println(sel_where_sql+"\n");
			
//			rs = stmt.executeQuery(sel_where_sql );
			rs = pstmt.executeQuery();
			System.out.println("번호\t상품코드\t상품명\t\t가격\t제조자");
			System.out.println("-----------------------------------------------------------------------------------------------------");
			int i = 0;
			while (rs.next()) {//더 이상 읽을 데이터가 없을 때까지 반복
				String code = rs.getString("code"); 
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String maker = rs.getString("maker");
				 System.out.printf("%d\t%-7s\t%-10s\t%d\t%-5s\n",
		                  ++i, code, name, price, maker);

			}
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다."    + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally { //연결한 반대의 순서대로 끊어 준다.
			try {
				if (rs != null)	
					rs.close();	//ResultSet를 끊는다
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
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
