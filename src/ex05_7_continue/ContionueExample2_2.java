//continue �߸����� ��
//0 1 2 3 4�� ���
package ex05_7_continue;

public class ContionueExample2_2 {
	public static void main(String[] args) {
		int cnt =0;					//cnt=0			1	...		5
		while (cnt <10) {			//cnt<10		1<10		5<10		5<10
			if (cnt ==5)			// x			 x			 o			 o
				continue;			// ��� 5���� ���ѷ����� ������
			System.out.println(cnt);//0				1 	..		4
			cnt++;					//1				2			5
		}
		System.out.println("��.");
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
//		int i;
//		for(i = 0; i <= 10; i++) {
//			if(i == 5)
//				continue;
//			System.out.println(i);
