//private �ʵ带 ���� Ŭ������ ��
package ex07_08_private_field;

public class Circle {
	//���� �����ڰ� private�� Ŭ���� ���ο��� ��밡���մϴ�.
	private double radius;		// �ʵ�
	
	final double PI = 3.14;
	Circle(double radius )	{		// ������
		this.radius = radius;
	}
	
	double getArea()	{ 	//�޼ҵ�
		return radius * radius * PI;
		
	}
}
