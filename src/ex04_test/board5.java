package ex04_test;

import java.util.Scanner;
//2번 문제와 유사합니다. 2번의 결과에 1을 더하면 됩니다.
//10대신 limit로 바꿉니다.
public class board5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int page, startpage;
		System.out.println("정수를 입력하세요");
		page = sc.nextInt();
		
		startpage = (page-1) / 10 * 10 + 1;
		System.out.println(startpage);
		
		sc.close();
	}
}
