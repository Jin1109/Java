//논리 연산자
package ex04_10_rel_logic_op;

public class LogicalExample1 {
	public static void main(String[] args) {
		boolean a = 4 > 3;
		boolean b = 5 > 7;
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		
		if (a && b) {// 두개가 동시에 참일 경우(and)
			System.out.println("a&&b가 참");
		}
		
		if (a || b) {// 둘중에 하나참 참인경우(or)
			System.out.println("a||b가 참");
		}
	}
}
