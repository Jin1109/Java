package ex04_test;

import java.util.Scanner;

public class board3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputdata, output;
		System.out.println("���ڸ� �Է��ϼ���?");
		inputdata = sc.nextInt();
		
		output = (inputdata-1) / 10 * 10;
		System.out.println(output);
		sc.close();
	}
}
