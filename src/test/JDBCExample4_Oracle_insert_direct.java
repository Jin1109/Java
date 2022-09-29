package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample4_Oracle_insert_direct {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");		
						
			/*
			 * 1. 직접 데이터를 입력하는 경우
			 * insert into goodsinfo
			   values('A1000', '고급 핸드폰', 100, 'LG')
			 */
			String sql = "insert into goodsinfo "
					   + "values(?,?,?,?)";		
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, "10007");
			pstmt.setString(2, "슈퍼카");
			pstmt.setInt(3, 100111);
			pstmt.setString(4, "페라리");
			
			System.out.println(sql);
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum + "행이 추가되었습니다.");

		}catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		}catch (SQLException se) {
			System.out.println(se.getMessage());
		}finally {
			try {
				if (rs != null)
					rs.close();
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (pstmt != null)
					pstmt.close();
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close(); // 4단계 : DB연결을 끊는다.
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
