package ex04_test;

import java.util.Scanner;
//2�� ������ �����մϴ�. 2���� ����� 1�� ���ϸ� �˴ϴ�.
//10��� limit�� �ٲߴϴ�.
public class board6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("limit : ");
		int limit = sc.nextInt ();
		
		System.out.println("listcount : ");
		int listcount = sc.nextInt();
		
		int maxpage1 =(listcount-1)/limit + 1;
		System.out.println(listcount + "=>" + maxpage1);
		
		int maxpage2 = (listcount -1 + limit) / limit;
		System.out.println(listcount + "=>" + maxpage2);
		
		sc.close();
	}
}
