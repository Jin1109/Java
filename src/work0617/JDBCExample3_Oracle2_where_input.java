//�����ͺ��̽��� ���̺�κ��� ���ǿ� �´� �����͸� �Է¹޾� ó���ϴ� ���α׷�
//arguments�ǿ� "������ TV"��� �Է��ϼ���
package work0617;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample3_Oracle2_where_input {
	public static void main(String[] args) {
		if (args.length !=1) {
			System.out.println("��ǰ���� �Է��ϼ���");
			return;
		}
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger" );
//			stmt = conn.createStatement();
			
//			String sel_where_sql = 
//				 "select code, name, price, maker "
//				+ "from goodsinfo "
//				+ "where name = '" + args[0] + "'";

			String sel_where_sql = 
					 "select code, name, price, maker "
					+ "from goodsinfo "
					+ "where name = ? or name = ? or name = ?";

			
			
			pstmt = conn.prepareStatement(sel_where_sql.toString());
			
			pstmt.setString(1, "������ TV");
			pstmt.setString(2, "DVD �÷��̾�");
			pstmt.setString(3, "������ ī�޶�");
			
			System.out.println(sel_where_sql+"\n");
			
//			rs = stmt.executeQuery(sel_where_sql );
			rs = pstmt.executeQuery();
			System.out.println("��ȣ\t��ǰ�ڵ�\t��ǰ��\t\t����\t������");
			System.out.println("-----------------------------------------------------------------------------------------------------");
			int i = 0;
			while (rs.next()) {//�� �̻� ���� �����Ͱ� ���� ������ �ݺ�
				String code = rs.getString("code"); 
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String maker = rs.getString("maker");
				 System.out.printf("%d\t%-7s\t%-10s\t%d\t%-5s\n",
		                  ++i, code, name, price, maker);

			}
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�."    + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally { //������ �ݴ��� ������� ���� �ش�.
			try {
				if (rs != null)	
					rs.close();	//ResultSet�� ���´�
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
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
