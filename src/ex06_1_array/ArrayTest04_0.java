package ex06_1_array;

import java.util.Scanner;

public class ArrayTest04_0 {
	public static void main(String[] args) {
		int[] su=new int[5];
		
		System.out.println("정수  5개를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		su[0]=sc.nextInt(); 
		//su[0]=sc.nextInt(); //배열의 초기값 0으로 계산하려면 주석을 달면 된다
		int max=su[0],min=su[0];
		
		for(int i=1;i<su.length;i++) {
			//초기값이 i = 0 이면 음수로 했을떄 0이 기본값이여서 0이 제일 큰수로 나온다
			su[i]=sc.nextInt();
			if (max < su[i])	max = su[i];
			if (min > su[i])	min = su[i];
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		sc.close();

	}
	

}
