//����ڰ� ������ �޼��带 ������ �� �ֵ��� �մϴ�.
///�̰����޼��� ȣ���̶�� �մϴ�.
//�� �޼��带 ȣ���ϸ� �ش� �޼��带 �����մϴ�.
package ex06_2_method;

public class MethidExample11_1 {
	
  //����������	��ü�������� ���ٰ���		��ȯ�ȴ� ���� �ڷ���		�޼��� �̸� (�Ű����� ���)
	public 		static 			void 				main(String[] args) {
		int num=50;
		char data='*';
		print(num, data);//�� ���� �����ѱ�� ������ �޸��� ����ϸ� �˴ϴ�.	
		return; //���⼭ main()�޼��带 �����մϴ�.	//jvm���� ȣ��
					
	}
	
	// �޼��� ���� 
	public static void print(int p_num, char p_data) {
		for(int i = 0; i<p_num;i++) {
			System.out.print(p_data);
		}
		return;//��ȯ�Ǵ� ���� �ڷ����� void�� ��� �̹����� ���� �����մϴ�.
		
	}
}
