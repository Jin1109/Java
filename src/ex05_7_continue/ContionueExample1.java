package ex05_7_continue;

public class ContionueExample1 {
	public static void main(String[] args) {
		//0���� 9���� 1�� �����Ǵ� ��¹� �ۼ��ϼ���
		//��, 5�� ������� �ʽ��ϴ�.
		for (int cnt = 0; cnt < 10; cnt++) {
			if (cnt !=5)
				System.out.println(cnt);
		}
		System.out.println("=====================");
	
		for (int cnt = 0; cnt < 10; cnt++) {
			if (cnt==5)
				continue;		// ���� for���� ���� ���ϰ� ���� �ܰ�� �̵��Ѵ�
			System.out.println(cnt);
		}
		System.out.println("��.");
		
		for (int a = 0; a <= 9; a++) {
			System.out.println(a);
			if (a == 4) {
				a = a + 1;
			}
		}
		
		
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
//		int i;
//		for(i = 0; i <= 10; i++) {
//			if(i == 5)
//				continue;
//			System.out.println(i);
