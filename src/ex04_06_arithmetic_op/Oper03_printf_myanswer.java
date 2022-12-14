//값을 입력받는 Scanner 클래스를 사용해 봅시다.
//Scanner 클래스는 java.util 패키지에 있습니다.
//nextInt() : 키보드로 부터 정수형의 값을 입력 받는 메서드 입니다.
package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper03_printf_myanswer {

   public static void main(String[] args) {
      
      // System.in은 키보드로 데이터를 입력 받을 때 사용합니다.
      InputStream is = System.in;
      
      // jave.util.Scanner.Scanner(InputStream Source)
      //클래스명     참조형 변수    연산자   생성자 호출
      Scanner       sc  =      new    Scanner(is);
      
      // 콘솔에서 "정수를 입력 하세요>" 다음에 커서를 위치하고 숫자 입력 후 엔터
      System.out.print("정수를 입력 하세요>");
      int a = sc.nextInt(); // 정수를 읽어 변수 a에 저장합니다.
      
      System.out.print("정수를 입력 하세요>");
      int b = sc.nextInt();
      
      int c = 0;
      
				
		c = a + b;	
		System.out.println(a + "+" + b + "=" + c);
		
		c = a - b;	
		System.out.println(a + "-" + b + "=" + c);
		
		c = a * b;	
		System.out.println(a + "*" + b + "=" + c);
		
		c = a / b;	
		System.out.println(a + "/" + b + "=" + c);
		
		c = a % b;	
		System.out.println(a + "%" + b + "=" + c);
      
      sc.close();

   }

}