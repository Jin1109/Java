//����ڰ� ������ �޼��带 ������ �� �ֵ��� �մϴ�.
///�̰����޼��� ȣ���̶�� �մϴ�.
//�� �޼��带 ȣ���ϸ� �ش� �޼��带 �����մϴ�.
package ex06_2_method;

public class MethidExample12 {
	
  //����������	��ü�������� ���ٰ���		��ȯ�ȴ� ���� �ڷ���		�޼��� �̸� (�Ű����� ���)
	public 		static 			void 				main(String[] args) {
		int[] num= {1,2,3,4,5};
		print(num);	
		return; //���⼭ main()�޼��带 �����մϴ�.	//jvm���� ȣ��
					
	}
	
	// �޼��� ���� 
	public static void print(int[] p_num) { 
		 for(int i = 0; i < p_num.length; i++) {
	         System.out.print(p_num[i]+ " ");
		 }
		return;//��ȯ�Ǵ� ���� �ڷ����� void�� ��� �̹����� ���� �����մϴ�.
		
	}
}
