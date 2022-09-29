//�����ͺ��̽��� ���̺� ������ �д� ���α׷�
package ex22_4_3_Statement_Search2_AND;

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
	public ArrayList<Emp> search(String[] searchs) {
//		ArrayList<Emp> arrst = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from emp ";
		String column_name[] = {"empno", "ename", "job", "mgr", "hiredate", "sal", "comm", "deptno"};
		
	     // empno, mgr, sal, comm, deptno�� ' �����
	      for(int i = 0; i < searchs.length; i++) {
	         if(searchs[i] != null) {
	            String single = "";
	            if(i == 1 || i == 2 || i == 4) //ename, job, hiredate�� ' �ʿ�
	               single = "'";
	            if(sql.contains("where"))
	               sql += " and ";
	            else
	               sql += "where ";
	            
	            sql += column_name[i] + "=" + single + searchs[i] + single;
	         }
	      }

		
		System.out.println(sql.toString());
		
		ArrayList<Emp> arrst = null;
		
//		if (col_index != 8) {// 8�� ���Ḧ �ǹ�
//			
//			String single = "";
//			if (col_index == 1 || col_index == 2 || col_index == 4)
//				// ename, job, hiredate�� ' �ʿ�
//				single = "'";
//			
//			sql = sql + " where " + column_name[col_index] + "=" + single + search_word + single;
//		}
//		
//		System.out.println("\n" + sql.toString() + "\n");
		
		
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
					arrst = new ArrayList<Emp>();
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
				arrst.add(st);
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
		return arrst;
		//return null;
	}



	


}
