//기본형 변수의 값을 출력해 봅니다.
//변수 : 단 하나의 값을 저장할 수 있는 메모리 공간
package ex03_2_variable;
public class Variable5_reference {
	public static void main(String[] args) {
		// 참조형-s1,s2는 메모리 주소, new는 연산자,
		// new String("자바"); 에서 String("자바")은 생성자
		String s1 = "자바";
		
		//객체 생성
		//클래스		참조형변수 = 연산자		생성자 호출
		String		  s2	= new		 String("자바");// String은 라이브러리로 제공되는 클래스
		
		System.out.println("s1=" + s1 + " s2=" + s2); //s1=자바 s2=자바
		
		// 주소값 같은지 비교
		if (s1 == s2) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}
		
		
		// 내용값 같은지 비교
		if (s1.equals(s2)) {
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}
	}
	
}
