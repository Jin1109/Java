package ex03_3_constant;
//상수 : 값을 한 번만 지정할 수 있는 공간
//상수 만드는 법 : 변수 타입 앞에 키워드 final만 붙여 주기만 하면 됩니다.
//일반적으로 상수의 이름은 대문자로 사용합니다.
public class Const2 {
	public static void main(String[] args) {
		final int MAX = 500;
		System.out.println(MAX);
		MAX=1000;	//값을 변경하는 문자을 사용하면 에러가 발생한다.
					//final로 선언된 경우에는 변경이 불가능합니다.

	}
}
