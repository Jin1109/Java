package work0609;

import java.util.ArrayList;

public class Student_Main {
	public static void main(String args[]) {

		ArrayList<Student> stdlist = new ArrayList<Student>();
	      
	      stdlist.add(new Student("강호동", 85, 60, 70));
	      stdlist.add(new Student("이승기", 90, 95, 80));
	      stdlist.add(new Student("유재석", 75, 80, 100));
	      stdlist.add(new Student("하하", 80, 70, 95));
	      stdlist.add(new Student("이광수", 100, 65, 80));   
		
	    sort(stdlist);

	      
	      printStudent(stdlist); 
		  
		  }
	
	      static void printStudent(ArrayList<Student> stdlist) {
	  		System.out.print("==========    학생별   /  과목별 총점구하기  ==========\n\t");
	  		System.out.print("국어\t영어\t수학\t총점\t평균\n");
	  		
	  		for (int cnt = 0; cnt<stdlist.size(); cnt++) {
	  	         Student str = stdlist.get(cnt);
	  	         System.out.println(str);
	  	      }  
	  		for(int j=0;j<45;j++){
	  			System.out.print("=");
	  		}
	  		System.out.print("\n총점\t");
	  		System.out.println(Student.korTotal()+"\t"
	  		                  +Student.EngTotal()+"\t"
	  				          +Student.MathTotal());		
	  	}
	      
	      
	      static void sort(ArrayList<Student> student) {
	    	  Student imsi;
	    	  for (int i = 0; i < student.size() - 1; i++) {
	  			for (int j = i + 1; j < student.size(); j++) {
	  				if (student.get(i).getTotal() < student.get(j).getTotal()) {
	  					imsi = student.get(i);
	  					student.set(i, student.get(j));
	  					student.set(j, imsi);
	  				}
	  			}
	  		}
		 }
	      
//	  	//static void sort(ArrayList<Student2> as) {
//	  	static void sort(Student[] student) {
//	  		Student imsi;
//	  		for (int i = 0; i < student.length - 1; i++) {
//	  			for (int j = i + 1; j < student.length; j++) {
//	  				if (student[i].getTotal() < student[j].getTotal()) {
//	  					imsi = student[i];
//	  					student[i] = student[j];
//	  					student[j] = imsi;
//	  				}
//	  			}
//	  		}
//	  }



	
	
	
	   

			
	
}
