//�����ͺ��̽��� ���̺�κ��� ���ǿ� �´� �����͸� �Է¹޾� ó���ϴ� ���α׷�
//arguments�ǿ� "������ TV"��� �Է��ϼ���
package test;

import java.sql.*;

public class JDBCExample3_Oracle2_where_input {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("��ǰ�� �Է��ϼ���");
			return;
		}
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");		
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
						
			String sel_where_sql
			= "select code, name, price, maker "
			+ "from goodsinfo "
			+ "where name = ? or name = ? or name = ?";
			
			pstmt = conn.prepareStatement(sel_where_sql.toString());
			
			pstmt.setString(1, "������ TV");
			pstmt.setString(2, "DVD �÷��̾�");
			pstmt.setString(3, "������ ī�޶�");
			rs = pstmt.executeQuery();
			
			System.out.println(sel_where_sql+"\n");
			System.out.println("��ȣ\t��ǰ�ڵ�\t��ǰ��\t\t����\t������");
			System.out.println("-----------------------------------------------------");
			
			int i = 0;
			while (rs.next()) {//�� �̻� ���� �����Ͱ� ���� ������ �ݺ�
				String code = rs.getString("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String maker = rs.getString("maker");
				
				System.out.printf("%d\t%-7s\t%-10s\t%d\t%-5s\n",
						++i,code, name, price, maker);
			}
			
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
