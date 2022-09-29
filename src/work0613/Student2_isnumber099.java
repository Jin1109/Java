package work0613;

import java.util.ArrayList;
import java.util.Scanner;


public class Student2_isnumber099 {
	String name;
	int kor;
	int math;
	int eng;
	static int korTotal;
	static int mathTotal;
	static int engTotal;

	public Student2_isnumber099(String name, int kor, int eng, int math) {
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

	// 숫자 판별 메서드(1~100사이의 값)
	static int isNumber(Scanner sc) {
		int num;
		while (true) {
			try {
				num = Integer.parseInt(sc.nextLine());
				if (num > 100 || num < 0)
					System.out.println("1~100 사이의 수를 입력해 주세요");
				break;
			} catch (java.lang.NumberFormatException e) {
				System.out.print("숫자로 다시 입력하세요>");
			}
		}
		return num;
	}

	// 정렬하기
	static void sort(ArrayList<Student2_isnumber099> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getTotal() < list.get(j).getTotal()) {
					/*
					 * Student2 imsi = list.get(i); list.set(i, list.get(j)); list.set(j, imsi);
					 */
					Student2_isnumber099 imsj = list.get(j);
					list.set(j, list.get(i));
					list.set(i, imsj);
				}
			}
		}
	}
}