//private �ʵ带 ���� Ŭ������ ��
/*
 * ��ü ���� ���α׷����� �ֿ� Ư¡ �� �ϳ��� ĸ��ȭ�� Ŭ���� ����� Ŭ���� ���ο� ���ߴ� ��
   Ŭ���� ����� �ܺο��� ������ �� ������ �����ϱ� ���� private�� ���
   ������ �Ϻ� ����� �ܺ� Ŭ������ ����� �� �ֵ��� �����ؾ� ��
 * ���� �������� ������ ���� ȸ�θ� ĸ��ȭ�ؼ� ���������� ���� ��ư, 
   ���� ���� ��ư ������ �ܺο� �����ؼ� ����� �� �ְ� �մϴ�.
   ��ó�� Ŭ���� ���ο� ����ȯ �ʵ带 �ܺο��� ����� �� �ֵ���
   Getter�� Setter�� �����մϴ�.
   �Ϲ������� Getter�� get, Setter�� set���� �����ϴ� �̸��� ����մϴ�.
   radius �ʵ忡 ���� �ϱ� ���ؼ� getRadius(), setRadius()�޼��带 ����մϴ�.
 */
package ex07_08_private_field;

public class Circle2 {
	//���� �����ڰ� private�� Ŭ���� ���ο��� ��밡���մϴ�.
	private double radius;		// �ʵ�
	
	final double PI = 3.14;
	Circle2(double radius )	{		// ������
		this.radius = radius;
	}
	
	double getArea()	{ 	//�޼ҵ�
		return radius * radius * PI;
		
	}
	//getter �޼���
	public double getRadius() {
		return radius;
	}
	
	//setter �޼���
	public void  setRadius(double radius) {
		this.radius = radius;
	}
	
}
