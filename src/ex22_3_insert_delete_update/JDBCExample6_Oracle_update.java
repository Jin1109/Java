//�����ͺ��̽��� ���̺� �����͸� �����ϴ� ���α׷�
//executeUpdate �޼��� ���
package ex22_3_insert_delete_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample6_Oracle_update {
	//1004 ����Ŭ
	// 4 1004 		���ڻ���		180000		����Ŭ
	public static void main(String[] args) {
		if (args.length != 2) { //���̸��� -> ����Ŭ
			System.out.println("��ǰ�ڵ� ������ �Է��ϼ���");
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
			System.out.println(rowNum + "���� ���� �Ǿ����ϴ�.");
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
