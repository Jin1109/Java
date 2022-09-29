package ex05_5_for;
/*
 * [2´Ü]
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
public class ForExampe4_5dan_for_for {
	public static void main(String[] args) {
		int dan, i;
		for( dan=2; dan<=9; dan++) {
		System.out.println("["+dan+"´Ü]");
		for( i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
		}
		
	}
}
