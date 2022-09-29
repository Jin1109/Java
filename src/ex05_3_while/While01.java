
package ex05_3_while;

public class While01 {
	public static void main(String[] args) {
		
		// 1~10까지 1씩 증가
		System.out.println("==1씩 증가==");
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i = i + 1; // i++
		}
		

		// 1~10까지 2씩 증가(홀수 출력)
		System.out.println("==홀수출력==");
		i = 1;
		while (i <= 10) {
			System.out.println(i);
			i = i + 2; // i+= 2;
		}
						
		// 1~10까지 2씩 증가(짝수 출력)
		System.out.println("==짝수출력==");
		i = 2;
		while (i <= 10) {
			System.out.println(i);
			i = i + 2; // i+= 2;
		}
		// 1~10까지 합 구하기
		System.out.println("==1~10까지 합==");
		int sum =0;
		i = 1;
		while (i <= 10) {
			sum = sum + i;
			i = i + 1;
			
			/*
			 * sum+=i; i++;
			 */
		}
		System.out.println("1~10까지의 합1 = " + sum);
		
		// 1~10까지의 합 구하기		
		System.out.println("==1~10까지의 합==");
		sum = 0;
		i = 0;
		while (++i <= 10) {
			sum = sum + i;
		}
		System.out.println("1~10까지의 합2 = " + sum);
		
		// 1~10까지의 홀수 합 구하기		
		System.out.println("홀수 합 구하기");
		sum = 0;
		i = 1;
		while (i <= 10) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println("1~10까지의 홀수 합 = " + sum);
				
		// 1~10까지의 짝수 합 구하기		
		System.out.println("짝수 합 구하기");
		sum = 0;
		i = 2;
		while (i <= 10) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println("1~10까지의 짝수 합 = " + sum);		
		
	
		
	}
}