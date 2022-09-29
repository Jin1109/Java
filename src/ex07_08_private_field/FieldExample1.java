//Circle 클래스 아넹 선언된 필드를 사용하는 프로그램
//정보의 은닉 : 객체의 국성요소를 외부로 부터 감추는 기술
package ex07_08_private_field;

public class FieldExample1 {
	public static void main(String[] args) {
		Circle obj = new Circle(3.5);
		double area = obj.getArea();
		//System.out.println("원의 반지름 = " + obj.radius); //The field Circle.radius is not visible 접근 할 수 없다
		System.out.println("원의 넓이 = " + area);
		
		//obj.radius = 5;
		area = obj.getArea();
		//System.out.println("원의 반지름 = " + obj.radius);
		System.out.println("원의 넓이 = " + area);
	}
}
