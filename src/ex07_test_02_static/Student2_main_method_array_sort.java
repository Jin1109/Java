package ex07_test_02_static;

public class Student2_main_method_array_sort {

	public static void main(String[] args) {

		Student2 [] students = { new Student2("강호동", 85, 60, 70),
								new Student2("이승기", 90, 95, 80),
								new Student2("유재석", 75, 80, 100),
								new Student2("하하", 80, 70, 95),
								new Student2("이광수", 100, 60, 80) };
			Student2.sort(students);
			printStudent2(students);
			
		}
	
		static void printStudent2(Student2[] objs) {
			int total[] = new int[3];
			
			System.out.println("==========   학생별    /   과목별 총점구하기 ==========");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			
			for (Student2 obj : objs) {
				System.out.print(obj.name + "\t" + obj.kor + "\t" 
							+ obj.eng + "\t" + obj.math + "\t" + obj.getTotal() + "\t" );
				System.out.printf("%.1f\n", obj.getAverage());
				
				total[0] += obj.kor; 
				total[1] += obj.eng; 
				total[2] += obj.math;

		}
				
		for (int i = 0; i < 45; i++) {
			System.out.print("=");
		}

		System.out.print("\n총점\t");
		for (int i = 0; i < total.length; i++)
			System.out.print(total[i] + "\t");

	}

	

}