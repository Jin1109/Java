//�����ͺ��̽��� ���̺� ������ �д� ���α׷�
package ex22_4_2_Statement_Search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
DAO(Data Access Object)Ŭ����
- ������ ���̽��� �����Ͽ� ���ڵ��� �߰�, ����, ���� �۾��� �̷������ Ŭ���� �Դϴ�. 
 */
public class DAO {
	public ArrayList<Emp> search(int col_index, String search_word) {
		ArrayList<Emp> list=null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String column_name[] = {"empno", "ename", "job", "mgr", "hiredate", "sal", "comm", "deptno"};
		String sql = "select * from emp";
		
		if (col_index != 8) {// 8�� ���Ḧ �ǹ�
			
			String single = "";
			if (col_index == 1 || col_index == 2 || col_index == 4)
				// ename, job, hiredate�� ' �ʿ�
				single = "'";
			
			sql = sql + " where " + column_name[col_index] + "=" + single + search_word + single;
		}
		
		System.out.println("\n" + sql.toString() + "\n");
		
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
			
			rs = stmt.executeQuery(sql);
			
			/*
			 ResultSet ��ü�κ��� select���� ���� ����� ��� ���ؼ��� ���� next() �޼ҵ带 ȣ���ؾ� �մϴ�.
			 rs.next() - ���� �� ��ġ�� �̵��ϴ� �޼ҵ�
			 			 ���ϰ��� boolean���� ������ ���� �о� �Դ��� �����Դϴ�.
			 */
			int i = 0;
			
			while (rs.next()) {//�� �̻� ���� �����Ͱ� ���� ������ �ݺ�
				if(i++ ==0) {
					list = new ArrayList<Emp>();
				}
				Emp st = new Emp();
				st.setEmpno(rs.getInt(1));
				st.setEname(rs.getString(2));
				st.setJob(rs.getString(3));
				st.setMgr(rs.getInt(4));
				st.setHiredate(rs.getDate(5));
				st.setSal(rs.getInt(6));
				st.setComm(rs.getInt(7));
				st.setDeptno(rs.getInt(8));
				list.add(st);
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
		return list;
		//return null;
	}
}
