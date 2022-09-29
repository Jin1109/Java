
package ex05_test;

public class Ex2 {
	public static void main(String[] args) {
				
		int line=5;
		for(int i=1; i <=line; i++){			//1			2		3		4		5
			for(int j = 1; j <= line+1-i; j++){	//1~5		1~4		1~3		1~2		1~1
				System.out.print("*");			// i + j =	 6 = line + 1
			}									// j = line + 1 - i
			System.out.println("");
		}
		
		for(int i = 5; i >= 1; i--) {
	         for(int j = 1; j <= i; j++) {
	         //for(int j = 0; j < i; j++) {	 
	         System.out.print("*");
	         }   
	         System.out.println("");
	      }
		
	}
}


		
		
		
		
		
		
		
		
		
		

