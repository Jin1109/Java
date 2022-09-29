package work0614;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Student_Main_method_studentinput2_split {
	public static void main(String args[]) {
		ArrayList<Student2> list = new ArrayList<Student2>();
		input(list);
		Student2.sort(list);
		print(list);// 출력하기
	}
	
	// input 메서드
	static void input(ArrayList<Student2> list) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("src/ex18_6_Buffered3_sort/jumsu.txt"));
			while (true) {
				String str = reader.readLine();// 파일로 부터 한 행씩 읽어요.
				if (str == null)
					break;
				String[] sep = str.split(" ");
				list.add(new Student2(sep[0],
						Integer.parseInt(sep[1]),
						Integer.parseInt(sep[2]),
						Integer.parseInt(sep[3])));
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				System.out.println("파일을 닫는 중 오류 입니다.");
			}
		}

	}
	
	
//	// 숫자 판별 메서드
//	static int isNumber(Scanner sc) {
//		int num;
//		while (true) {
//			try {
//				num = Integer.parseInt(sc.nextLine());
//				break;
//			} catch (java.lang.NumberFormatException e) {
//				System.out.print("숫자로 다시 입력하세요>");
//			}
//		}
//		return num;
//	}
	
	//출력하기
	static void print(ArrayList<Student2> list) {
		System.out.print("==========    학생별   /  과목별 총점구하기  ==========\n\t");
		System.out.print("국어\t영어\t수학\t총점\t평균\n");
		for (Student2 obj : list) {
			System.out.println(obj.toString());
		}
		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}
		System.out.print("\n총점\t");
		System.out.println(Student2.korTotal + "\t" + Student2.engTotal + "\t" + Student2.mathTotal);
	}
	
}
