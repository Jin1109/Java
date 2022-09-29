package ex07_07_field;
public class Circle {
	double radius;		// 필드
	/*
	 *  this란?
	 *  자바는 객체를 참조할 수 있도록 this 키워드를 제공합니다.
	 *  참조변수로 인스턴스 자신의 수소가 저장되어 있스빈다.
	 *  생성자와 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재합니ㅏㄷ.
	 */
	Circle(double radius )	{		// 생성자
		this.radius = radius;
	}
	
	double getArea()	{ 	//메소드
		double area = radius * radius * 3.14; 
		return area;	
		//return radius * radius * 3.14; 
	}
	
	
}
