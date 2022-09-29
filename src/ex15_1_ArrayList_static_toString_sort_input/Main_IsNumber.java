package ex15_1_ArrayList_static_toString_sort_input;

import java.util.Scanner;

public class Main_IsNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jumsu=isNumber(sc);
		System.out.println(jumsu);
		sc.close();
	}
	
	static  int isNumber(Scanner sc) {
		int num;
		while (true) {
			try {
				num = Integer.parseInt(sc.nextLine());
				break;
			} catch (java.lang.NumberFormatException e) {
				System.out.println("숫자를 다시 입력하세요>");
			}
		}
		return num;
	}

}
