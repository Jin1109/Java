//정보의 은닉 : 객체의 국성요소를 외부로 부터 감추는 기술
package ex07_08_private_field;
public class FieldExample4 {
	public static void main(String[] args) {
		Circle2 obj = new Circle2(5.5);
		double area = obj.getArea();
		System.out.println("원의 반지름 = " + obj.getRadius()); 
		System.out.println("원의 넓이 = " + area);
		
		obj.setRadius(10.5);
		area = obj.getArea();
		System.out.println("원의 반지름 = " + obj.getRadius());
		System.out.println("원의 넓이 = " + area);
	}
}
