//���� �Է¹޴� Scanner Ŭ������ ����� ���ô�.
//Scanner Ŭ������ java.util ��Ű���� �ֽ��ϴ�.
//nextInt() : Ű����� ���� �������� ���� �Է� �޴� �޼��� �Դϴ�.
package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper03_printf_myanswer {

   public static void main(String[] args) {
      
      // System.in�� Ű����� �����͸� �Է� ���� �� ����մϴ�.
      InputStream is = System.in;
      
      // jave.util.Scanner.Scanner(InputStream Source)
      //Ŭ������     ������ ����    ������   ������ ȣ��
      Scanner       sc  =      new    Scanner(is);
      
      // �ֿܼ��� "������ �Է� �ϼ���>" ������ Ŀ���� ��ġ�ϰ� ���� �Է� �� ����
      System.out.print("������ �Է� �ϼ���>");
      int a = sc.nextInt(); // ������ �о� ���� a�� �����մϴ�.
      
      System.out.print("������ �Է� �ϼ���>");
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