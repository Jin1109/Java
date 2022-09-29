package ex03_1_literal;
public class Literal4_printf {
	public static void main(String args[]) { 
	/*
	 * 1. System.out.println()	: 괄호안의 내용을 출력한 후 한 행을 띄움니다/
	 * 2. System.out.print()	: 괄호안의 내영을 출력한 후 한 행을 띄지 않고 유지합니다.
	 * 3. System.out.printf()	: 서식을 지정해서 출력합니다.
	 * 		형식: System.out.printf("포맷명시자", 데이터)
	 * 		주의점: %로 시작하는 포맷 갯수와 데이터의 갯수가 일치해야 합니다.
	 */
	// 리터널 (literal)- 그 자체로 값을 의미 하는 것 
	
	// 실수 42.195를 실수 서식(%f)으로 출력하라
	// (기본 소수점이하 6자리)
	System.out.printf("%f", 42.195);
	System.out.println();//줄을 바꿉니다
	
	// 실수 42.195를 실수 서식 소수점 이하 2자리(%.2f)로 출력해라.소수점 아래 3자리에서 반올림
	// \n(%n)은 출력 후 즐 바꾸라는 서식
	System.out.printf("%.2f%n", 42.195);
	
	// 정수 42를 정수 서식(%d)으로 출력해라
	System.out.printf("%d\n", 42);
	
	// 정수 42를 정수 서식(%10d)으로 출력해라 - 10칸의 자리, 오른쪽 정렬
	System.out.printf("%10d\n", 42);
	
	// 문자 'A'를 정수 서식(%c)으로 출력해라
	System.out.printf("%c%n", 'A');
		
	// 문자 "홍길동"를 문자열 서식(%s)으로 출력해라
	System.out.printf("%s%n", "홍길동");

	// 문자 "홍길동"를 문자열 서식(%10s)으로 출력해라 - 10칸의 자리, 오른쪽 정렬
	System.out.printf("%10s\n", "홍길동");
	
	// 문자 "홍길동"를 문자열 서식(%-10s)으로 출력해라 - 10칸의 자리, 왼쪽 정렬
	System.out.printf("%-10s\n", "홍길동");
		
	
	// 너의 이름은 홍길동, 너의 나이는 21세 입니다.
	System.out.printf("\n나의 이름은 %s, 나의 나이는 %d세 입니다.", "홍길동", 21);
		
	System.out.printf("\n나의 이름은 %10s, 나의 나이는 %5d세 입니다.", "홍길동", 21);
	System.out.printf("\n나의 이름은 %-10s, 나의 나이는 %-5d세 입니다.", "홍길동", 21);
	
  }
}
