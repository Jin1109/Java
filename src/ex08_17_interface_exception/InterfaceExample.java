package ex08_17_interface_exception;
class InterfaceExample {
	public static void main(String arg[]) throws Exception {
		SeparateVolume obj =
			new SeparateVolume("8631", "����", "��������");
		
		//���Ⱑ���� Ȯ���ϰ� ������°� �����ϸ� "���氡��"�� ����ϰ�
		//�������̸� �����߰� ������, �������� ����մϴ�.
		printSate(obj);
		
		obj.checkOut("����", "2022-06-02");
		
		printSate(obj);
	}
	
	static void printSate(SeparateVolume obj) {
		//�������̽� Lendable�� �������� ���� Ŭ���������� ����
		//�������̽�.���
		
		if(obj.state == Lendable.STATE_NORMAL) {
			System.out.println("------------------");
			System.out.println("������: ���Ⱑ��");
			System.out.println("------------------");
		}else if(obj.state == Lendable.STATE_BORROWED) {
			System.out.println("------------------");
			System.out.println("������� : ������");
	         System.out.println("������ : " + obj.borrower);
	         System.out.println("������ : " + obj.checkOutDate);
			System.out.println("------------------");
		}
	} 
}
