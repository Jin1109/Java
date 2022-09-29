//사람 클래스에서 수지와 박보검을  만듭니다.
package ex07_00_object;
public class Saram_make2 {
	public static void main(String[] args) {
		Saram2 s = new Saram2();
		s.name="수지";
		s.age = 27;
		s.w=47;
		s.ki=168;
		s.eat();
		s.walk();
		s.sesu();
		
		Saram2 s2 = new Saram2();
		s2.name = "박보검";
		s2.age = 23;
		s2.w = 65;
		s2.ki = 182;
		s2.eat();
		s2.walk();
		s2.sesu();
		
	}
}
