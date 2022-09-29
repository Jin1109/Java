//학점구하기
package ex05_2_switch;

import java.util.Scanner;

public class switch01_0 {
	public static void main(String[] args) {

		
		System.out.println("점수를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		switch (s) {
		case 100:case 99:case 98:case 97:case 96:
		case 95:case 94:case 93:case 92:case 91:
		case 90:	
			System.out.println("A학점");
			break;
		case 89:case 88:case 87:case 86:
		case 85:case 84:case 83:case 82:case 81:
			System.out.println("B학점");
			break;
		case 79:case 78:case 77:case 76:
		case 75:case 74:case 73:case 72:case 71:	
			System.out.println("c학점");
			break;
		case 69:case 68:case 67:case 66:
		case 65:case 64:case 63:case 62:case 61:
			System.out.println("D 학점");
			break;
		 
		default:
			System.out.println("F학점");

		}
		sc.close();
	}
}