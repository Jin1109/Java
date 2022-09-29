package ex06_3_method_intro3_return;

public class MethodExample2 {
	  //접근제어자	객체생성없이 접근가능		반환된는 값의 자료형		메서드 이름 (매개변수 목록)
		public 		static 			void 				main(String[] args) {
			hap(1,10);	//아무것도 출력되지 않습니다.
		
			//1. return sum의 값을저장해서 출력하는 방법
			//반환형이 void인 경우는 값을 저장할수 없다
			int result = hap(1,100);
			System.out.println("1: result = " + result);
		
		}
		
		//메서드 정의
		public static int hap(int start, int end)	{
			int sum=0;
			for(int i=start;i<=end;i++) {
				sum += i;
			}
			return sum;
		}
		
		
		
		
		
}
