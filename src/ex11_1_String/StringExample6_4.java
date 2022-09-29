//charAt () 메소드를 사용하여 주민번호 뒷자리 추출 예
/*
 1. substring(int beginIndex) : beginIndex부터 문자열 끝까지 부분 문자열 리턴
 2. substring(int beginIndex, int endIndex) :
                         beginIndex부터 endIndex-1 까지 부분 문자열 리턴
 */
/*
출력결과)
추출한 숫자는 4이고 여자입니다.
 */
package ex11_1_String;

public class StringExample6_4 {

   public static void main(String[] args) {
      String jumin = "123456-4123456";
      
      char s = jumin.charAt(7);// substring(n1, n2); n1부터 n2-1 까지 추출
      System.out.print("추출한 숫자는 " + s + "이고 ");
      
      switch(s) {
      case '1' :
      case '3' :
         System.out.println("남자입니다.");
         break;
         
      case '2' :
      case '4' :
         System.out.println("여자입니다.");
         break;
         
      default :
         System.out.println("외국인입니다.");
      }
   }
}