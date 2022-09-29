// StringTokenizer의 기능
// StringTokenizer의 기능과 유사한 String의 split메소드 사용법
/*
 *** StringTokenizer : 010-1234-5677 토큰 분리***
010
1234
5678
***String의 split 메소드 이용 : 010-1234-5678 토큰 분리***
010
1234
5678
 */
package ex11_3_StringTokenizer;
import java.util.StringTokenizer;
public class StringTokenizerExample6 {
	public static void main(String[] args) {
		String phone = "010-1234-5678";
		phone.split("-");
		StringTokenizer str = new StringTokenizer(phone, "-");
		System.out.println("*** StringTokenizer : "
									+ phone + "토큰 분리***");
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
		
		System.out.println("*** StringTokenizer : "
				+ phone + "토큰 분리***");
		
		String[] st = phone.split("-");
		
		// 배열의 갯수가 가변적일때 length 속성을 이용한다
		for (int i = 0; i < st.length; i++)
			System.out.println(st[i]);
		
		System.out.println("=========== 향상된 for문 ===========");
		for(String token : st) {
			System.out.println(token);
		}
	}
}
