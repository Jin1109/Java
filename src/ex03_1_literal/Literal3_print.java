/* ���ڿ� �ȿ��� Ư�� ���ڸ� ǥ���ϴ� ���� ���ͳ� - �����(escape character)
 * [1] tab			- \t
 * [2] new line		- \n
 * [3] ��������		- \\
 * [4] ū����ǥ		- \"		
 */
			
package ex03_1_literal;

public class Literal3_print {
	public static void main(String args[]) { 
		System.out.println("ȣȣ����");
		System.out.println("\"ȣȣ����\"");
		System.out.println("ȣȣ\n����\n");
		System.out.println("ȣȣ����%n");
		System.out.println("ȣȣ\t����"); 
		System.out.print("ȣȣ\\����");
		
	}	
}