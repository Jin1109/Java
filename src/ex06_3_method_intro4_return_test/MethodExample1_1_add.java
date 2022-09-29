/*
 다음 조전을 만족하는 메서드를 정의해 보셋요
 1. 메서드 이름 : add
 	매개 변수 : 정수형 2개
 	기능 : 매개 변수의 값을 더한다.
 	반환값 : 매개 변수의 값을 더한 값
 	반환형 : int
 	
 2. 1번에서 정의한 add 메서드를 호출합니다.
 		인자값으로 3과 4를 사용합니다.
 		
 3. add()메서드 호출 결과값을 출력합니다.
 	출력화면)
  	7
  		
 */

package ex06_3_method_intro4_return_test;

public class MethodExample1_1_add {

   public static int add(int num1, int num2) {
	   int sum;
	   sum = num1 + num2;
	   return sum;
   }
   
   public static void main(String[] args) {
		int result = add(3, 4);
		System.out.println(result);
   	}

}
