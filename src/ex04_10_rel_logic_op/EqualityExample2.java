//동등 연산자
package ex04_10_rel_logic_op;

public class EqualityExample2 {
	public static void main(String[] args) {
		String s1 = "자바";
		
	// 참조형 변수는 주소갑이 존재한다. 
	//	클래스	참조형 변수	연산자		생성자호출	
		String	s2		   = new		String("자바");
		System.out.println("s1=" + s1 + " s2" + s2);
		
		// 주소값 같은지 비교
		if (s1 == s2) {
			System.out.println("같은 주소");
		}
		else {
			System.out.println("다른 주소");
		}
		
		// 내용값 같은지 비교
		if (s1.equals(s2)) {
			System.out.println("같은 값");
		}
		else {
			System.out.println("다른 값");
		}
		
	}
}
