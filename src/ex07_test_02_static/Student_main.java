package ex07_test_02_static;


public class Student_main {

	public static void main(String[] args) {
		/*
		Student h1 = new Student("??ȣ??", 85, 60, 70);
		Student h2 = new Student("?̽±?", 90, 95, 80);
		Student h3 = new Student("???缮", 75, 80, 100);
		Student h4 = new Student("????", 80, 70, 95);
		Student h5 = new Student("?̱???", 100, 60, 80);
		*/
		//int[] a = {1,2,3};
		Student [] students = { new Student("??ȣ??", 85, 60, 70),
								new Student("?̽±?", 90, 95, 80),
								new Student("???缮", 75, 80, 100),
								new Student("????", 80, 70, 95),
								new Student("?̱???", 100, 60, 80) };
			printInfo(students);
			

			System.out.print("\n????");
			System.out.print("\t"+Student.korTotal);
			System.out.print("\t"+Student.engTotal);
			System.out.print("\t"+Student.mathTotal);
			
			
			
		}//main
	
		
		static void printInfo(Student[] objs) {
//			int total[] = new int[3];
			
			System.out.println("==========   ?л???    /   ?????? ???????ϱ? ==========");
			System.out.println("?̸?\t????\t????\t????\t????\t????");
			
			for (Student obj : objs) {
				System.out.print(obj.name + "\t" + obj.kor + "\t" 
							+ obj.eng + "\t" + obj.math + "\t" + obj.getTotal() + "\t" );
				System.out.printf("%.1f\n", obj.getAverage());

				
//				total[0] += obj.kor; 
//				total[1] += obj.eng; 
//				total[2] += obj.math;

		}
				
		for (int i = 0; i < 45; i++) {
			System.out.print("=");
		}

//		System.out.print("\n????\t");
//		for (int i = 0; i < total.length; i++)
//			System.out.print(total[i] + "\t");

	}

	

}