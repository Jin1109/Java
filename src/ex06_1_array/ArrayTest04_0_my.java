package ex06_1_array;

import java.util.Scanner;

public class ArrayTest04_0_my {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5개를 입력하세요");
		int[] data = new int[5];
		for(int i=1; i<data.length; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		
		int max = data[0], min = data[0];
		
		for (int i = 1; i < data.length; i++) {
			if (max < data[i]) max = data[i];
			if (min > data[i]) min = data[i];
		}
		
		for (int i = 1; i < data.length; i++) {
			if (max < data[i]) max = data[i];
			if (min > data[i]) min = data[i];
		}

		System.out.println("max = " + max);
		System.out.println("min = " + min);
	
		
		
//			Scanner sc = new Scanner(System.in); 
//			
//			System.out.print("몇 개의 숫자를 입력하시겠습니까? ");
//			int count = sc.nextInt(); 
//			
//			int[] data = new int[count]; 
//			
//			for(int i=0; i<data.length; i++) { 
//				data[i] = sc.nextInt(); 
//			}
//			sc.close(); 
//			
//			// 최댓값 구하기
//			int max = data[0]; 
//			for(int i=1; i<data.length; i++) { 
//				if(max < data[i]) max = data[i]; 
//			}
//			System.out.println("max : " + max);
//			
//			// 최솟값 구하기
//			int min = data[0]; 
//			for(int i=1; i<data.length; i++) { 
//				if(min > data[i]) min = data[i]; 
//			}
//			System.out.println("min : " + min);
	 
	}
	

}
