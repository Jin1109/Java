/*
 반지름을 입력하세요>3.5
 원의 반지름 = 3.5
 원의 넓이 = 38.465
 */
package ex07_08_final_field;

//import java.io.InputStream;
import java.util.Scanner;



public class FieldExample3 {
	public static void main(String[] args) {
		//InputStream in = System.in;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요>");	
		//double input = sc.nextDouble();
		Circle obj = new Circle(sc.nextDouble());
		print(obj);
		sc.close();
	}
	
	
	static void print(Circle circle) {
		//double area = circle.getArea();//O
		System.out.println("원의 반지름 = " + circle.radius);
		System.out.println("원의 넓이 = " + circle.getArea());
		//System.out.println("원의 넓이 = " + area);  //o
	}


}
	
