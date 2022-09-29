//�����ͺ��̽��� ���̺� �����͸� �����ϴ� ���α׷�
//executeUpdate �޼��� ���
package work0617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample5_Oracle_delete {
	public static void main(String[] args) {
		if (args.length != 1) { //A2000
			System.out.println("��ǰ�ڵ� �Է��ϼ���");
			return;
		}
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger" );
//			stmt = conn.createStatement();
			
			//delete from goodsinfo where code = 'args[0]�� ��'
//			String single = "'";
//			String del_sql 
//					   = "delete from goodsinfo "
//					   + "where code = " + single + args[0] + single;
			
			String del_sql 
			   = "delete from goodsinfo "
			   + "where code = ?";
			
			pstmt = conn.prepareStatement(del_sql.toString());
			System.out.println(del_sql);
			
			pstmt.setString(1, "��޼���");
			int rowNum = pstmt.executeUpdate();
			System.out.println(rowNum + "���� ���� �Ǿ����ϴ�.");
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
