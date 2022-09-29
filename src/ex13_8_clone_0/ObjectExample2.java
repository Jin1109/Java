package ex13_8_clone_0;

class ObjectExample2 {
	public static void main(String[] args) {
		//객체를 생성합니다.
		Rectangle obj1 = new Rectangle(10, 20);
		
		//clone 메서드로 객체를 복제합니다.
		Rectangle obj2 = (Rectangle) obj1.clone();
	}
}
