
package ex05_3_while;

public class While01my {
	public static void main(String[] args) {
		
// 1.1~10까지 홀수 출력하기	
		System.out.println("==1.1~10까지 홀수 출력하기==");
		int i1 = 1;
		while (i1 <= 10) {
			System.out.println(i1);
			i1 = i1 + 2;
		}
		
		System.out.println(" ==== 1 ====");

// 1.1~10까지 짝수 출력하기	
		System.out.println("==1.1~10까지 짝수 출력하기==");
		int i2 = 2 ;
		while (i2 <= 10) {
			System.out.println(i2);
			i2 = i2 + 2;
		}
		
		
		System.out.println(" ==== 2 ====");		
		
// 3.1~10까지의 합 구하기	
		System.out.println("==1~10까지의 합==");
		int sum3 = 0;
		int i3 = 1;
		while (i3 <= 10) {
			sum3 += i3; // sum = sum + i
			i3 = i3 + 1;
		}
		System.out.println("1~10까지의 합 = " + sum3);
		
		System.out.println(" ==== 3 ====");
		
// 4.1~10까지의 홀수합 구하기	
		int sum4 = 0;
		int i4 = 1;
		
		while (i4 <= 10) {
			sum4 += i4; // sum = sum + i
			i4 = i4 + 2;
		}
		System.out.println("1~10까지의 홀수의 합 = " + sum4);
		
		System.out.println(" ==== 4 ====");
		
//5. 1~10까지의 짝수합 구하기			
		int sum5 = 0;
		int i5 = 2;
		
		
		while (i3 <= 10) {
			sum5 += i5;
			i5 = i5 + 2;
		}
		System.out.println("1~10까지의 짝수의 합 = " + sum5);
		
		System.out.println(" ==== 5 ====");
		
		
		
	}
		
}
