//����ڰ� ������ �޼��带 ������ �� �ֵ��� �մϴ�.
///�̰����޼��� ȣ���̶�� �մϴ�.
//�� �޼��带 ȣ���ϸ� �ش� �޼��带 �����մϴ�.
package ex06_2_method;

public class MethidExample8 {
	
  //����������	��ü�������� ���ٰ���		��ȯ�ȴ� ���� �ڷ���		�޼��� �̸� (�Ű����� ���)
	public 		static 			void 				main(String[] args) {
		char data='*';
		print(data);	
					
	}
	
	// �޼��� ���� 
	public static void print(char parameter) {
		System.out.println("print() �޼��� �Դϴ�.");
		System.out.println("main() �޼��忡�� ���޹��� �������� ���� " + parameter + "�Դϴ�.");
	}
}
