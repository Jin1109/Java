package ex05_1_if;

import java.util.Scanner;

public class If03_1 {
	public static void main(String[] args) {
		System.out.println("3개의 정수를 입력 하세요?");
		int n1, n2, n3, max, min;
		
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		// 최댓값 구하기
		if (n1 > n2 && n1>n3) { 
			max = n1;
		}
		else if(n2>n1 && n2>n3) {
			max = n2;
		}
		else {
			max = n3;
		}
		
		
		// 최솟값 구하기
		if (n1 < n2 && n1>n3) { 
			min = n1;
		}
		else if(n2<n1 && n2<n3) {
			min = n2;
		}
		else {
			min = n3;
		}

		System.out.println("max = " + max);
		System.out.println(n1 + "," + n2 + "," + n3 +" 중에 가장 큰 수는 " + max + "입니다.");
		System.out.println("min = " + min);
		System.out.println(n1 + "," + n2 + "," + n3 + " 중에 가장 작은 수는 " + min + "입니다.");
		
		sc.close();
	}
}
