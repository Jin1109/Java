package work;

import java.io.InputStream;
import java.util.Scanner;

public class Jinbongsu_Work0503 {

   public static void main(String[] args) {
      
      InputStream is = System.in;
      
      Scanner       sc  =      new    Scanner(is);
      
      
      System.out.println("이름:");
      String a = sc.next(); 
      
      System.out.println("좋아하는 숫자:");
      int b = sc.nextInt();
      
      System.out.println("좌,우 시력:");
      double c = sc.nextDouble();
      double d = sc.nextDouble();
      
      System.out.println("좋아하는 음식(String):");
      String e = sc.next();
      
      System.out.println("좋아하는 운동(String):");
      String f = sc.next();
      
      System.out.println("좋아하는 알파벳(char):");
      char g = sc.next().charAt(0);
      
      System.out.println("당신은 노래를 좋아하나요?(boolen):");
      boolean h = sc.nextBoolean();
      
      System.out.println("이름:" + a);
      System.out.println("좋아하는 숫자:" + b);
      System.out.println("좌 시력:" + c);
      System.out.println("우 시력:" + d);
      System.out.println("좋아하는 음식:" + e);
      System.out.println("좋아하는 운동:" + f);
      System.out.println("좋아하는 알파벳:" + g);
      System.out.println("당신은 노래를 좋아하나요?:" + h);
      
      sc.close();

   }

}