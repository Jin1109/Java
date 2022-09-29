package ex22_4_5_PreparedSatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample2_Oracle1_column_name_dept {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2단계 : DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger" );
			
			String select_sql = "select * from dept";
			
			/* 데이터 베이스에 잇는 테이블의 데이터를 읽어오기 위해 Statement 객체가 필요 합니다.
			   2단게에서 얻은 Connection 객체에 대해 createStatement 메소드를 호출에서 얻습니다.
			 */
			//PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(select_sql.toString());
			rs = pstmt.executeQuery();
			
			System.out.println("번호\t부선번호\t부서명\t\t지역");
			System.out.println("---------------------------------------------------------");
			
			/*
			 ResultSet 객체로부터 select문의 실행 결과를 얻기 위해서는 먼저 next() 메소드를 호출해야 합니다.
			 rs.next() - 다음 행 위치로 이동하는 메소드
			 			 리턴값은 boolean으로 실제로 행을 읽어 왔는지 여부입니다.
			 */
			int i = 0;
			while (rs.next()) {//더 이상 읽을 데이터가 없을 때까지 반복
				//getInt("deptno") : 칼럼 deptno 값을 int 형으로 리턴하느 메소드
				int deptno = rs.getInt("deptno");
				
				//getString("dname") : 칼럼 deptno 값을 String 형으로 리턴하느 메소드
				String dname = rs.getString("dname");
				
				//getString("loc") : 칼럼 loc 값을 String 형으로 리턴하느 메소드
				String loc = rs.getString("loc");
				
				System.out.printf("%5d\t%5d\t%-15s%s\n",
									++i,deptno, dname, loc);
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
				if (pstmt != null)
					pstmt.close();	//Statement를 끊는다
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
