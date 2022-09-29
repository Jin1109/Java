package ex04_12_conditional_op.test;

import java.util.Scanner;

/*
 * 3개의 정수를 입력 하세요?10 20 30
 * 10,20,30 중에 가장 큰 수는 30입니다.
 * 10,20,30 중에 가장 작은수는 10입니다.
 */

public class 과제_1 {

	public static void main(String[] args) {
		
		System.out.println("3개의 정수를 입력 하세요?");
		int n1, n2, n3, max, min;
		
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		max= (n1 > n2) ? n1 : n2;
		max= (max > n3) ? max : n3;
		
		min= (n1 < n2) ? n1 : n2;
		min= (min < n3) ? min : n3;
		
		System.out.println("max = " + max);
		System.out.println(n1 + "," + n2 + "," + n3 + " 중에 가장 큰 수는 " + max + "입니다.");
		
		System.out.println("min = " + min);
		System.out.println(n1 + "," + n2 + "," + n3 + " 중에 가장 작은 수는 " + min + "입니다.");
		
		
//		max = n1; 
//		if (n2 > max) max = n2; 
//		if (n3 > max) max = n3;
//		
//		min = n1; 
//		if (n2 < min) min = n2; 
//		if (n3 < min) min = n3;
//
//		System.out.println("max = " + max);
//		System.out.println(n1 + "," + n2 + "," + n3 +" 중에 가장 큰 수는 " + max + "입니다.");
//		System.out.println("min = " + min);
//		System.out.println(n1 + "," + n2 + "," + n3 + " 중에 가장 작은 수는 " + min + "입니다.");
//		
		sc.close();
	}
	
}
