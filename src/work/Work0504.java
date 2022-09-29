//학점구하기
package work;

import java.util.Scanner;

public class Work0504 {
	public static void main(String[] args) {
		
		int s;
		System.out.println("점수를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		if (s>= 0 && s <= 100) {
			switch (s/5) {
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
			
		}else { 
			System.out.println("0~100사이의 값을 입력해야 합니다");
		}
			

		sc.close();
	}
}
