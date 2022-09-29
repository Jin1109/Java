//continue 잘못사용된 예
//0 1 2 3 4만 출력
package ex05_test;

public class Ex1 {
	public static void main(String[] args) {
		for(int j = 1; j <= 1; j++){
			System.out.print("*");
		}
		System.out.println("");
		
		for(int j = 1; j <= 2; j++){
			System.out.print("*");
		}
		System.out.println("");
		
		for(int j = 1; j <= 3; j++){
			System.out.print("*");
		}
		System.out.println("");
		
		for(int j = 1; j <= 4; j++){
			System.out.print("*");
		}
		System.out.println("");

		for(int j = 1; j <= 5; j++){
			System.out.print("*");
		}
		System.out.println();
		
		
		int line=5;
		for(int i=1; i <= line; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}




		
	}
}

		
		
		
		
		
		
		
		
		
		
