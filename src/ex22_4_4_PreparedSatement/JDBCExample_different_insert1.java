//PreparedSatement
/*
 		1. PreparedStatement�� �θ�� Statement�Դϴ�.
 		
 		2. SQL ������ ������ ���ؼ��� �������� �ʿ��ѵ� PreparedStatement�� ������ �������� �մϴ�.
 			��)pstmt = conn.preparedStatement(sql);
 			
 		3. PreparedSatement�� SQL������ �̸� ������ �Ǳ� ������ ���ǹ��� �ٲ��� �ʰ�
 			���Ǹ� �ٲ�� ���, ������ �����͸� �ٲ�� ��� � ����ϸ� �����ϴ�.
 			��, �� �� �̸� �������� �صθ� ���� ������ ���ؼ� �������� ���� �ʰ� ���� �����ؼ� �����մϴ�.
 			Statement�� ���� ������� �ص� �Ź� ������ ������ ��Ĩ�ϴ�.
 			���� ���� ������ �����ϴ��� PreparedSatement�� Satement���� ����ӵ��� �����ϴ�.
 			
 			 		��) insert into test(no, ename) values(1, 'ȫ�浿');
 			 		��) insert into test(no, ename) values(2, 'ȫ�浿');
 			 		��) insert into test(no, ename) values(3, 'ȫ�浿');
 			 		
 		4. 3���� �����ϱ� ���ؼ� ������ ������ ���� �����մϴ�.
 		�ٲ�� ���� ���ؼ� ?(��ġȦ��-placeholder, �Է¸Ű�����)�� ǥ���մϴ�.
 		��) 		insert into test(no, ename) values(?, ?);
 		
 		5. ?�� ���� ���� �����ϱ� ���� set�ڷ���()�޼��带 ����մϴ�.
 		��) ù��° ?�� ���ǰ��� ������ 1�� ��� setInt(1, 1)
 		��) �ι�° ?�� ���ǰ��� ������ 'ȫ�浿'�� ��� setString(2, "ȫ�浿")
 			Statement�� SQL���忡�� single quotation(')�� �ʿ��� ��� ���� �ۼ��� �־�����
 			 PreparedStatement�� �ڷ����� ���� �˾Ƽ� single quotation(')�� ó���� �ݴϴ�.
 			 
 		6. ���� ���� �� ������ �����ϴ� executeUpdate()�� ȣ���մϴ�.	 		
 */

package ex22_4_4_PreparedSatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample_different_insert1 {
	public static void main(String[] args) {
    Connection conn = null;
    /*
     create table test (no number(10), name varchar2(20))
     */
    PreparedStatement pstmt = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		conn = DriverManager.getConnection(url, "scott", "tiger" );
		
		int result = 0, count = 0;
		long start = System.currentTimeMillis();
		String sql = "insert into test(no, name) "
					+ "values(?,?)";
		pstmt = conn.prepareStatement(sql);
		for (int i = 0; i < 10000; i++) {
			pstmt.setInt(1, i);
			pstmt.setString(2, "ȫ�浿");
			result = pstmt.executeUpdate();
			count += result;
		}
		long end = System.currentTimeMillis();
		
		System.out.println("�ҿ�ð�:" + (end - start) + "ms");// 1796ms
		if (count == 10000)
			System.out.println("���� �Ϸ�");
		
	} catch (ClassNotFoundException cnfe) {
		System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�."    + cnfe.getMessage());
	} catch (SQLException se) {
		System.out.println(se.getMessage());
	} finally { //������ �ݴ��� ������� ���� �ش�.
		try {
			if (pstmt != null)	
				pstmt.close();	//ResultSet�� ���´�
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		try {
			if (conn != null)
				conn.close();	//Statement�� ���´�
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		}//finally
	}
}