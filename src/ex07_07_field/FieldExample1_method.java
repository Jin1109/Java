//Circle Ŭ���� �ȿ� ����� �ʵ带 ����ϴ� ���α׷�
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
		System.out.println("���� ������ = " + circle.radius);
		System.out.println("���� ���� = " + circle.getArea());
		//System.out.println("���� ���� = " + area);  //o
	}
		
}