package ex05_5_for;

public class ForExampe1_1 {
	public static void main(String[] args) {
		//for문 안에 선언된 변수는 for문 안에서만 적용된다 (유효범위)
		int cnt;
		for (cnt = 1; cnt <= 10; cnt++ ) {
			System.out.println(cnt);
		}
		
		//int cnt=0;
		System.out.println(cnt);
		
		System.out.println("끝.===================");
		
		for(cnt=10;cnt>=0;cnt--) {
			System.out.println(cnt);
		}
	}
}
