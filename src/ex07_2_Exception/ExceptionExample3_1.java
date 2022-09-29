//checked exception을 던지는 메소드
//컴파일 에러 발생
//throws Exception를 가진 메소드 호출 시 try~catch문으로 처리
package ex07_2_Exception;

public class ExceptionExample3_1 {

   public static void main(String[] args) {
      int result = add(1, -2);
      System.out.println(result);

   }
   //throws Exception : throw에 의해 발생한 에러를 호출한 메서드로 넘깁니다.
   static int add(int a, int b) {
      int result = a + b;
      if (result < 0)
         throw new Exception("0보다 작아 에러 발생합니다.");
      return result;
   }

}