//���ڿ� ���� �޼ҵ�
// 1. substring(int beginIndex) : beginIndex���� ���ڿ� ������ �κ� ���ڿ� ����
// 2. substring(int beginIndex, int endIndex) : beginIndex���� endIndex-1���� �κ� ���ڿ� ���� 
/*
��°��)
������ ���ڴ� 4�̰� �����Դϴ�.
*/

package ex11_1_String;

class StringExample6_2 {
	public static void main(String[] args) {
		String jumin = "123456-123456";
		
		String s = jumin.substring(7, 8);// substring(n1,n2); n1���� n2-1���� ���� 
		System.out.print("������ ���ڴ� " + s + "�̰� ");
		
		switch (s) {
		case "1":
		case "3":
		System.out.println("�����Դϴ�.");
		break;
		
		case "2":
		case "4":
		System.out.println("�����Դϴ�.");
		break;
		
		default:
		System.out.println("�ܱ����Դϴ�.");
		}
	}
	
}
