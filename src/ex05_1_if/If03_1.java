package ex05_1_if;

import java.util.Scanner;

public class If03_1 {
	public static void main(String[] args) {
		System.out.println("3���� ������ �Է� �ϼ���?");
		int n1, n2, n3, max, min;
		
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		// �ִ� ���ϱ�
		if (n1 > n2 && n1>n3) { 
			max = n1;
		}
		else if(n2>n1 && n2>n3) {
			max = n2;
		}
		else {
			max = n3;
		}
		
		
		// �ּڰ� ���ϱ�
		if (n1 < n2 && n1>n3) { 
			min = n1;
		}
		else if(n2<n1 && n2<n3) {
			min = n2;
		}
		else {
			min = n3;
		}

		System.out.println("max = " + max);
		System.out.println(n1 + "," + n2 + "," + n3 +" �߿� ���� ū ���� " + max + "�Դϴ�.");
		System.out.println("min = " + min);
		System.out.println(n1 + "," + n2 + "," + n3 + " �߿� ���� ���� ���� " + min + "�Դϴ�.");
		
		sc.close();
	}
}
