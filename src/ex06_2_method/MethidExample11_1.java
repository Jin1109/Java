//사용자가 정의한 메서드를 실행할 수 있도록 합니다.
///이것을메서드 호출이라고 합니다.
//즉 메서드를 호출하면 해당 메서드를 실행합니다.
package ex06_2_method;

public class MethidExample11_1 {
	
  //접근제어자	객체생성없이 접근가능		반환된는 값의 자료형		메서드 이름 (매개변수 목록)
	public 		static 			void 				main(String[] args) {
		int num=50;
		char data='*';
		print(num, data);//두 개의 값을넘기고 싶으면 콤마를 사용하면 됩니다.	
		return; //여기서 main()메서드를 종료합니다.	//jvm에서 호출
					
	}
	
	// 메서드 정의 
	public static void print(int p_num, char p_data) {
		for(int i = 0; i<p_num;i++) {
			System.out.print(p_data);
		}
		return;//반환되는 값의 자료형이 void인 경우 이문장은 생략 가능합니다.
		
	}
}
