package work0607;

public class Lotto {
	public static void main(String[] args) {

		int lotto[] = new int[6];	
		
		System.out.print("로또 번호 출력 : ");
		for(int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random() * 45) + 1;	
			lotto[i] = num;
			for(int j = 0; j < i; j++) {	// 중복된 제거
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			System.out.print("\t" + lotto[i]);	// 로또번호를 출력한다.
		}

	}
}
