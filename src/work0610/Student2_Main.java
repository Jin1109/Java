package work0610;

import java.util.ArrayList;

public class Student2_Main {
	public static void main(String args[]) {
		
	

//		Student2[] students = {
//	      new Student2("��ȣ��", 85, 60, 70),
//	      new Student2("�̽±�", 90, 95, 80),
//	      new Student2("���缮", 75, 80, 100),
//	      new Student2("����", 80, 70, 95),
//	      new Student2("�̱���", 100, 65, 80)};   

		ArrayList<Student2> as = new ArrayList<Student2>();
		Student2.input(as);
		Student2.sort(as);
		print(as);// ����ϱ�
	}

	static void print(ArrayList<Student2> as) {
		System.out.print("==========    �л���   /  ���� �������ϱ�  ==========\n\t");
		System.out.print("����\t����\t����\t����\t���\n");
		for (Student2 obj : as) {
			System.out.println(obj.toString());
		}
		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}
		System.out.print("\n����\t");
		System.out.println(Student2.korTotal + "\t" + Student2.engTotal + "\t" + Student2.mathTotal);
	}

}
