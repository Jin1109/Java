package ex22_2_select_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2_Oracle1_column_name_emp {
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
			String select_sql = "select * from emp";
			
			rs = stmt.executeQuery(select_sql);
			
			System.out.println("��ȣ\t�����ȣ\t����̸�\t����\t\t���\t�Ի���\t\t�޿�\tĿ�̼�\t�μ���ȣ");
			System.out.println("-----------------------------------------------------------------------------------------------------");
			
			/*
			 ResultSet ��ü�κ��� select���� ���� ����� ��� ���ؼ��� ���� next() �޼ҵ带 ȣ���ؾ� �մϴ�.
			 rs.next() - ���� �� ��ġ�� �̵��ϴ� �޼ҵ�
			 			 ���ϰ��� boolean���� ������ ���� �о� �Դ��� �����Դϴ�.
			 */
			int i = 0;
			while (rs.next()) {//�� �̻� ���� �����Ͱ� ���� ������ �ݺ�
				int empno = rs.getInt("empno"); // the column value; if the value is SQL NULL, 
												// the value returned is 0
				
				String ename = rs.getString("ename"); // the column value; if the value is SQL NULL, 
													 // the value returned is null
				
				String job = rs.getString("job");
				
				int mgr = rs.getInt("mgr");
				
				//java.util.Date hiredate = rs.getDate("hiredate");//1980-12-17
				//String hiredate = rs.getString("hiredate").substring(0,10);//1980-12-17 00:00:00
				java.util.Date hiredate = rs.getDate("hiredate");//1980-12-17
				
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				
				System.out.printf("%3d\t%5d\t%-8s%-10s\t%-5d\t%-15s%7d%7d%5d\n",
									++i, empno, ename, job, mgr, hiredate, 
									sal, comm, deptno);
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
