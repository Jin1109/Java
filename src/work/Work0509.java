package work;

import java.util.Scanner;

public class Work0509 {         
	public static void main(String[] args) {
		
		int input;
		Scanner sc = new Scanner(System.in);	
		//1��
		System.out.print("1�� ");
		System.out.println("�Է°�:");
		input = sc.nextInt();
		System.out.println("��°�: " + input/10);
		
		//2��
		System.out.print("2�� ");
		System.out.println("�Է°�:");
		input = sc.nextInt();		
		System.out.println("��°�: " + (input-1)/10);
		
		//3��
		System.out.print("3�� ");
		System.out.println("�Է°�:");
		input = sc.nextInt();		
		System.out.println("��°�: " + ((input-1)/10)*10);
		
		//4��
		System.out.print("4�� ");
		System.out.println("������ �Է��ϼ���:");
		input = sc.nextInt();		
		System.out.println("��°�: " + ((((input-1)/10)*10)+1));
		
		//5��
		System.out.print("5�� ");
		System.out.println("page�� �Է��ϼ���:");
		int page = sc.nextInt();
		int startpage = ((((page-1)/10)*10)+1);
		System.out.println("startpage: " + startpage);
		
		//6��
		System.out.print("6�� ");
		System.out.println("limit�� �Է��ϼ���:");
		int limit = sc.nextInt();
		System.out.println("listcount�� �Է��ϼ���:");
		int listcount = sc.nextInt();
		System.out.println("��°�: " + (((listcount-1)/limit)+1));
		sc.close();

	}
}