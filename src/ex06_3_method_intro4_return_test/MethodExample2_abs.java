/*
 1. ������ �Է� �޾� inputdata�� �����մϴ�.
 2. abs(inputdata) ȣ�� �մϴ�
 3. abs(inputdata) �޼����� ��ȯ���� int�� �Դϴ�.
 
 ��°��)
 ������ �Է� �ϼĿ�?-3
 ���밪 :3
 
  ��°��)
 ������ �Է� �ϼĿ�?3
 ���밪 :3
 
 */

package ex06_3_method_intro4_return_test;

import java.util.Scanner;

public class MethodExample2_abs {

	public static void main(String[] args) {  
      System.out.println("������ �Է��ϼ���");
      Scanner sc = new Scanner(System.in);
      int inputdata = sc.nextInt();
      int result = abs(inputdata);
      System.out.println("���밪 :"+ result);
      sc.close();
      
	}
	
	public static int abs(int data) {//���밪 ���ϴ� �޼ҵ�
		if(data<0)
			data =-data;
		return data;
	}
	
}