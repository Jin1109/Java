/*
 ������
  1. ��Ŭ�������� ���� ����(146������)
  	 1) �ش�ҽ����� Ctrl + F11
  	 2) Package Explorer���� �ҽ��� ���� �� ������ ���콺 ��ư Ŭ��
  	 	-> Run as -> Run Configurations
  	 	-> ������ ȭ���� Arguments�� ���� ��
  	 	-> Program arguments ���ڿ��� ���� �Է��մϴ�.
  	 	-> �ΰ� �̻� ���ÿ��� blank �Ǵ� ���ͷ� �����մϴ�.
  	 				  ���� ������ �� ���ڿ��� ��� �����ڵ�(")�ȿ� ���ڿ��� �ֽ��ϴ�.
  	 				  ���� �α� ����
 2. cmd â���� �ǽ�
   	 1) Java������Ʈ ����� bin������ �̵�
   	 2) java ��Ű����.Ŭ�����̸� ���� �α� ���� �Է� �� ����
   	 	 ��)C:\Users\JIN\Desktop\eclipse-workspace\Java\bin>java ex06_1_array_main.Main_arg1 ���� �α� ����
   	 	 cd C:\Users\JIN\Desktop\eclipse-workspace\Java\bin
   	 	 java ex06_1_array_main.Main_arg1 ���� �α� ����
 */

package ex06_1_array_main;

public class Main_arg2 {
	public static void main(String[] args) {
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}
}
