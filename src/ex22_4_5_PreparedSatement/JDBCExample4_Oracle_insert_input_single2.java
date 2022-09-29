//데이터베이스의 테이블로에 데이터를 추가하는 프로그램
//executeUpdate 메서드 사용
package ex22_4_5_PreparedSatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample4_Oracle_insert_input_single2 {
	public static void main(String[] args) {
		//"A6000" "고급 핸드폰" 100 "LG"
		if (args.length != 4) {
			System.out.println(
					"상품코드 상품명 가격 제조사를 입력하세요");
			return;
		}
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger" );
//			stmt = conn.createStatement();
			
			/*
			 * INSERT, UPDATE, DELETE 문을 생하는 메서드는 executUpdate()입니다.
			   executeUpdate()의 리턴값은 INSERTm UPDATE, DELETE 수행된 row의 수입니다.
			 
			   1. 직접 데이터를 입력하는 경우
			   insert into goodsinfo
			   values('A1000', '고급 핸드폰'. 100, 'LG')
			   
			   insert into goodsinfo
			   values('A2000', '모니터'. 200, '삼성')
			   
			   2. 변수를 이용해서 입력하는 경우
			   	  insert into goodsinfo (code, name, price, maker)
			   	  values( 'args[0]의 값' , 'args[1]의 값' , 'args[2]의 값' , 'args[3]의 값') 
			 */
			
//			String single = "'";
//			String sql = "insert into goodsinfo "
//					   + "(code, name, price, maker) "
//					   + "values"
//					   + "(" + single + args[0] + single + ","	//varchar2 자료형
//					   +	   single + args[1] + single + ","
//					   +				args[2] +          ","
//					   + 	   single + args[3] + single + ")";
			
//			String single = "'";
			String sql = "insert into goodsinfo "
					   + "(code, name, price, maker) "
					   + "values"
					   + "(?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, args[0]);
			pstmt.setString(2, args[1]);
			pstmt.setInt(3, Integer.parseInt(args[2]));
			pstmt.setString(4, args[3]);
//			System.out.println(sql+"\n");
			int rowNum = pstmt.executeUpdate();

			System.out.println(rowNum + "행이 추가 되었습니다.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다."    + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally { //연결한 반대의 순서대로 끊어 준다.
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
