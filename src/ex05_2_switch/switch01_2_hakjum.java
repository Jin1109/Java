//switch ~ case 문을 이용한 학점 처리
/*
 * 95 ~ 100 : A+
 * 90 ~  94 : A0
 * 85 ~  89 : B+
 * 80 ~  84 : B0
 * 75 ~  79 : C+
 * 70 ~  74 : C0
 * 65 ~  69 : D+
 * 60 ~  64 : D0
 * 0  ~  59 : F
 */
package ex05_2_switch;

import java.util.Scanner;

public class switch01_2_hakjum {
	public static void main(String[] args) {
		

		System.out.println("점수를 입력 하세요?");
		
		// Scanner위에서 Ctrl+Shift+o 눌러주세요;
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		s = s/5;
			switch (s) {
			  case 20 :
			  case 19 :	  
				  System.out.println("A+학점");
				  break;  
			  case 18 :
				  System.out.println("A학점");
				  break;
			  case 17 :
				  System.out.println("B+학점");
				  break;
			  case 16 :
				  System.out.println("B학점");
				  break;
			  case 15 :
				  System.out.println("C+학점");
				  break;
			  case 14 :
				  System.out.println("C학점");
				  break;
			  case 13 :
				  System.out.println("D+학점");
				  break;
			  case 12 :
				  System.out.println("D학점");
				  break;
			  	  
			default :
				  System.out.println("F학점");
			}
			
			sc.close();
	}
		 
}
