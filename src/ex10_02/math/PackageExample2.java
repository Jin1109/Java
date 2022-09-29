//다른 패키지의 클래스를 사용하는 프로그램 - 잘못된 예(컴파일 에러 발생)
package ex10_02.math;			// 패키지 선언문

import ex10_02.goemetry.polygon.Rectangle;

class PackageExample2 {

   public static void main(String[] args) {
      Rectangle obj = new Rectangle(2, 3); // 컴파일 에러
      System.out.println("가로 = " + obj.getWidth());
      System.out.println("높이 = " + obj.getHeight());
      System.out.println("면적 = " + obj.getArea());

   }

}