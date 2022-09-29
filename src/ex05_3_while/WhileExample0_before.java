package ex05_3_while;

public class WhileExample0_before {
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println("================================");
		
		int cnt=0;						// 0
		//while(cnt <= 9) {
		while(cnt < 10) {				// 0<10		1<10	2<10 ... 9<10		10<10  
			//반복문
			System.out.println(cnt);	//0 		1		2 .... 9			23번라인으로 간다
			cnt++;						//0 		1		3 .... 10
		}
		
	}

}
