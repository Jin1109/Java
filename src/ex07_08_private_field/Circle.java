//private 필드를 갖는 클래스의 예
package ex07_08_private_field;

public class Circle {
	//접근 제어자가 private은 클래스 내부에서 사용가능합니다.
	private double radius;		// 필드
	
	final double PI = 3.14;
	Circle(double radius )	{		// 생성자
		this.radius = radius;
	}
	
	double getArea()	{ 	//메소드
		return radius * radius * PI;
		
	}
}
