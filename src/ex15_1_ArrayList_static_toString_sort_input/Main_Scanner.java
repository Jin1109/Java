package ex15_1_ArrayList_static_toString_sort_input;

import java.util.Scanner;

public class Main_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name= sc.nextLine();
		System.out.println("출력결과=" + name);
		System.out.println("name 길이=" + name.length());
		sc.close();
	}
}

