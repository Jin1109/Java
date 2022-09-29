//값을 입력받는 Scanner 클래스를 사용해 봅시다.
//Scanner 클래스는 java.util 패키지에 있습니다.
//nextInt() : 키보드로 부터 정수형의 값을 입력 받는 메서드 입니다.
package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper03_printf {

   public static void main(String[] args) {
      
      // System.in은 키보드로 데이터를 입력 받을 때 사용합니다.
      InputStream is = System.in;
      
      // jave.util.Scanner.Scanner(InputStream Source)
      //클래스명     참조형 변수    연산자   생성자 호출
      Scanner       sc  =      new    Scanner(is);
      
      int a, b, result;
      
      System.out.print("정수를 입력 하세요>");
      a = sc.nextInt();
      
      System.out.print("정수를 입력 하세요>");
      b = sc.nextInt();
      
      result = a + b;
      //%-5d : 5자리를 차지하고 왼쪽부터 숫자들이 출력되며 빈자리는 공백으로 처리
      //%5d : 5자리를 차지하고 오른쪽부터 숫자들이 줄력되며 빈자리는 공백으로 처리
      System.out.printf("%-5d + %5d = %-5d\n", a, b, result );
      
      result = a - b;
      System.out.printf("%-5d - %5d = %-5d\n", a, b, result );
      
      result = a * b;
      System.out.printf("%-5d * %5d = %-5d\n", a, b, result );
      
      result = a / b;
      System.out.printf("%-5d / %5d = %-5d\n", a, b, result );
      
      result = a % b;
      System.out.printf("%-5d %% %5d = %-5d\n", a, b, result );
      
       sc.close();

   }

}