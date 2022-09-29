//�����ͺ��̽��� ���̺��� �����͸� �����ϴ� ���α׷�
//executeUpdate �޼��� ���
package ex22_4_5_PreparedSatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample6_Oracle_update {
	public static void main(String[] args) {
		//"HTA" "10001"
		if (args.length != 2) { //���̸��� -> ����Ŭ
			System.out.println("��ǰ�ڵ� ������ �Է��ϼ���");
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