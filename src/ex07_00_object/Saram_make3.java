//사람 클래스에서 수지와 박보검을  만듭니다.
package ex07_00_object;
public class Saram_make3 {
	public static void main(String[] args) {
		Saram3 s = new Saram3("수지");
		//s.name="수지";
		s.age = 27;
		s.w=47.7;
		s.ki=160;
		s.eat();
		s.walk();
		s.sesu();
		
		Saram3 s2 = new Saram3("박보검");
		//s2.name = "박보검";
		s2.age = 23;
		s2.w = 65;
		s2.ki = 182;
		s2.eat();
		s2.walk();
		s2.sesu();
		
	}
}
