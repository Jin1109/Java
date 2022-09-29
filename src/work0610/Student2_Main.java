package work0610;

import java.util.ArrayList;

public class Student2_Main {
	public static void main(String args[]) {
		
	

//		Student2[] students = {
//	      new Student2("강호동", 85, 60, 70),
//	      new Student2("이승기", 90, 95, 80),
//	      new Student2("유재석", 75, 80, 100),
//	      new Student2("하하", 80, 70, 95),
//	      new Student2("이광수", 100, 65, 80)};   

		ArrayList<Student2> as = new ArrayList<Student2>();
		Student2.input(as);
		Student2.sort(as);
		print(as);// 출력하기
	}

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
