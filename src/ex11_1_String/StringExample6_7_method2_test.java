/*
1. check_length �޼���
  (1) �Ű����� : �ֹι�ȣ(String)
  (2) �Ű������� ���̰� 14���̸� true,  �ƴϸ� false ����
  
2. pandan_gender �޼���
  (1) �Ű����� : �ֹι�ȣ(String)
  (2) �ֹι�ȣ ���ڸ� ó�����ڸ� üũ�ؼ� �ش� ���ڿ��� �����մϴ�.
      1,3-����
      2,4-����
      �׿� - �ܱ��� 
             
3. check_hyphen �޼���
   (1) �Ű����� : �ֹι�ȣ(String)
   (2) �ֹι�ȣ ���ڸ� �� 7��° ���ڿ��� "-"���� �Ǵ��մϴ�.
       "-"�̸� true,  �ƴϸ� false ����

4. isNumber �޼���
   (1) �Ű����� : �ֹι�ȣ(String)
   (2) �ֹι�ȣ�� ���ʴ�� ���ؼ� ���ڰ� �ƴ� ��� �ش� �ε����� �����մϴ�.
              ��, -�� �������� ������ �ʽ��ϴ�.
              ���� ���ڸ��� ���ڸ��� �����̸� -1�� �����մϴ�.

5. main()
   (1) check_length(zumin)�� ���� ��� check_hyphen(zumin) ȣ��
   (2) check_length(zumin)�� ������ ���     "�ֹε�Ϲ�ȣ�� 14�ڸ� �Դϴ�. " ���
   (3) check_hyphen(zumin)�� ���� ��� isNumber(zumin) ȣ��
       check_hyphen(zumin)�� �����̸� "-�� �־��ּ���" ���
   (4) isNumber(zumin)�� ���� 0~5�����̸�    "�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���" ���
   (5) isNumber(zumin)�� ���� 7~13�����̸�    "�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���" ���      
   (6) check_length(zumin)�� true,check_hyphen(zumin) true, isNumber(zumin)�� -1 �� ���
              ���� �Ǵ� ���� �Ǵ� �ܱ��� ���
 */
package ex11_1_String;

public class StringExample6_7_method2_test {
	public static void main(String[] args) {
		String zumin = "123456-1234569";
		
		System.out.println(zumin.length() ==14);
		System.out.println(zumin.length() ==14 ? true :false);
	}//main end
}
