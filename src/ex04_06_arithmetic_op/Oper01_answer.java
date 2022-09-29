//산술 연산자 사용예
package ex04_06_arithmetic_op;
public class Oper01_answer {
	public static void main(String[] args) {
		/*
		 * 1. 연산자 : 연산(수나 식을 일정한 규칙에 다라 계산하는 것) 을 수행하는 기호
		 * 		예) + - * /
		 * 2. 피연산자 : 연산의 대상
		 * 
		 * 3. 식 : 연산자와 피연산자를 조합하여 계산하고자 하는 바를 표현한 것
		 * 		예) x + 3
		 * 		x와 3은 피연산자, +는 연산자
		 * 
		 * 4. 식을 계산하여 결과를 얻는 것을 식을 평가(evaluation) 한다고 합니다.
		 */
		//정수형(int) 변수 a,b,c를 선언합니다.
		//a=10, b=4로 초기화 합니다.
		int a = 10, b = 4, //c = 14;
		
		c = a + b;	// c=14;
		System.out.println(a + "+" + b + "=" + c);
		
		c = a - b;	// c=6;
		System.out.println(a + "-" + b + "=" + c);
		
		c = a * b;	// c=40;
		System.out.println(a + "*" + b + "=" + c);
		
		c = a / b;	// c=2;
		System.out.println(a + "/" + b + "=" + c);
		
		c = a % b;	// c=2;	(나머지) 정수로만 나온다
		System.out.println(a + "%" + b + "=" + c);
		
		// a/b = 2.5를 만들어 봅시다 
		System.out.println("a/b = " + a/b);
		System.out.println("(double)(a/b) = " + (double)(a/b));
		System.out.println("(double)a = " + (double)a);
		System.out.println("(double)a/b = " + (double)a/b);
		System.out.println("a/(double)b = " + a/(double)b);
		System.out.println("(double)a/(double)b = "
										+ (double)a/(double)b);
		System.out.println(a + "/" + b + "=" + (double)a/b);
		
		double d;
		d = (double)a/b;
		System.out.println(a + "/" + b + "=" + d);
	}
}
