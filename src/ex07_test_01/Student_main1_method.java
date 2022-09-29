package ex07_test_01;

public class Student_main1_method {

	public static void main(String[] args) {

		Student h1 = new Student("강호동", 85, 60, 70);
		Student h2 = new Student("이승기", 90, 95, 80);
		Student h3 = new Student("유재석", 75, 80, 100);
		Student h4 = new Student("하하", 80, 70, 95);
		Student h5 = new Student("이광수", 100, 60, 80);

		int total[] = new int[3];
		System.out.println("==========   학생별    /   과목별 총점구하기 ==========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

		printInfo(h1);
		printInfo(h2);
		printInfo(h3);
		printInfo(h4);
		printInfo(h5);

		total[0] = h1.kor + h2.kor + h3.kor + h4.kor + h5.kor;
		total[1] = h1.eng + h2.eng + h3.eng + h4.eng + h5.eng;
		total[2] = h1.math + h2.math + h3.math + h4.math + h5.math;

		for (int i = 0; i < 45; i++) {
			System.out.print("=");
		}

		System.out.print("\n총점\t");
		for (int i = 0; i < total.length; i++)
			System.out.print(total[i] + "\t");

	}

	static void printInfo(Student s) {
		System.out.print(s.name + "\t" + s.kor + "\t" + s.eng + "\t" + s.math + "\t" + s.getTotal() + "\t");
		System.out.printf("%.1f\n", s.getAverage());

	}

}