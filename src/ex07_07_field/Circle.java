package ex07_07_field;
public class Circle {
	double radius;		// �ʵ�
	/*
	 *  this��?
	 *  �ڹٴ� ��ü�� ������ �� �ֵ��� this Ű���带 �����մϴ�.
	 *  ���������� �ν��Ͻ� �ڽ��� ���Ұ� ����Ǿ� �ֽ����.
	 *  �����ڿ� ��� �ν��Ͻ� �޼��忡 ���������� ������ ä�� �����մϤ���.
	 */
	Circle(double radius )	{		// ������
		this.radius = radius;
	}
	
	double getArea()	{ 	//�޼ҵ�
		double area = radius * radius * 3.14; 
		return area;	
		//return radius * radius * 3.14; 
	}
	
	
}
