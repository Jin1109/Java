package ex06_1_array;

import java.util.Scanner;

public class ArrayTest02_2_my {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 5���� �Է��ϼ���");
		
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		int input4 = sc.nextInt();
		int input5 = sc.nextInt();
		System.out.println("�� = " + (input1 + input2 + input3 + input4 + input5));
		double sum = input1 + input2 + input3 + input4 + input5 ;
		System.out.println("��� = " + sum/5);
		 
		sc.close();
	}

}
