package ex05_4_do_while;

import java.util.Scanner;

/*
 * �����Է�(exit)>����
 * �Է��� ������ ���� �Դϴ�.
 * �����Է�(exit=q)>q
 * ��.
 */
public class DoWhileExample2 {
	public static void main(String[] args) {
		String location ;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("�����Է�(exit=q)>");
			location=sc.next();
			if(location.equals("q")) {
				break;
			}
			System.out.println("�Է��Ͻ� ������ " + location + "�Դϴ�");
		} while (true);
		
		System.out.println("��...");
		sc.close();
	}
}
