package ex07_test_02_static;

public class Student_main_method_array {

	public static void main(String[] args) {
		Student [] students = { new Student("강호동", 85, 60, 70),
								new Student("이승기", 90, 95, 80),
								new Student("유재석", 75, 80, 100),
								new Student("하하", 80, 70, 95),
								new Student("이광수", 100, 60, 80) };
			printInfo(students);
			
		}//main
	
		static void printInfo(Student[] objs) {
			
			System.out.println("==========   학생별    /   과목별 총점구하기 ==========");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			
			for (Student obj : objs) {
				System.out.print(obj.name + "\t" + obj.kor + "\t" 
							+ obj.eng + "\t" + obj.math + "\t" + obj.getTotal() + "\t" );
				System.out.printf("%.1f\n", obj.getAverage());		
		}		
		for (int i = 0; i < 45; i++) {
			System.out.print("=");
		}

		System.out.print("\n총점\t");
		System.out.println(Student.korTotal+"\t"
							+Student.engTotal+"\t"
							+Student.mathTotal);

	}

	

}