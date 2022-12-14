package ex13_8_clone_참고2_deep;
public class Circle implements Cloneable {

   Point p;
   double r;
   
   Circle(Point p, double r){
      this.p = p;
      this.r = r;
   }
   
   /*공변 반환 타입(covariant return type)-JDK1.5부터 적용
    *  오버라이딩 할 때 조상 메서드의 반환타입을 자손 클래스의 타입으로 변경을 허용하는 것입니다.
    
    *  즉, 반환형을 Object에서 자손 클래스 타입으로 변경을 허용합니다.
      
     * 좋은점 : clone()호출 후 형 변환이 필요 없습니다.(main 메서드)
        Rectangle obj2 = (Rectangle) obj1.clone();
        ==> Rectangle obj2 = obj1.clone();
    */
   
   //깊은 복사 - 원본이 참조하고 있느 객체까지 복제
   public Circle clone() {
      try {
    	  Circle c = (Circle)super.clone();
    	  c.p = new Point(this.p.x, this.p.y);
    	  return c;
      }catch (CloneNotSupportedException e) {
         System.out.println("복제 오류가 발생했습니다.");
         return null;
      }
   }
      
      public String toString(){
    	     return "[p=" + p + ", r=" + r + "]";
   }
      
}
   
