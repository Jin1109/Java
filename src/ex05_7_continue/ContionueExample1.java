package ex05_7_continue;

public class ContionueExample1 {
	public static void main(String[] args) {
		//0부터 9까지 1씩 증가되는 출력문 작성하세요
		//단, 5는 출력하지 않습니다.
		for (int cnt = 0; cnt < 10; cnt++) {
			if (cnt !=5)
				System.out.println(cnt);
		}
		System.out.println("=====================");
	
		for (int cnt = 0; cnt < 10; cnt++) {
			if (cnt==5)
				continue;		// 현재 for문을 실행 안하고 다음 단계로 이동한다
			System.out.println(cnt);
		}
		System.out.println("끝.");
		
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
