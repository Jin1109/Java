package ex04_07_concate_op;

public class Concate2_hap {
	public static void main(String[] args) {
		String str1 = "hap=" + 3 + 4;
		System.out.println(str1);//hap=34 -> hap�� ���ڿ��̹Ƿ� �ڿ��� ���ڿ��� ��ȯ 
		
		String str2 = 3 + 4 + "=hap";
		System.out.println(str2);//7=hap
		
		String str3 = "hap=" + (3 + 4);
		System.out.println(str3);//hap=7 -> 3 + 4�� �Ұ�ȣ�ȿ� �����Ƿ� 7�� ���� ���ȴ�
		
		str1 = "" + 3 + 4;
		System.out.println(str1);//34 -> ""�� ���ڿ��̹Ƿ� 3 4���ڿ��� ��ȯ
		
		str1 = 3 + 4 + "";
		System.out.println(str1);//7
		
		str1 = 3 + 4 + "" + "�Դϴ�.";//7�Դϴ�.
		System.out.println(str1);
		
		str1 = 3 + 4 + "�Դϴ�.";
		System.out.println(str1);//7�Դϴ�.
		
	}
}
