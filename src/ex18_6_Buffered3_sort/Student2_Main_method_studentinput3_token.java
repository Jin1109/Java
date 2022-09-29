package ex18_6_Buffered3_sort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Student2_Main_method_studentinput3_token {
	public static void main(String args[]) {
		ArrayList<Student2> list = new ArrayList<Student2>();
		input(list);
		Student2.sort(list);
		print(list);// ����ϱ�
	}
	
	// input �޼���
	static void input(ArrayList<Student2> list) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("src/ex18_6_Buffered3_sort/jumsu.txt"));
			while (true) {
				String str = reader.readLine();// ���Ϸ� ���� �� �྿ �о��.
				if (str == null)
					break;
				StringTokenizer sep = new StringTokenizer(str);
				list.add(new Student2(sep.nextToken(),
						Integer.parseInt(sep.nextToken()),
						Integer.parseInt(sep.nextToken()),
						Integer.parseInt(sep.nextToken())));
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				System.out.println("������ �ݴ� �� ���� �Դϴ�.");
			}
		}

	}
	
	
//	// ���� �Ǻ� �޼���
//	static int isNumber(Scanner sc) {
//		int num;
//		while (true) {
//			try {
//				num = Integer.parseInt(sc.nextLine());
//				break;
//			} catch (java.lang.NumberFormatException e) {
//				System.out.print("���ڷ� �ٽ� �Է��ϼ���>");
//			}
//		}
//		return num;
//	}
	
	//����ϱ�
	static void print(ArrayList<Student2> list) {
		System.out.print("==========    �л���   /  ���� �������ϱ�  ==========\n\t");
		System.out.print("����\t����\t����\t����\t���\n");
		for (Student2 obj : list) {
			System.out.println(obj.toString());
		}
		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}
		System.out.print("\n����\t");
		System.out.println(Student2.korTotal + "\t" + Student2.engTotal + "\t" + Student2.mathTotal);
	}
	
}