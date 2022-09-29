package ex05_5_for;
/*
 * [2단]
 * 2*1=2
 * 2*2=2
 * 2*3=6
 * 2*4=8
 * 2*5=10
 * 2*6=12
 * 2*7=14
 * 2*8=16
 * 2*9=18
 */
public class ForExampe4_3dan2 {
	public static void main(String[] args) {
		int dan=2, i;
		System.out.println("["+dan+"단]");
		for( i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
		
		dan=3;
		System.out.println("["+dan+"단]");
		for( i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
		
		dan=4;
		System.out.println("["+dan+"단]");
		for( i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
		
	}
}
