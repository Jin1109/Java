package ex06_3_method_intro3_return;

public class MethodExample1 {
	  //접근제어자	객체생성없이 접근가능		반환된는 값의 자료형		메서드 이름 (매개변수 목록)
		public 		static 			void 				main(String[] args) {
			hap(1,10);	//아무것도 출력되지 않습니다.	1,10은 인자 혹은 매게변수
		}
		
						//반환형
		public static 	int 	hap(int start, int end)	{ //메서드 정의
			int sum=0;
			for(int i=start;i<=end;i++) {
				sum += i;
			}
			return sum;//sum의 자료형과 메서드의 반환형(int)이 일치해야 합니다.
		}
		
		
		
		
		
}
