package work0607;

public class Lotto {
	public static void main(String[] args) {

		int lotto[] = new int[6];	
		
		System.out.print("�ζ� ��ȣ ��� : ");
		for(int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random() * 45) + 1;	
			lotto[i] = num;
			for(int j = 0; j < i; j++) {	// �ߺ��� ����
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			System.out.print("\t" + lotto[i]);	// �ζǹ�ȣ�� ����Ѵ�.
		}

	}
}
