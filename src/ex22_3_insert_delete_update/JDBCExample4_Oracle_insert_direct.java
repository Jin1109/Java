//�����ͺ��̽��� ���̺�κ��� ���ǿ� �´� �����͸� �Է¹޾� ó���ϴ� ���α׷�
//arguments�ǿ� "������ TV"��� �Է��ϼ���
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
			 * 1. ���� �����͸� �Է��ϴ� ���
			 * insert into goodsinfo
			 * values('A1000', '��� �ڵ���'. 100, 'LG')
			 */
			String sql= 
				 "insert into goodsinfo "
				+ "values('A1000', '��� �ڵ���', 100, 'LG')";
			
			System.out.println(sql);
			int rowNum = stmt.executeUpdate(sql);
			System.out.println(rowNum + "���� �߰� �Ǿ����ϴ�.");
		
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�."    + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally { //������ �ݴ��� ������� ���� �ش�.
			try {
				if (stmt != null)
					stmt.close();	//Statement�� ���´�
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
