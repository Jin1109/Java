package work;

import java.io.InputStream;
import java.util.Scanner;

public class Jinbongsu_Work0503 {

   public static void main(String[] args) {
      
      InputStream is = System.in;
      
      Scanner       sc  =      new    Scanner(is);
      
      
      System.out.println("�̸�:");
      String a = sc.next(); 
      
      System.out.println("�����ϴ� ����:");
      int b = sc.nextInt();
      
      System.out.println("��,�� �÷�:");
      double c = sc.nextDouble();
      double d = sc.nextDouble();
      
      System.out.println("�����ϴ� ����(String):");
      String e = sc.next();
      
      System.out.println("�����ϴ� �(String):");
      String f = sc.next();
      
      System.out.println("�����ϴ� ���ĺ�(char):");
      char g = sc.next().charAt(0);
      
      System.out.println("����� �뷡�� �����ϳ���?(boolen):");
      boolean h = sc.nextBoolean();
      
      System.out.println("�̸�:" + a);
      System.out.println("�����ϴ� ����:" + b);
      System.out.println("�� �÷�:" + c);
      System.out.println("�� �÷�:" + d);
      System.out.println("�����ϴ� ����:" + e);
      System.out.println("�����ϴ� �:" + f);
      System.out.println("�����ϴ� ���ĺ�:" + g);
      System.out.println("����� �뷡�� �����ϳ���?:" + h);
      
      sc.close();

   }

}