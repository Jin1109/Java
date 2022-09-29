package ex05_3_while;
/*
 *   1	 2	 3	 4	 5	 6	 7
 *   8	 9	10	11	12	13	14
 *  15	16	17	18	19	20	21
 *  22	23	24	25	26	27	28
 *  29	30	31	
 */
public class While01_2 {
	public static void main(String[] args) {
		
		// 1~31까지 1씩 증가하고 한 줄에 7까지 출력하기
		int i = 0;
		while (++i <= 31) { //i를 1증가한 후 1<=31을 비교합니다.
			System.out.printf("%5d",i);
			if(i%7 == 0)
				System.out.println();
		}
		
//		int cnt = 0 ; 
//		while (cnt++ <31) {
//			if(cnt%7 == 1 ) {
//				System.out.println();
//			}
//			System.out.print(cnt+ " ");
//		}
		
		
	}

}
