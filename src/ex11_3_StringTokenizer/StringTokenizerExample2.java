//StringTokenizer를 이용해서 문자열로부터 토큰을 분하는 프로그램
//공백 문자를 기준으로 토큰을 구분합니다.
package ex11_3_StringTokenizer;
import java.util.StringTokenizer;
public class StringTokenizerExample2 {
	public static void main(String[] args) {
		StringTokenizer stok
			= new StringTokenizer("사과,배,복숭아", ",");
		
		while(stok.hasMoreTokens()) {//토큰이 있는 동안반복하는 메서드
			String str = stok.nextToken();//문자열로부터 토큰을 추출
			System.out.println(str);
		}
	}
}
