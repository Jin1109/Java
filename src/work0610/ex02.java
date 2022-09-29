package work0610;

import java.util.Scanner;

public class ex02 {

   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int jumsu=isNumber(sc);
         System.out.println(jumsu);
         sc.close();
         
      }

      static int isNumber(Scanner sc) {
         int num;
         while (true) {
            try {
               num = Integer.parseInt(sc.nextLine());
               break;
            } catch (java.lang.NumberFormatException e) {
               System.out.print("숫자로 다시 입력하세요>");
            }
         }
         return num;
      }

   }