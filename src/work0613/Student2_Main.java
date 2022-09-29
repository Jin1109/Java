package work0613;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Student2_Main {
	public static void main(String args[]) {
		ArrayList<Student2> list = new ArrayList<Student2>();
		input(list);
		Student2.sort(list);
		print(list);// ����ϱ�
	}
	
	
	static void input(ArrayList<Student2> list) {
		BufferedReader reader = null;
		try {
			 reader = new BufferedReader(new FileReader("src/work0613/jumsu.txt"));
			 String line = null;
			
				while((line = reader.readLine())!= null) {
					StringTokenizer token = new StringTokenizer(line, " ");				
					String name;
					int kor, eng, math;
					name = (token.nextToken());
					kor = Integer.parseInt(token.nextToken());
					math = Integer.parseInt(token.nextToken());
					eng = Integer.parseInt(token.nextToken());
					
					list.add(new Student2(name, kor, math, eng));	
			}
			
		} 
		catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		catch (IOException ioe) { //Exception - IOException
			System.out.println("������ ���� �� �����ϴ�.");
		}
		finally { //������ �ݴ� ��ɹ��� ������ ������� ó���ϱ� ���� finally��Ͽ��� �����.
			try {
				reader.close(); // ������ �ݴ� ��ɹ�
			}
			catch (Exception e) { //close�޼ҵ尡 �߻��ϴ� ���� ó��
				System.out.println(e.getStackTrace());
			}
		}

			
		}  

		

	


	
	
//	// input �޼���
//	static void input(ArrayList<Student2> list) {
//		String pandan = "";
//		String name;
//		int kor, eng, math;
//		Scanner sc = new Scanner(System.in);
//		while(!pandan.equalsIgnoreCliste("q")) {
//		System.out.println("�̸��� �Է��ϼ���>");
//		name = (sc.nextLine());
//		
//		System.out.println("���� ������ �Է��ϼ���>");
//		kor = isNumber(sc);
//		
//		System.out.println("���� ������ �Է��ϼ���>");
//		math = isNumber(sc);
//		
//		System.out.println("���� ������ �Է��ϼ���>");	
//		eng = isNumber(sc);
//		
//		//Student2 h = new Student2(name, kor, math, eng);
//		list.add(new Student2(name, kor, math, eng));
//		
//		 //list.add(h);    
//         
//		 System.out.println("����Է��Ͻðڽ��ϱ�?(q �Ǵ� Q �̸� ���� �׿ܴ� ���)");
//         pandan = sc.nextLine();
//
//		}
//		sc.close();
//	}
	
//	// ���� �Ǻ� �޼���
//	static int isNumber(Scanner sc) {
//		int num;
//		while (true) {
//			try {
//				num = Integer.parseInt(sc.nextLine());
//				if(num > 100 || num < 0) 
//	                  System.out.println("1~100 ������ ���� �Է��� �ּ���");                             
//	            else 
//				break;
//			} catch (java.lang.NumberFormatException e) {
//				System.out.print("���ڷ� �ٽ� �Է��ϼ���>");
//			}
//		}
//		return num;
//	}
	
//	// ���� �Ǻ� �޼���
//	static int isNumber(Scanner sc) {
//		int num;
//		while (true) {
//			try {
//				num = Integer.parseInt(sc.nextLine());
//				if(num > 100 || num < 0) 
//	                  System.out.println("1~100 ������ ���� �Է��� �ּ���");                             
//	               else 
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
