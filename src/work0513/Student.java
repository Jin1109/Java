package work0513;
public class Student {
		String name; 
		int kor;
		int eng;
		int math;
		static int korTotal, mathTotal, engTotal;

		void korTotal(int var) {	
			korTotal += kor;
		}
		
		void engTotal(int var) {	
			engTotal += eng;
		}

		
		void mathTotal(int m) {
			mathTotal += math;
		}

		Student (String name, int kor, int eng, int math) {
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
			return (getTotal() / 3.f);
		}
		
		static int korTotal() {
			return korTotal;
		}
		
		static int engTotal() {
			return engTotal;
		}
		
		static int mathTotal() {
			return mathTotal;
		}

		
		
	
}
