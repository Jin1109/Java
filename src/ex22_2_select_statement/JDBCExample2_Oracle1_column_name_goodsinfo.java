package ex22_2_select_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2_Oracle1_column_name_goodsinfo {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1�ܰ� : JDBC ����̹��� �ε��Ѵ�.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2�ܰ� : DB�� �����Ѵ�.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger" );
			
			/* ������ ���̽��� �մ� ���̺��� �����͸� �о���� ���� Statement ��ü�� �ʿ� �մϴ�.
			   2�ܰԿ��� ���� Connection ��ü�� ���� createStatement �޼ҵ带 ȣ�⿡�� ����ϴ�.
			 */
			stmt = conn.createStatement();
			
			/*
			 	Statement Ÿ���� java.sql ��Ű���� ���ϴ� �������̽� �̸�����
			 	Select���� �����ϴ� excuteQuery��� �޼ҵ尡 �ֽ��ϴ�.
			 	�� �޼ҵ��� �Ķ���ͷ� select ������ �Ѱ��־�� �մϴ�.
			 	������ �����ϰ�, �� ����� ResultSet ��ü�� �����մϴ�.
			 */
			String select_sql =
					"select code, name, price, maker from goodsinfo";
			
			rs = stmt.executeQuery(select_sql);
			
			System.out.println("��ȣ\t��ǰ�ڵ�\t��ǰ��\t\t����\t������");
			System.out.println("-----------------------------------------------------------------------------------------------------");
			
			/*
			 ResultSet ��ü�κ��� select���� ���� ����� ��� ���ؼ��� ���� next() �޼ҵ带 ȣ���ؾ� �մϴ�.
			 rs.next() - ���� �� ��ġ�� �̵��ϴ� �޼ҵ�
			 			 ���ϰ��� boolean���� ������ ���� �о� �Դ��� �����Դϴ�.
			 */
			int i = 0;
			while (rs.next()) {//�� �̻� ���� �����Ͱ� ���� ������ �ݺ�
				String code = rs.getString("code"); 
				String name = rs.getString("name");
				//getInt("price") : Į�� price ���� int ������ �����ϴ� �޼ҵ�
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
