//���� �Է¹޴� Scanner Ŭ������ ����� ���ô�.
//Scanner Ŭ������ java.util ��Ű���� �ֽ��ϴ�.
//nextInt() : Ű����� ���� �������� ���� �Է� �޴� �޼��� �Դϴ�.
package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper03_printf {

   public static void main(String[] args) {
      
      // System.in�� Ű����� �����͸� �Է� ���� �� ����մϴ�.
      InputStream is = System.in;
      
      // jave.util.Scanner.Scanner(InputStream Source)
      //Ŭ������     ������ ����    ������   ������ ȣ��
      Scanner       sc  =      new    Scanner(is);
      
      int a, b, result;
      
      System.out.print("������ �Է� �ϼ���>");
      a = sc.nextInt();
      
      System.out.print("������ �Է� �ϼ���>");
      b = sc.nextInt();
      
      result = a + b;
      //%-5d : 5�ڸ��� �����ϰ� ���ʺ��� ���ڵ��� ��µǸ� ���ڸ��� �������� ó��
      //%5d : 5�ڸ��� �����ϰ� �����ʺ��� ���ڵ��� �ٷµǸ� ���ڸ��� �������� ó��
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