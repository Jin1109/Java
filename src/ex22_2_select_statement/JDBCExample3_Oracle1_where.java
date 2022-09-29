package ex22_2_select_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample3_Oracle1_where {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger" );
			stmt = conn.createStatement();
			String sel_where_sql 
			= "select code, name, price, maker "
			+ "from goodsinfo "
			+ "where name = '������ TV'";
			
			System.out.println(sel_where_sql+"\n");
			
			rs = stmt.executeQuery(sel_where_sql );
			
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
