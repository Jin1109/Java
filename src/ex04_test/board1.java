package ex04_test;

import java.util.Scanner;

public class board1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���?");
		int inputdata = sc.nextInt();
		int output = inputdata / 10;
		System.out.println(output);
		sc.close();
	}
}
