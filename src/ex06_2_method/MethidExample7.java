//����ڰ� ������ �޼��带 ������ �� �ֵ��� �մϴ�.
///�̰����޼��� ȣ���̶�� �մϴ�.
//�� �޼��带 ȣ���ϸ� �ش� �޼��带 �����մϴ�.
package ex06_2_method;

public class MethidExample7 {
	
  //����������	��ü�������� ���ٰ���		��ȯ�ȴ� ���� �ڷ���		�޼��� �̸� (�Ű����� ���)
	public 		static 			void 				main(String[] args) {
		int num=50;
		//num ������ ���� �ִ� ���� print() ����Ϸ��� ��� �ؾ� �ұ��?
		print(num);	//�޼����� ��ȣ�ȿ� ���� �־��ָ� �˴ϴ�.
					//�޼���� ������ ������ num�� ���� �����ϱ� ���� ������ ������ �־�� �մϴ�.
					//ȣ���ϴ� �޼��忡�� ����� num�� ���� ���ڶ�� �ϸ� 50
					//�޼��� ���ǿ� ���� parameter�� �Ű�������� �մϴ�.
	}
	
	// �޼��� ����
	// print(num) = print(int parameter) 
	public static void print(int parameter) {
		System.out.println("print() �޼��� �Դϴ�.");
		System.out.println("main() �޼��忡�� ���޹��� �������� ���� " + parameter + "�Դϴ�.");
	}
}
