package ex07_test_02_static;

public class Student {
		String name; 
		int kor;
		int eng;
		int math;
		static int korTotal;
		static int engTotal;
		static int mathTotal;
		

		public Student (String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			korTotal += kor;
			engTotal += eng;
			mathTotal += math;
		}
		
		int getTotal() {
			return kor + eng + math;
		}
		
		float getAverage() {
			return (getTotal() / 3f);
		}
		
		
	
}
