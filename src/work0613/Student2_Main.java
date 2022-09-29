package work0613;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Student2_Main {
	public static void main(String args[]) {
		ArrayList<Student2> list = new ArrayList<Student2>();
		input(list);
		Student2.sort(list);
		print(list);// 출력하기
	}
	
	
	static void input(ArrayList<Student2> list) {
		BufferedReader reader = null;
		try {
			 reader = new BufferedReader(new FileReader("src/work0613/jumsu.txt"));
			 String line = null;
			
				while((line = reader.readLine())!= null) {
					StringTokenizer token = new StringTokenizer(line, " ");				
					String name;
					int kor, eng, math;
					name = (token.nextToken());
					kor = Integer.parseInt(token.nextToken());
					math = Integer.parseInt(token.nextToken());
					eng = Integer.parseInt(token.nextToken());
					
					list.add(new Student2(name, kor, math, eng));	
			}
			
		} 
		catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch (IOException ioe) { //Exception - IOException
			System.out.println("파일을 읽을 수 없습니다.");
		}
		finally { //파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용함.
			try {
				reader.close(); // 파일을 닫는 명령문
			}
			catch (Exception e) { //close메소드가 발생하는 예외 처리
				System.out.println(e.getStackTrace());
			}
		}

			
		}  

		

	


	
	
//	// input 메서드
//	static void input(ArrayList<Student2> list) {
//		String pandan = "";
//		String name;
//		int kor, eng, math;
//		Scanner sc = new Scanner(System.in);
//		while(!pandan.equalsIgnoreCliste("q")) {
//		System.out.println("이름을 입력하세요>");
//		name = (sc.nextLine());
//		
//		System.out.println("국어 점수를 입력하세요>");
//		kor = isNumber(sc);
//		
//		System.out.println("수학 점수를 입력하세요>");
//		math = isNumber(sc);
//		
//		System.out.println("영어 점수를 입력하세요>");	
//		eng = isNumber(sc);
//		
//		//Student2 h = new Student2(name, kor, math, eng);
//		list.add(new Student2(name, kor, math, eng));
//		
//		 //list.add(h);    
//         
//		 System.out.println("계속입력하시겠습니까?(q 또는 Q 이면 종료 그외는 계속)");
//         pandan = sc.nextLine();
//
//		}
//		sc.close();
//	}
	
//	// 숫자 판별 메서드
//	static int isNumber(Scanner sc) {
//		int num;
//		while (true) {
//			try {
//				num = Integer.parseInt(sc.nextLine());
//				if(num > 100 || num < 0) 
//	                  System.out.println("1~100 사이의 수를 입력해 주세요");                             
//	            else 
//				break;
//			} catch (java.lang.NumberFormatException e) {
//				System.out.print("숫자로 다시 입력하세요>");
//			}
//		}
//		return num;
//	}
	
//	// 숫자 판별 메서드
//	static int isNumber(Scanner sc) {
//		int num;
//		while (true) {
//			try {
//				num = Integer.parseInt(sc.nextLine());
//				if(num > 100 || num < 0) 
//	                  System.out.println("1~100 사이의 수를 입력해 주세요");                             
//	               else 
//				break;
//			} catch (java.lang.NumberFormatException e) {
//				System.out.print("숫자로 다시 입력하세요>");
//			}
//		}
//		return num;
//	}
	
	//출력하기
	static void print(ArrayList<Student2> list) {
		System.out.print("==========    학생별   /  과목별 총점구하기  ==========\n\t");
		System.out.print("국어\t영어\t수학\t총점\t평균\n");
		for (Student2 obj : list) {
			System.out.println(obj.toString());
		}
		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}
		System.out.print("\n총점\t");
		System.out.println(Student2.korTotal + "\t" + Student2.engTotal + "\t" + Student2.mathTotal);
	}
	
}
