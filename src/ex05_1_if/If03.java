package ex05_1_if;

import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {
		System.out.println("3���� ������ �Է� �ϼ���?");
		int n1, n2, n3;
		
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		int max = n1;
		
		if (n2 > max)
			max = n2;
		
		if (n3 > max)
			max = n3;
		
		System.out.println("�ִ��� " + max);
		
		int min = n1;
		
		if (n2 < min)
			min = n2;
		
		if (n3 > min)
			min = n3;
		
		System.out.println("�ּڰ��� " + min);
		
		sc.close();
	}
}
