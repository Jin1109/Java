package ex06_1_array;

import java.util.Scanner;

public class ArrayTest03_1_my {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in); 
			
			System.out.print("�� ���� ���ڸ� �Է��Ͻðڽ��ϱ�? ");
			int count = sc.nextInt(); 
			
			int[] data = new int[count]; 
			
			for(int i=0; i<data.length; i++) { 
				System.out.print("num[" + i + "] = ");
				data[i] = sc.nextInt(); 
			}
			sc.close(); 
			
			// �ִ� ���ϱ�
			int max = data[0]; 
			for(int i=1; i<data.length; i++) { 
				if(max < data[i]) max = data[i]; 
			}
			System.out.println("�ִ� : " + max);
			
			// �ּڰ� ���ϱ�
			int min = data[0]; 
			for(int i=1; i<data.length; i++) { 
				if(min > data[i]) min = data[i]; 
			}
			System.out.println("�ּڰ� : " + min);
 
	}
	

}
