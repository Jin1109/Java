//�������ϱ�
package work;

import java.util.Scanner;

public class Work0504 {
	public static void main(String[] args) {
		
		int s;
		System.out.println("������ �Է� �ϼ���?");
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		if (s>= 0 && s <= 100) {
			switch (s/5) {
			  case 20 :
			  case 19 :	  
				  System.out.println("A+����");
				  break;  
			  case 18 :
				  System.out.println("A����");
				  break;
			  case 17 :
				  System.out.println("B+����");
				  break;
			  case 16 :
				  System.out.println("B����");
				  break;
			  case 15 :
				  System.out.println("C+����");
				  break;
			  case 14 :
				  System.out.println("C����");
				  break;
			  case 13 :
				  System.out.println("D+����");
				  break;
			  case 12 :
				  System.out.println("D����");
				  break;
			  	  
			default :
				  System.out.println("F����");
			}
			
		}else { 
			System.out.println("0~100������ ���� �Է��ؾ� �մϴ�");
		}
			

		sc.close();
	}
}
