
package ex05_3_while;

public class While01my {
	public static void main(String[] args) {
		
// 1.1~10���� Ȧ�� ����ϱ�	
		System.out.println("==1.1~10���� Ȧ�� ����ϱ�==");
		int i1 = 1;
		while (i1 <= 10) {
			System.out.println(i1);
			i1 = i1 + 2;
		}
		
		System.out.println(" ==== 1 ====");

// 1.1~10���� ¦�� ����ϱ�	
		System.out.println("==1.1~10���� ¦�� ����ϱ�==");
		int i2 = 2 ;
		while (i2 <= 10) {
			System.out.println(i2);
			i2 = i2 + 2;
		}
		
		
		System.out.println(" ==== 2 ====");		
		
// 3.1~10������ �� ���ϱ�	
		System.out.println("==1~10������ ��==");
		int sum3 = 0;
		int i3 = 1;
		while (i3 <= 10) {
			sum3 += i3; // sum = sum + i
			i3 = i3 + 1;
		}
		System.out.println("1~10������ �� = " + sum3);
		
		System.out.println(" ==== 3 ====");
		
// 4.1~10������ Ȧ���� ���ϱ�	
		int sum4 = 0;
		int i4 = 1;
		
		while (i4 <= 10) {
			sum4 += i4; // sum = sum + i
			i4 = i4 + 2;
		}
		System.out.println("1~10������ Ȧ���� �� = " + sum4);
		
		System.out.println(" ==== 4 ====");
		
//5. 1~10������ ¦���� ���ϱ�			
		int sum5 = 0;
		int i5 = 2;
		
		
		while (i3 <= 10) {
			sum5 += i5;
			i5 = i5 + 2;
		}
		System.out.println("1~10������ ¦���� �� = " + sum5);
		
		System.out.println(" ==== 5 ====");
		
		
		
	}
		
}
