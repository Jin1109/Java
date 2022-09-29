package ex06_1_array;

import java.util.Scanner;

public class ArrayTest02_2 {
	public static void main(String[] args) {
		int sum=0;
		double avg=0;
		int[] score = new int[5];
		
		System.out.println("정수 5개를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			score[i]=sc.nextInt();
			sum += score[i];
		}
		 
		avg=(double)sum/(score.length);// avg=(double)sum/5;
		System.out.println("합 =" + sum + "\n평균 =" + avg);
		
		System.out.println("=============================");
		System.out.printf("합 = %d\n평균 =%5.1f", sum, avg);
			
		sc.close();
	}

}
