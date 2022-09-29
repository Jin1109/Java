//데이터베이스의 테이블 내용을 읽는 프로그램
package ex22_4_2_Statement_Search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
DAO(Data Access Object)클래스
- 데이터 베이스와 연동하여 레코드의 추가, 수정, 삭제 작업이 이루어지는 클래스 입니다. 
 */
public class DAO {
	public ArrayList<Emp> search(int col_index, String search_word) {
		ArrayList<Emp> list=null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String column_name[] = {"empno", "ename", "job", "mgr", "hiredate", "sal", "comm", "deptno"};
		String sql = "select * from emp";
		
		if (col_index != 8) {// 8은 종료를 의미
			
			String single = "";
			if (col_index == 1 || col_index == 2 || col_index == 4)
				// ename, job, hiredate는 ' 필요
				single = "'";
			
			sql = sql + " where " + column_name[col_index] + "=" + single + search_word + single;
		}
		
		System.out.println("\n" + sql.toString() + "\n");
		
		try {
			//1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2단계 : DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger" );
			
			/* 데이터 베이스에 잇는 테이블의 데이터를 읽어오기 위해 Statement 객체가 필요 합니다.
			   2단게에서 얻은 Connection 객체에 대해 createStatement 메소드를 호출에서 얻습니다.
			 */
			stmt = conn.createStatement();
			
			/*
			 	Statement 타입은 java.sql 패키지에 속하는 인터페이스 이름으로
			 	Select문을 실해하는 excuteQuery라는 메소드가 있습니다.
			 	이 메소드의 파라미터로 select 문장을 넘겨주어야 합니다.
			 	보내서 실해하고, 그 결과를 ResultSet 객체를 리턴합니다.
			 */
			
			rs = stmt.executeQuery(sql);
			
			/*
			 ResultSet 객체로부터 select문의 실행 결과를 얻기 위해서는 먼저 next() 메소드를 호출해야 합니다.
			 rs.next() - 다음 행 위치로 이동하는 메소드
			 			 리턴값은 boolean으로 실제로 행을 읽어 왔는지 여부입니다.
			 */
			int i = 0;
			
			while (rs.next()) {//더 이상 읽을 데이터가 없을 때까지 반복
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
			System.out.println("해당 클래스를 찾을 수 없습니다."    + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally { //연결한 반대의 순서대로 끊어 준다.
			try {
				if (rs != null)	
					rs.close();	//ResultSet를 끊는다
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (stmt != null)
					stmt.close();	//Statement를 끊는다
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close(); //4단계 : DB연결을 끊는다.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally
		return list;
		//return null;
	}
}
