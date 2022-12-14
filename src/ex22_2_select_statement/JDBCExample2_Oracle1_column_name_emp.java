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
			String select_sql = "select * from emp";
			
			rs = stmt.executeQuery(select_sql);
			
			System.out.println("번호\t사원번호\t사원이름\t직급\t\t상사\t입사입\t\t급여\t커미션\t부서번호");
			System.out.println("-----------------------------------------------------------------------------------------------------");
			
			/*
			 ResultSet 객체로부터 select문의 실행 결과를 얻기 위해서는 먼저 next() 메소드를 호출해야 합니다.
			 rs.next() - 다음 행 위치로 이동하는 메소드
			 			 리턴값은 boolean으로 실제로 행을 읽어 왔는지 여부입니다.
			 */
			int i = 0;
			while (rs.next()) {//더 이상 읽을 데이터가 없을 때까지 반복
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
	}
}
