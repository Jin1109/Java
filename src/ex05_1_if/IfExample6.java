/*
 * ������ ���� num�� �����ϰ� �������� �Է¹޾� �����մϴ�.
 * 1. �Է¹��� ���� 10�̸��̸�				"num�� ���� 10 �̸��Դϴ�."
 * 2. �Է¹��� ���� 10�̻�, 100 �̸��̸�		"num�� ���� 10 �̻�, 100 �̸��Դϴ�."
 * 3. �Է¹��� ���� 100�̻��̸�, 1000 �̸��̸�	"num�� ���� 100�̻�, 1000 �̸��Դϴ�."
 * 4. �Է¹��� ���� 1000�̻��̸�				"num�� ���� 1000 �̻��Դϴ�."
 * 
 * 
 * if() {
 * 
 * }else if() {
 * 
 * }else if() {
 * 
 *  )else{
 *  
 *  }
 */
package ex05_1_if;

//import java.io.InputStream;
import java.util.Scanner;

public class IfExample6 {
	public static void main(String[] args) {
		
//		InputStream in = System.in;
//		Scanner sc = new Scanner(in); 
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int num = sc.nextInt();
		
		if (num < 10) {
			System.out.println("num�� ���� 10 �̸��Դϴ�.");
		}else if (num >= 10 && num <100) {
			System.out.println("num�� ���� 10 �̻�, 100 �̸��Դϴ�.");
		}else if (num >= 100 && num <1000) {
			System.out.println("num�� ���� 100 �̻�, 1000 �̸��Դϴ�.");
		}else {
			System.out.println("num�� ���� 1000 �̻��Դϴ�.");
		}
		
			sc.close();
			
	}
}
