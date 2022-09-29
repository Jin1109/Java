//사용자가 정의한 메서드를 실행할 수 있도록 합니다.
///이것을메서드 호출이라고 합니다.
//즉 메서드를 호출하면 해당 메서드를 실행합니다.
package ex06_2_method;

public class MethidExample7 {
	
  //접근제어자	객체생성없이 접근가능		반환된는 값의 자료형		메서드 이름 (매개변수 목록)
	public 		static 			void 				main(String[] args) {
		int num=50;
		//num 변수가 갖고 있는 값을 print() 출력하려면 어떻게 해야 할까요?
		print(num);	//메서드의 괄호안에 값을 넣어주면 됩니다.
					//메서드로 정의한 곳에서 num을 값을 저장하기 위한 변수를 선언해 주어야 합니다.
					//호출하는 메서드에서 사용한 num의 값을 인자라고 하며 50
					//메서드 정의에 사용된 parameter를 매개변수라고 합니다.
	}
	
	// 메서드 정의
	// print(num) = print(int parameter) 
	public static void print(int parameter) {
		System.out.println("print() 메서드 입니다.");
		System.out.println("main() 메서드에서 전달받은 데이터의 값은 " + parameter + "입니다.");
	}
}
