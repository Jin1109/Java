package ex15_1_ArrayList_static_toString_sort_input;

import java.util.ArrayList;
import java.util.Scanner;

public class Student2_Main_for_method_NumberFormatExceotion1 {
	public static void main(String args[]) {
		ArrayList<Student2> as = new ArrayList<Student2>();
		input(as);
		Student2.sort(as);
		print(as);// ����ϱ�
	}
	
	// input �޼���
	static void input(ArrayList<Student2> as) {
		String pandan = "";
		String name;
		int kor, eng, math;
		Scanner sc = new Scanner(System.in);
		while(!pandan.equalsIgnoreCase("q")) {
		System.out.println("�̸��� �Է��ϼ���>");
		name = (sc.nextLine());
		
		System.out.println("���� ������ �Է��ϼ���>");
		kor = isNumber(sc);
		
		System.out.println("���� ������ �Է��ϼ���>");
		math = isNumber(sc);
		
		System.out.println("���� ������ �Է��ϼ���>");	
		eng = isNumber(sc);
		
		//Student2 h = new Student2(name, kor, math, eng);
		as.add(new Student2(name, kor, math, eng));
		
		 //as.add(h);    
         
		 System.out.println("����Է��Ͻðڽ��ϱ�?(q �Ǵ� Q �̸� ���� �׿ܴ� ���)");
         pandan = sc.nextLine();

		}
		sc.close();
	}
	
	// ���� �Ǻ� �޼���
	static int isNumber(Scanner sc) {
		int num;
		while (true) {
			try {
				num = Integer.parseInt(sc.nextLine());
				break;
			} catch (java.lang.NumberFormatException e) {
				System.out.print("���ڷ� �ٽ� �Է��ϼ���>");
			}
		}
		return num;
	}
	
	//����ϱ�
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
