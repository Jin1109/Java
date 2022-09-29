//두 개의 생성자를 갖는 클래스
package work0512;
public class Student {
		String name; 
		int kor, eng, math;

		

		Student (String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		

		
		int getTotal() {
			return kor + eng + math;
		}
		
		float getAverage() {
			return (getTotal() / 3.f);
		}
		
		
	
}
