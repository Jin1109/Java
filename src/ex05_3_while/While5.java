
package ex05_3_while;

public class While5 {
	public static void main(String[] args) {
			
		
		// 1~10까지의 합 구하기	
		System.out.println("==1~10까지의 합==");
		int sum3 = 0;
		int i3 = 1;
		while (i3 <= 10) {
			sum3 += i3; // sum = sum + i
			i3 = i3 + 1;
		}
		System.out.println("1~10까지의 합 = " + sum3);
		
		
		
	}
		
}
