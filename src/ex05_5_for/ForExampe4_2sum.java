package ex05_5_for;

public class ForExampe4_2sum {
	public static void main(String[] args) {
		int i;
		int sum;
		// 1~10���� 1�� ����
		System.out.println("==1������===");
		for (i= 1; i <= 10; i++ ) {
			System.out.println(i);
		}
		
		// 1~10���� 2�� ����(Ȧ�����)
		System.out.println("==Ȧ�����===");
		for (i= 1; i <= 10; i = i + 2 ) {
			System.out.println(i);
		}
		
		// 1~10���� 2�� ����(¦�����)
		System.out.println("==¦�����===");
		for (i= 2; i <= 10; i = i + 2 ) {
			System.out.println(i);
		}		
		
		// 1~10���� �ձ��ϱ�
		sum = 0;
		System.out.println("==1~10������ ��==");
		for (i= 1; i <= 10; i = i + 1 ) {
			sum = sum + i;
		}		
		System.out.println("1~10������ �� = " + sum);

		// 1~10������ Ȧ�� �� ���ϱ�
		sum = 0;
		System.out.println("==1~10������ ��==");
		for (int j= 1; j <= 10; j = j + 2 ) {
			sum += j;
		}		
		System.out.println("1~10������ Ȧ���� �� = " + sum);

		// 1~10������ ¦�� �� ���ϱ�
		sum = 0;
		System.out.println("==1~10������ ¦���� ��==");
		for (i= 2; i <= 10; i = i + 2 ) {
			sum += i;
		}		
		System.out.println("1~10������ ¦���� �� = " + sum);
		
	}
}
