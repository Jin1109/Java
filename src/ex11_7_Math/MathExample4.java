//1~45���� �ߺ� ���� �� 6�� �߻��ϴ� ���α׷�

package ex11_7_Math;

public class MathExample4 {
	public static void main(String[] args) {
		int num[] = new int[6];//�ߺ��� ������ Ȯ���ϰ��� �迭 �����
		
		for (int i = 0; i < num.length; i++) {	//i=0		 i=1			i=1
			num[i]=(int)(Math.random()*45 + 1);	//num[0]=30  num[1]=30		num[1]=40
			
			for(int j = 0;j<i;j++) {			//			j=0;j<1	
				if(num[i] == num[j]) {			//			num[i] == num[0]
					i--;						//			i=0
					break;
				}
			}//j for end
			
		}//i for end
	}
}
