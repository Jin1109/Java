package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample4_Oracle_insert_input_single2 {

	public static void main(String[] args) {
		//"A2000" "모니터" 200 "삼성"
		if(args.length != 4) {
			System.out.println("상품코드 상품명 가격 제조사를 입력하세요");
			return;
		}		
		Connection conn = null;
		PreparedStatement pstmt = null;		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");		
			
			/*
			 * INSERT, UPDATE, DELETE 문을 실행하는 메서드는 executeUpdate()입니다.
			   executeUpdate()의 리턴값은 INSERT, UPDATE, DELETE 수행 된 row의 수입니다.			 		
			
			 * 1. 직접 데이터를 입력하는 경우
			      insert into goodsinfo
			      values('A1000', '고급 핸드폰', 100, 'LG')
			
			 * 2. 변수를 이용해서 입력하는 경우
			   	  insert into goodsinfo (code, name, prine, maker)
			   	  values( 'args[0]의 값', 'args[1]의 값', 'args[2]의 값', 'args[3]의 값')
			 */			
//			String single = "'";
			String sql = "insert into goodsinfo "
					   + "(code, name, price, maker) "
					   + "values"
					   + "(?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, "10008");
			pstmt.setString(2, "카");
			pstmt.setInt(3, 1001111);
			pstmt.setString(4, "람보");
			System.out.println(sql+"\n");			
			int rowNum = pstmt.executeUpdate();
			
			System.out.println(rowNum + "행이 추가되었습니다.");

		}catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		}catch (SQLException se) {
			System.out.println(se.getMessage());
		}finally {
			try {
				if (pstmt != null)
					pstmt.close();
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close(); // 4단계 : DB연결을 끊는다.
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
