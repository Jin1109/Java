package ex04_test;

import java.util.Scanner;
//2번 문제와 유사합니다. 2번의 결과에 1을 더하면 됩니다.
//10대신 limit로 바꿉니다.
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
