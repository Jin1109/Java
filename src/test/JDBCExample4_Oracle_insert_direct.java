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
			 * 1. ���� �����͸� �Է��ϴ� ���
			 * insert into goodsinfo
			   values('A1000', '��� �ڵ���', 100, 'LG')
			 */
			String sql = "insert into goodsinfo "
					   + "values(?,?,?,?)";		
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, "10007");
			pstmt.setString(2, "����ī");
			pstmt.setInt(3, 100111);
			pstmt.setString(4, "���");
			
			System.out.println(sql);
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum + "���� �߰��Ǿ����ϴ�.");

		}catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
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
					conn.close(); // 4�ܰ� : DB������ ���´�.
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
