//obj������ Ÿ���� Account�̱� ������
//Account�� ���� pay�޼ҵ峪 cardNo�ʵ�� �����Ͽ��� �߻�
package ex09_03_upcasting;
class RefTyoeExample6 {
	public static void main(String[] args) {
		Account obj = new CheckingAccount("111-22-33333333", "ȫ�浿", 10,
				"4444-5555-6666-7777");
		try {
			obj.
			int amount = obj.pay("4444-5555-6666-7777", 47000);
			System.out.println("�����: " + amount);
			System.out.println("ī���ȣ: " + obj.cardNO);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}