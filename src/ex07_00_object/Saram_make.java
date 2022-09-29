package ex07_00_object;
public class Saram_make {
	public static void main(String[] args) {
/*
  	다른 클래스에 있는 필드나 메서드(멤버)를 사용하려면 먼저 객체를 생성해야 합니다.
  	생성된 객체 멤버에 접근하려면 마침표9.)연산자를 사용합니다.
  	예) 참조변수.필드, 참조변수.메서드()
*/
//		클래스	참조변수	= 연산자 	생성자호출		
		Saram 	  s 	= new 	Saram();
		s.name="수지";
		s.age = 27;
		s.w=47.4;
		s.ki=168;
		s.eat();
		
		Saram s2 = new Saram();
		s2.name = "박보검";
		s2.age = 24;
		s2.w = 65;
		s2.ki = 182;
		s2.eat();
		s2.sesu();
		
	}
}
