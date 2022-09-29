//�����ͺ��̽��� ���̺�κ��� ���ǿ� �´� �����͸� �Է¹޾� ó���ϴ� ���α׷�
//arguments�ǿ� "������ TV"��� �Է��ϼ���
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
			 * 1. ���� �����͸� �Է��ϴ� ���
			 * insert into goodsinfo
			 * values('A1000', '��� �ڵ���'. 100, 'LG')
			 */
//			String sql= 
//				 "insert into goodsinfo "
//				+ "values('A1000', '��� �ڵ���', 100, 'LG')";
			
			String sql= 
					 "insert into goodsinfo "
					+ "values(?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, "A1002");
			pstmt.setString(2, "��޼���");
			pstmt.setInt(3, 900000);
			pstmt.setString(4, "�Ｚ");
			
			System.out.println(sql);
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum + "���� �߰� �Ǿ����ϴ�.");
		
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�."    + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally { //������ �ݴ��� ������� ���� �ش�.
			try {
				if (pstmt != null)
					pstmt.close();	//Statement�� ���´�
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close(); //4�ܰ� : DB������ ���´�.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally
	}
}
