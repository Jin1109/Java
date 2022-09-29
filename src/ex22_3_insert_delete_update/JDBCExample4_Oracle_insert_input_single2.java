//�����ͺ��̽��� ���̺�ο� �����͸� �߰��ϴ� ���α׷�
//executeUpdate �޼��� ���
package ex22_3_insert_delete_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample4_Oracle_insert_input_single2 {
	public static void main(String[] args) {
		//"A2000" "�����" 200 "�Ｚ"
		if (args.length != 4) {
			System.out.println(
					"��ǰ�ڵ� ��ǰ�� ���� �����縦 �Է��ϼ���");
			return;
		}
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger" );
			stmt = conn.createStatement();
			
			/*
			 * INSERT, UPDATE, DELETE ���� ���ϴ� �޼���� executUpdate()�Դϴ�.
			   executeUpdate()�� ���ϰ��� INSERTm UPDATE, DELETE ����� row�� ���Դϴ�.
			 
			   1. ���� �����͸� �Է��ϴ� ���
			   insert into goodsinfo
			   values('A1000', '��� �ڵ���'. 100, 'LG')
			   
			   insert into goodsinfo
			   values('A2000', '�����'. 200, '�Ｚ')
			   
			   2. ������ �̿��ؼ� �Է��ϴ� ���
			   	  insert into goodsinfo (code, name, price, maker)
			   	  values( 'args[0]�� ��' , 'args[1]�� ��' , 'args[2]�� ��' , 'args[3]�� ��') 
			 */
			String single = "'";
			String sql = "insert into goodsinfo "
					   + "(code, name, price, maker) "
					   + "values"
					   + "(" + single + args[0] + single + ","	//varchar2 �ڷ���
					   +	   single + args[1] + single + ","
					   +				args[2] +          ","
					   + 	   single + args[3] + single + ")";
			
			System.out.println(sql+"\n");
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
