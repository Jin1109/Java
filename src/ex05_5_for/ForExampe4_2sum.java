package ex05_5_for;

public class ForExampe4_2sum {
	public static void main(String[] args) {
		int i;
		int sum;
		// 1~10까지 1씩 증가
		System.out.println("==1씩증가===");
		for (i= 1; i <= 10; i++ ) {
			System.out.println(i);
		}
		
		// 1~10까지 2씩 증가(홀수출력)
		System.out.println("==홀수출력===");
		for (i= 1; i <= 10; i = i + 2 ) {
			System.out.println(i);
		}
		
		// 1~10까지 2씩 증가(짝수출력)
		System.out.println("==짝수출력===");
		for (i= 2; i <= 10; i = i + 2 ) {
			System.out.println(i);
		}		
		
		// 1~10까지 합구하기
		sum = 0;
		System.out.println("==1~10까지의 합==");
		for (i= 1; i <= 10; i = i + 1 ) {
			sum = sum + i;
		}		
		System.out.println("1~10까지의 합 = " + sum);

		// 1~10까지의 홀수 합 구하기
		sum = 0;
		System.out.println("==1~10까지의 합==");
		for (int j= 1; j <= 10; j = j + 2 ) {
			sum += j;
		}		
		System.out.println("1~10까지의 홀수의 합 = " + sum);

		// 1~10까지의 짝수 합 구하기
		sum = 0;
		System.out.println("==1~10까지의 짝수의 합==");
		for (i= 2; i <= 10; i = i + 2 ) {
			sum += i;
		}		
		System.out.println("1~10까지의 짝수의 합 = " + sum);
		
	}
}
