//�� ���� ������ �����ڸ� �Է¹޾� �����ڿ� ���� ��� ����ϴ� ���α׷�
/*
 * 	����1�� �Է��ϼ���>1.3
 * 	����1�� �Է��ϼ���>5
 * 	������ +, -, *, /, % �� �Ѱ��� �Է��ϼ���
 * 	13 / 5 = 2.6
 * 
 * 	��, �����ڰ� "+", "-", "*", "/", "%" �̿��� ���
 * 	"+, -, *, /, % �� �ϰ��� �Է��ϼ���" �� ����մϴ�
 */
package ex05_2_switch;

import java.util.Scanner;

public class SwitchExample5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����1�� �Է��ϼ���>");
		int n1 = sc.nextInt();
		
		System.out.println("����2�� �Է��ϼ���>");
		int n2 = sc.nextInt();
		
		System.out.println("������ +, -, *, /, % �� �� �� �Է��ϼ���");
		String ch = sc.next();
		
		switch (ch) {
		  case "+" :
			  System.out.println(n1 + ch + n2 + "=" + (n1 + n2));
			  break;
			  
		  case "-" :
			  System.out.println(n1 + ch + n2 + "=" + (n1 - n2));
			  break;
			  
		  case "*" :
			  System.out.println(n1 + ch + n2 + "=" + ((double)n1 * n2));
			  break;
			  
		  case "/" :
			  System.out.println(n1 + ch + n2 + "=" + ((double)n1 / n2));
			  //System.out.printf("%d %s %d = %.1f\n" n1 , ch , n2, (double)n1 / n2);
			  break;
			  
		  case "%" :
			  System.out.println(n1 + ch + n2 + "=" + (n1 % n2));
			  break;	
			  
		  default :
				System.out.println("+, -, *, / �� �Ѱ��� �Է��ϼ���");
				
		sc.close();
				
		}
		
	}
}
