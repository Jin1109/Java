//clone()메소드는 겍체를 복제하는 가능을 합니다.
package ex13_8_clone_1;
class ObjectExample2 {
	public static void main(String[] args) {
		//객체를 생성합니다.
		Rectangle obj1 = new Rectangle(10, 20);
		
		//clone 메서드로 객체를 복제합니다.
		Rectangle obj2 = (Rectangle) obj1.clone();
		
	      //원본 객체와 복제 객체의 값을 출력합니다.
	      System.out.println("[obj1] " + obj1);
	      System.out.println("[obj2] " + obj2);
	      
	      obj1.height = 100; obj1.width = 200;
	      System.out.println("[obj1] " + obj1);
	      System.out.println("[obj2] " + obj2);

	}
}
