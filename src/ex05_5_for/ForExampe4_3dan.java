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
public class ForExampe4_3dan {
	public static void main(String[] args) {
		int dan=2;
		System.out.println(dan + "*" + 1 + "=" + (dan*1));
		System.out.println(dan + "*" + 2 + "=" + (dan*2));
		System.out.println(dan + "*" + 3 + "=" + (dan*3));
		System.out.println(dan + "*" + 4 + "=" + (dan*4));
		System.out.println(dan + "*" + 5 + "=" + (dan*5));
		System.out.println(dan + "*" + 6 + "=" + (dan*6));
		System.out.println(dan + "*" + 7 + "=" + (dan*7));
		System.out.println(dan + "*" + 8 + "=" + (dan*8));
		System.out.println(dan + "*" + 9 + "=" + (dan*9));
		
		for( int i=1; i<=9; i=i +1) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
		
	}
}
