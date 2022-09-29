package ex18_6_Buffered3_sort;

import java.util.ArrayList;


public class Student2 {
	String name;
	int kor;
	int math;
	int eng;
	static int korTotal;
	static int mathTotal;
	static int engTotal;

	public Student2(String name, int kor, int eng, int math) {
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

	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + getTotal() + "\t"
				+ String.format("%.1f", getAverage());

//		      return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + getTotal() + "\t" 
//		    		+ Math.round(getAverage()*10)/10.0;

	}

	// 정렬하기
	static void sort(ArrayList<Student2> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getTotal() < list.get(j).getTotal()) {
					/*
					 * Student2 imsi = as.get(i); as.set(i, as.get(j)); as.set(j, imsi);
					 */
					Student2 imsj = list.get(j);
					list.set(j, list.get(i));
					list.set(i, imsj);
				}
			}
		}
	}
}
