package ex03_3_constant;
//상수 : 값을 한 번만 지정할 수 있는 공간(변하지 않는 값)
//상수 만드는 법 : 변수 타입 앞에 키워드 final만 붙여 주기만 하면 됩니다.
//일반적으로 상수의 이름은 대문자로 사용합니다.
public class Const {
	public static void main(String[] args) {
		final int MAX = 500;// final이 붙으면 값을 변경할수 없다.
		System.out.println(MAX);
		
		//정수형 변수 age
		int age = 29;
		age = 21;
		System.out.println(age);
		
	}
}
