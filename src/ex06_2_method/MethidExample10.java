//����ڰ� ������ �޼��带 ������ �� �ֵ��� �մϴ�.
///�̰����޼��� ȣ���̶�� �մϴ�.
//�� �޼��带 ȣ���ϸ� �ش� �޼��带 �����մϴ�.
package ex06_2_method;

public class MethidExample10 {
	
  //����������	��ü�������� ���ٰ���		��ȯ�ȴ� ���� �ڷ���		�޼��� �̸� (�Ű����� ���)
	public 		static 			void 				main(String[] args) {
		int num=50;
		char data='*';
		print(num, data);//�� ���� �����ѱ�� ������ �޸��� ����ϸ� �˴ϴ�.	
					
	}
	
	// �޼��� ���� 
	public static void print(int p_num, char p_data) {
		for(int i = 0; i<p_num;i++) {
		System.out.print(p_data);
		}
		
	}
}
