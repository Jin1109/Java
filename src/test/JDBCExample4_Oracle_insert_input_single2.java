package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample4_Oracle_insert_input_single2 {

	public static void main(String[] args) {
		//"A2000" "�����" 200 "�Ｚ"
		if(args.length != 4) {
			System.out.println("��ǰ�ڵ� ��ǰ�� ���� �����縦 �Է��ϼ���");
			return;
		}		
		Connection conn = null;
		PreparedStatement pstmt = null;		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");		
			
			/*
			 * INSERT, UPDATE, DELETE ���� �����ϴ� �޼���� executeUpdate()�Դϴ�.
			   executeUpdate()�� ���ϰ��� INSERT, UPDATE, DELETE ���� �� row�� ���Դϴ�.			 		
			
			 * 1. ���� �����͸� �Է��ϴ� ���
			      insert into goodsinfo
			      values('A1000', '��� �ڵ���', 100, 'LG')
			
			 * 2. ������ �̿��ؼ� �Է��ϴ� ���
			   	  insert into goodsinfo (code, name, prine, maker)
			   	  values( 'args[0]�� ��', 'args[1]�� ��', 'args[2]�� ��', 'args[3]�� ��')
			 */			
//			String single = "'";
			String sql = "insert into goodsinfo "
					   + "(code, name, price, maker) "
					   + "values"
					   + "(?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, "10008");
			pstmt.setString(2, "ī");
			pstmt.setInt(3, 1001111);
			pstmt.setString(4, "����");
			System.out.println(sql+"\n");			
			int rowNum = pstmt.executeUpdate();
			
			System.out.println(rowNum + "���� �߰��Ǿ����ϴ�.");

		}catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		}catch (SQLException se) {
			System.out.println(se.getMessage());
		}finally {
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
