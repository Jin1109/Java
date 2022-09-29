//�����ͺ��̽��� ���̺�ο� �����͸� �߰��ϴ� ���α׷�
//executeUpdate �޼��� ���
package ex22_4_5_PreparedSatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample4_Oracle_insert_input_single2 {
	public static void main(String[] args) {
		//"A6000" "��� �ڵ���" 100 "LG"
		if (args.length != 4) {
			System.out.println(
					"��ǰ�ڵ� ��ǰ�� ���� �����縦 �Է��ϼ���");
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
			
//			String single = "'";
//			String sql = "insert into goodsinfo "
//					   + "(code, name, price, maker) "
//					   + "values"
//					   + "(" + single + args[0] + single + ","	//varchar2 �ڷ���
//					   +	   single + args[1] + single + ","
//					   +				args[2] +          ","
//					   + 	   single + args[3] + single + ")";
			
//			String single = "'";
			String sql = "insert into goodsinfo "
					   + "(code, name, price, maker) "
					   + "values"
					   + "(?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, args[0]);
			pstmt.setString(2, args[1]);
			pstmt.setInt(3, Integer.parseInt(args[2]));
			pstmt.setString(4, args[3]);
//			System.out.println(sql+"\n");
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
