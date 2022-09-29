//Circle 클래스 안에 선언된 필드를 사용하느 프로그램
package ex07_07_field;
public class FieldExample1_method {
	public static void main(String[] args) {
		Circle obj = new Circle(3.5);
		print(obj);
		
		obj.radius = 5.5;
		print(obj);
	}
	
	static void print(Circle circle) {
		//double area = circle.getArea();//O
		System.out.println("원의 반지름 = " + circle.radius);
		System.out.println("원의 넓이 = " + circle.getArea());
		//System.out.println("원의 넓이 = " + area);  //o
	}
		
}