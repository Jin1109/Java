//���� Ŭ������ ���� �������� ĳ��Ʈ ������ �̿��Ͽ� ���� Ŭ���� ���� ������ 
//�����ϴ� ���α׷�
package ex09_05_downcasting;
class RefTyoeExample8 {
	public static void main(String[] args) {
		Account obj1 = 
		new CheckingAccount("111-22-33333333", "ȫ�浿", 100000, 
				"5555-6666-7777-8888");
		CheckingAccount obj2 = (CheckingAccount)obj1;// �ٿ�ĳ���� ����ȯ
		try {
			int amount = obj2.pay("5555-6666-7777-8888", 47000);
			System.out.println("���¹�ȣ:" + obj2.accountNo);
			System.out.println("������ �̸�: " + obj2.ownerName);
			System.out.println("�ܾ�: " + obj2.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
