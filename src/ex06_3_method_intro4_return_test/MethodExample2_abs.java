/*
 1. 정수를 입력 받아 inputdata에 저장합니다.
 2. abs(inputdata) 호출 합니다
 3. abs(inputdata) 메서드의 반환형은 int형 입니다.
 
 출력결과)
 정수를 입력 하셍요?-3
 절대값 :3
 
  출력결과)
 정수를 입력 하셍요?3
 절대값 :3
 
 */

package ex06_3_method_intro4_return_test;

import java.util.Scanner;

public class MethodExample2_abs {

	public static void main(String[] args) {  
      System.out.println("정수를 입력하세요");
      Scanner sc = new Scanner(System.in);
      int inputdata = sc.nextInt();
      int result = abs(inputdata);
      System.out.println("절대값 :"+ result);
      sc.close();
      
	}
	
	public static int abs(int data) {//절대값 구하는 메소드
		if(data<0)
			data =-data;
		return data;
	}
	
}