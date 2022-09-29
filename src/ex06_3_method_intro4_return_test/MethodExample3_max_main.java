package ex06_3_method_intro4_return_test;

import java.util.Scanner;

public class MethodExample3_max_main {

	public static int max(int a, int b) {
		if (a>b)
			return a;
		else
			return b;
	}
	
	public static int min(int a, int b) {
		if (a<b)
			return a;
		else
			return b;
	}
	
	public static void main(String[] args) {  
      int n1, n2, max2, min2;
      System.out.println("두개의 정수를 입력 하세요?");
      Scanner sc = new Scanner(System.in);//Scanner에서 Ctrl+Shift+o 클릭
      n1=sc.nextInt();
      n2=sc.nextInt();
      
      max2=max(n1,n2);
      min2=min(n1,n2);
      
      //max2는 변수, max(n1,n2)의 max는 메소드 이름
      System.out.println("max = "+ max2);
      System.out.println("min = "+ min2);
      sc.close();
	}
	
	
	
}