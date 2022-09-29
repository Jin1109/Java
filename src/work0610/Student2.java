package work0610;

import java.util.ArrayList;
import java.util.Scanner;


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

	// input �޼���
	static void input(ArrayList<Student2> as) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("�̸��� �Է��ϼ���>");
		String name = (sc.nextLine());
		System.out.println("���� ������ �Է��ϼ���>");
		int kor = isNumber(sc);
		System.out.println("���� ������ �Է��ϼ���>");
		int math = isNumber(sc);
		System.out.println("���� ������ �Է��ϼ���>");	
		int eng = isNumber(sc);
		System.out.println("����Է��Ͻðڽ��ϱ�?(q �Ǵ� Q �̸� ���� �׿ܴ� ���)");
		String answer = sc.nextLine();
		as.add(new Student2(name, kor, math, eng));
		if(answer.equals("q")) {
			break;}
		if(answer.equals("Q")) {
			break;}
		}
		sc.close();
		return ;
		
		
		} 
			




	// ���� �Ǻ� �޼���
	static int isNumber(Scanner sc) {
		int num;
		while (true) {
			try {
				num = Integer.parseInt(sc.nextLine());
				break;
			} catch (java.lang.NumberFormatException e) {
				System.out.print("���ڷ� �ٽ� �Է��ϼ���>");
			}
		}
		return num;
	}

	// �����ϱ�
	static void sort(ArrayList<Student2> as) {
		for (int i = 0; i < as.size() - 1; i++) {
			for (int j = i + 1; j < as.size(); j++) {
				if (as.get(i).getTotal() < as.get(j).getTotal()) {
					/*
					 * Student2 imsi = as.get(i); as.set(i, as.get(j)); as.set(j, imsi);
					 */
					Student2 imsj = as.get(j);
					as.set(j, as.get(i));
					as.set(i, imsj);
				}
			}
		}
	}
}
