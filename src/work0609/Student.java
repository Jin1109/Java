package work0609;

public class Student {
	String name;
	int kor;
	int math;
	int eng;
	static int korTotal;
	static int mathTotal;
	static int engTotal;

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;		
		this.eng = eng;
		this.math = math;
		korTotal+=kor;
		engTotal+=eng;
		mathTotal+=math;
	}
	int getTotal() {
		return kor+eng+math;	
	}
	
	float getAverage(){ 
	   	 return (getTotal() / 3f);
	}
	
	public String toString() {
    	return name + "\t" + kor + "\t"+eng+ "\t"+ math+ "\t" + getTotal() + "\t" 
 		       + String.format("%.1f", getAverage());
//	    return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + getTotal() + "\t" 
//	    	   + Math.round(getAverage()*10)/10.0;
       }
	
	public static int korTotal() {
		return korTotal;
	}
	
	public static int EngTotal() {
		return engTotal;
	}
	public static int MathTotal() {
		return mathTotal;
	}


}	  
