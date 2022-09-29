package ex15_1_ArrayList_static_toString_sort_input;

import java.util.ArrayList;
import java.util.Scanner;

public class Student2_Main_for_method_NumberFormatExceotion1 {
	public static void main(String args[]) {
		ArrayList<Student2> as = new ArrayList<Student2>();
		input(as);
		Student2.sort(as);
		print(as);// 출력하기
	}
	
	// input 메서드
	static void input(ArrayList<Student2> as) {
		String pandan = "";
		String name;
		int kor, eng, math;
		Scanner sc = new Scanner(System.in);
		while(!pandan.equalsIgnoreCase("q")) {
		System.out.println("이름을 입력하세요>");
		name = (sc.nextLine());
		
		System.out.println("국어 점수를 입력하세요>");
		kor = isNumber(sc);
		
		System.out.println("수학 점수를 입력하세요>");
		math = isNumber(sc);
		
		System.out.println("영어 점수를 입력하세요>");	
		eng = isNumber(sc);
		
		//Student2 h = new Student2(name, kor, math, eng);
		as.add(new Student2(name, kor, math, eng));
		
		 //as.add(h);    
         
		 System.out.println("계속입력하시겠습니까?(q 또는 Q 이면 종료 그외는 계속)");
         pandan = sc.nextLine();

		}
		sc.close();
	}
	
	// 숫자 판별 메서드
	static int isNumber(Scanner sc) {
		int num;
		while (true) {
			try {
				num = Integer.parseInt(sc.nextLine());
				break;
			} catch (java.lang.NumberFormatException e) {
				System.out.print("숫자로 다시 입력하세요>");
			}
		}
		return num;
	}
	
	//출력하기
	static void print(ArrayList<Student2> as) {
		System.out.print("==========    학생별   /  과목별 총점구하기  ==========\n\t");
		System.out.print("국어\t영어\t수학\t총점\t평균\n");
		for (Student2 obj : as) {
			System.out.println(obj.toString());
		}
		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}
		System.out.print("\n총점\t");
		System.out.println(Student2.korTotal + "\t" + Student2.engTotal + "\t" + Student2.mathTotal);
	}
	
}
