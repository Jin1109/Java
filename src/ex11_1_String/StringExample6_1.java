//���ڿ� ���� �޼ҵ�
// 1. substring(int beginIndex) : beginIndex���� ���ڿ� ������ �κ� ���ڿ� ����
// 2. substring(int beginIndex, int endIndex) : beginIndex���� endIndex-1���� �κ� ���ڿ� ���� 
/*
��°��)
������ ���ڴ� 4�̰� �����Դϴ�.
*/

package ex11_1_String;

class StringExample6_1 {
	public static void main(String[] args) {
		String jumin = "123456-123456";
		
		String s = jumin.substring(7, 8);// substring(n1,n2); n1���� n2-1���� ���� 
		System.out.print("������ ���ڴ� " + s + "�̰� ");
		
		if (s.equals("1") || s.equals("3")) {
			System.out.println("���� �Դϴ�.");
		} else if (s.equals("2") || s.equals("4")) {
			System.out.println("���� �Դϴ�.");
		} else
			System.out.println("�ܱ��� �Դϴ�.");	
	}
	
}