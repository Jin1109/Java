package ex07_test_02_static;

public class Student_main_method {

	public static void main(String[] args) {

		Student obj1 = new Student("강호동", 85, 60, 70);
		Student obj2 = new Student("이승기", 90, 95, 80);
		Student obj3 = new Student("유재석", 75, 80, 100);
		Student obj4 = new Student("하하", 80, 70, 95);
		Student obj5 = new Student("이광수", 100, 60, 80);


		System.out.println("==========   학생별    /   과목별 총점구하기 ==========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

		printStudnet(obj1);
		printStudnet(obj2);
		printStudnet(obj3);
		printStudnet(obj4);
		printStudnet(obj5);

		for (int i = 0; i < 45; i++) {
			System.out.print("=");
		}
		
		System.out.print("\n총점\t");
		System.out.println(Student.korTotal+"\t"
							+Student.engTotal+"\t"
							+Student.mathTotal);
	}

	static void printStudnet(Student obj) {
		System.out.print(obj.name+"\t"+obj.kor+"\t"+obj.eng+"\t"
						+obj.math+"\t"+obj.getTotal()+"\t");
		System.out.printf("%.1f\n", obj.getAverage());

	}

}