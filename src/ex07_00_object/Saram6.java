package ex07_00_object;

class Saram6 {
	String name;
	double w;
	double ki;
	int age;
	
	//������ - �ݵ�� Ŭ���� �̸��� �Ȱ��� ���� Ÿ���� ����� �մϴ�.
	Saram6(String name, double w, double ki, int age){
		/*
		 * 	this��?
		 * 	�ڹٴ� ��ü�� ������ �� �ֵ���  this Ű���带 �����մϴ�.
		 * 	���������� �ν��Ͻ� �ڽ��� �ּҰ� ����Ǿ� �ֽ��ϴ�.
		 * 	�����ڿ� ��� �ν��Ͻ�(Ŭ�������� ������ ��ü) �޼��忡 ���������� ������ ä�� �����մϴ�.
		 */
		this.name = name;
		this.w = w;
		this.ki = ki;
		this.age = age;
		
	}
	
	//������ - �ݵ�� Ŭ���� �̸��� �Ȱ��� ���� Ÿ���� ����� �մϴ�.
	Saram6(String name2, double w2){
		this.name=name2;
		w = w2;
	}
	
	//������ - �ݵ�� Ŭ���� �̸��� �Ȱ��� ���� Ÿ���� ����� �մϴ�.
	Saram6(double w2, String name2){
		this.name=name2;
		this.w = w2;
	}
	
	
	public void eat ()	{
		System.out.println(name + "��(��) ���� �Դ´�.");
	}
	
	public void walk()	{
		System.out.println(name + "��(��) �ȱ��� �����Դ� " + w +  "�Դϴ�.");
	}
	
	public void sesu() {
		System.out.println(name + "��(��) �����Ѵ�");
	}

}
