package ex06_3_method_intro3_return;

public class MethodExample2 {
	  //����������	��ü�������� ���ٰ���		��ȯ�ȴ� ���� �ڷ���		�޼��� �̸� (�Ű����� ���)
		public 		static 			void 				main(String[] args) {
			hap(1,10);	//�ƹ��͵� ��µ��� �ʽ��ϴ�.
		
			//1. return sum�� ���������ؼ� ����ϴ� ���
			//��ȯ���� void�� ���� ���� �����Ҽ� ����
			int result = hap(1,100);
			System.out.println("1: result = " + result);
		
		}
		
		//�޼��� ����
		public static int hap(int start, int end)	{
			int sum=0;
			for(int i=start;i<=end;i++) {
				sum += i;
			}
			return sum;
		}
		
		
		
		
		
}
