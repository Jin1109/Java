//���� �Է¹޴� Scanner Ŭ������ ����� ���ô�.
//Scanner Ŭ������ java.util ��Ű���� �ֽ��ϴ�.
//nextInt() : Ű����� ���� �������� ���� �Է� �޴� �޼��� �Դϴ�.
package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02_input {

   public static void main(String[] args) {
      
      // System.in�� Ű����� �����͸� �Է� ���� �� ����մϴ�.
      InputStream is = System.in;
      
      // jave.util.Scanner.Scanner(InputStream Source)
      //Ŭ������     ������ ����    ������   ������ ȣ��
      Scanner       sc  =      new    Scanner(is);
      
      // �ֿܼ��� "������ �Է� �ϼ���>" ������ Ŀ���� ��ġ�ϰ� ���� �Է� �� ����
      System.out.println("������ �Է� �ϼ���>");
      int a = sc.nextInt(); // ������ �о� ���� a�� �����մϴ�.
      System.out.println("�Է°��� " + a + "�Դϴ�.");
      
      System.out.println("������ �Է� �ϼ���>");
      int b = sc.nextInt();
      System.out.println("�Է°��� " + b + "�Դϴ�.");
      
      sc.close();
      
      

   }

}