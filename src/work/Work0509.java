package work;

import java.util.Scanner;

public class Work0509 {         
	public static void main(String[] args) {
		
		int input;
		Scanner sc = new Scanner(System.in);	
		//1번
		System.out.print("1번 ");
		System.out.println("입력값:");
		input = sc.nextInt();
		System.out.println("출력값: " + input/10);
		
		//2번
		System.out.print("2번 ");
		System.out.println("입력값:");
		input = sc.nextInt();		
		System.out.println("출력값: " + (input-1)/10);
		
		//3번
		System.out.print("3번 ");
		System.out.println("입력값:");
		input = sc.nextInt();		
		System.out.println("출력값: " + ((input-1)/10)*10);
		
		//4번
		System.out.print("4번 ");
		System.out.println("정수를 입력하세요:");
		input = sc.nextInt();		
		System.out.println("출력값: " + ((((input-1)/10)*10)+1));
		
		//5번
		System.out.print("5번 ");
		System.out.println("page를 입력하세요:");
		int page = sc.nextInt();
		int startpage = ((((page-1)/10)*10)+1);
		System.out.println("startpage: " + startpage);
		
		//6번
		System.out.print("6번 ");
		System.out.println("limit를 입력하세요:");
		int limit = sc.nextInt();
		System.out.println("listcount를 입력하세요:");
		int listcount = sc.nextInt();
		System.out.println("출력값: " + (((listcount-1)/limit)+1));
		sc.close();

	}
}