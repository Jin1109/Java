package ex07_test_02_static;

public class Student_main_method {

	public static void main(String[] args) {

		Student obj1 = new Student("��ȣ��", 85, 60, 70);
		Student obj2 = new Student("�̽±�", 90, 95, 80);
		Student obj3 = new Student("���缮", 75, 80, 100);
		Student obj4 = new Student("����", 80, 70, 95);
		Student obj5 = new Student("�̱���", 100, 60, 80);


		System.out.println("==========   �л���    /   ���� �������ϱ� ==========");
		System.out.println("�̸�\t����\t����\t����\t����\t���");

		printStudnet(obj1);
		printStudnet(obj2);
		printStudnet(obj3);
		printStudnet(obj4);
		printStudnet(obj5);

		for (int i = 0; i < 45; i++) {
			System.out.print("=");
		}
		
		System.out.print("\n����\t");
		System.out.println(Student.korTotal+"\t"
							+Student.engTotal+"\t"
							+Student.mathTotal);
	}

	static void printStudnet(Student obj) {
		System.out.print(obj.name+"\t"+obj.kor+"\t"+obj.eng+"\t"
						+obj.math+"\t"+obj.getTotal()+"\t");
		System.out.printf("%.1f\n", obj.getAverage());

	}

}