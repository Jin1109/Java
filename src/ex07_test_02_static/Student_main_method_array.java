package ex07_test_02_static;

public class Student_main_method_array {

	public static void main(String[] args) {
		Student [] students = { new Student("��ȣ��", 85, 60, 70),
								new Student("�̽±�", 90, 95, 80),
								new Student("���缮", 75, 80, 100),
								new Student("����", 80, 70, 95),
								new Student("�̱���", 100, 60, 80) };
			printInfo(students);
			
		}//main
	
		static void printInfo(Student[] objs) {
			
			System.out.println("==========   �л���    /   ���� �������ϱ� ==========");
			System.out.println("�̸�\t����\t����\t����\t����\t���");
			
			for (Student obj : objs) {
				System.out.print(obj.name + "\t" + obj.kor + "\t" 
							+ obj.eng + "\t" + obj.math + "\t" + obj.getTotal() + "\t" );
				System.out.printf("%.1f\n", obj.getAverage());		
		}		
		for (int i = 0; i < 45; i++) {
			System.out.print("=");
		}

		System.out.print("\n����\t");
		System.out.println(Student.korTotal+"\t"
							+Student.engTotal+"\t"
							+Student.mathTotal);

	}

	

}