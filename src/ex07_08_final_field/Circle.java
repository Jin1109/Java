package ex07_08_final_field;

public class Circle {
	double radius;		// �ʵ�
	final double PI = 3.14;
	
	Circle(double radius )	{		// ������
		this.radius = radius;
	}
	
	double getArea()	{ 	//�޼ҵ�
		return radius * radius * PI; 
	}
	
	
}
