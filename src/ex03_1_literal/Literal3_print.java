/* 문자열 안에서 특수 문자를 표현하는 문자 리터널 - 제어문자(escape character)
 * [1] tab			- \t
 * [2] new line		- \n
 * [3] 역슬래쉬		- \\
 * [4] 큰따옴표		- \"		
 */
			
package ex03_1_literal;

public class Literal3_print {
	public static void main(String args[]) { 
		System.out.println("호호하하");
		System.out.println("\"호호하하\"");
		System.out.println("호호\n하하\n");
		System.out.println("호호하하%n");
		System.out.println("호호\t하하"); 
		System.out.print("호호\\하하");
		
	}	
}