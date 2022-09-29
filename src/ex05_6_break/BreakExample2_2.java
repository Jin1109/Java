package ex05_6_break;
//(0,0)
//(0,1)
//(0,2)
//(0,3)
//(0,4)
//(1,0)
//(1,1)
//(1,2) // (1,3) (1,4)가 없다
//(2,0)
//(2,1)
//(2,2)
//(2,3)
//(2,4)
//끝.

public class BreakExample2_2 {
	public static void main(String[] args) {
		for(int row = 0; row < 3; row++) {
			for(int col=0; col<5; col++) {
				System.out.println("(" + row + "," + col + ")");
				if ((row == 1) && (col == 2))
					break; // break를 내포하는 반복문 밖으로 제어가 이동합니다.
			}
		}
		System.out.println("끝.");
		
	}
}
