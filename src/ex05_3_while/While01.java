
package ex05_3_while;

public class While01 {
	public static void main(String[] args) {
		
		// 1~10���� 1�� ����
		System.out.println("==1�� ����==");
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i = i + 1; // i++
		}
		

		// 1~10���� 2�� ����(Ȧ�� ���)
		System.out.println("==Ȧ�����==");
		i = 1;
		while (i <= 10) {
			System.out.println(i);
			i = i + 2; // i+= 2;
		}
						
		// 1~10���� 2�� ����(¦�� ���)
		System.out.println("==¦�����==");
		i = 2;
		while (i <= 10) {
			System.out.println(i);
			i = i + 2; // i+= 2;
		}
		// 1~10���� �� ���ϱ�
		System.out.println("==1~10���� ��==");
		int sum =0;
		i = 1;
		while (i <= 10) {
			sum = sum + i;
			i = i + 1;
			
			/*
			 * sum+=i; i++;
			 */
		}
		System.out.println("1~10������ ��1 = " + sum);
		
		// 1~10������ �� ���ϱ�		
		System.out.println("==1~10������ ��==");
		sum = 0;
		i = 0;
		while (++i <= 10) {
			sum = sum + i;
		}
		System.out.println("1~10������ ��2 = " + sum);
		
		// 1~10������ Ȧ�� �� ���ϱ�		
		System.out.println("Ȧ�� �� ���ϱ�");
		sum = 0;
		i = 1;
		while (i <= 10) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println("1~10������ Ȧ�� �� = " + sum);
				
		// 1~10������ ¦�� �� ���ϱ�		
		System.out.println("¦�� �� ���ϱ�");
		sum = 0;
		i = 2;
		while (i <= 10) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println("1~10������ ¦�� �� = " + sum);		
		
	
		
	}
}