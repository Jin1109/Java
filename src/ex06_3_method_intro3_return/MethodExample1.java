package ex06_3_method_intro3_return;

public class MethodExample1 {
	  //����������	��ü�������� ���ٰ���		��ȯ�ȴ� ���� �ڷ���		�޼��� �̸� (�Ű����� ���)
		public 		static 			void 				main(String[] args) {
			hap(1,10);	//�ƹ��͵� ��µ��� �ʽ��ϴ�.	1,10�� ���� Ȥ�� �ŰԺ���
		}
		
						//��ȯ��
		public static 	int 	hap(int start, int end)	{ //�޼��� ����
			int sum=0;
			for(int i=start;i<=end;i++) {
				sum += i;
			}
			return sum;//sum�� �ڷ����� �޼����� ��ȯ��(int)�� ��ġ�ؾ� �մϴ�.
		}
		
		
		
		
		
}
