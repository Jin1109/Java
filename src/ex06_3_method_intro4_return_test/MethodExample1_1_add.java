/*
 ���� ������ �����ϴ� �޼��带 ������ ���¿�
 1. �޼��� �̸� : add
 	�Ű� ���� : ������ 2��
 	��� : �Ű� ������ ���� ���Ѵ�.
 	��ȯ�� : �Ű� ������ ���� ���� ��
 	��ȯ�� : int
 	
 2. 1������ ������ add �޼��带 ȣ���մϴ�.
 		���ڰ����� 3�� 4�� ����մϴ�.
 		
 3. add()�޼��� ȣ�� ������� ����մϴ�.
 	���ȭ��)
  	7
  		
 */

package ex06_3_method_intro4_return_test;

public class MethodExample1_1_add {

   public static int add(int num1, int num2) {
	   int sum;
	   sum = num1 + num2;
	   return sum;
   }
   
   public static void main(String[] args) {
		int result = add(3, 4);
		System.out.println(result);
   	}

}
