package ex04_test;

import java.util.Scanner;
//2�� ������ �����մϴ�. 2���� ����� 1�� ���ϸ� �˴ϴ�.
//10��� limit�� �ٲߴϴ�.
public class board5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int page, startpage;
		System.out.println("������ �Է��ϼ���");
		page = sc.nextInt();
		
		startpage = (page-1) / 10 * 10 + 1;
		System.out.println(startpage);
		
		sc.close();
	}
}
