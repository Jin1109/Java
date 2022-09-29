//조건 연산자
package ex04_12_conditional_op;
public class ConditionalOpExample2 {
	public static void main(String[] args) {
		int a = 20, b = 30, min;
		
		System.out.println(a > b ? a : b);
		
		min = a < b ? a : b;
		System.out.println("최솟값 = " + min);
	}
	
}
