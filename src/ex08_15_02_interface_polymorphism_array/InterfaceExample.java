//���� ����� ������
package ex08_15_02_interface_polymorphism_array;

class InterfaceExample {
	public static void main(String arg[]) {
		//int[] a = new int[3];
		//String[] a = new String[3];
		Lendable arr[] = new Lendable [3];//�������̽� Ÿ���� �迭
		
		
		//�迭�� ���� Ÿ�̕� ��ü �ּ� ����
		arr[0] = new SeparateVolume("8839", "Ǫ���� ����", "����");
		arr[1] = new SeparateVolume("609.2", "����̼���", "���긮ġ");
		arr[2] = new AppCDInfo("02-17", "XML�� ���� �ڹ� ���α׷���", "������");
		
		
		checkOutAll(arr, "����", "2022-06-02");
	}
	
	//�ڹ� �����Ϸ��� ������ �� �� ������ Ÿ�Ը� ���� �޼ҵ峪
	//�ʵ��� ���� ���θ� üũ�ϱ� ������
	//Lendable �������̽��� checkOut�޼ҵ尡 �־�� ������ ������ �����ϴ�.
	 static void checkOutAll(Lendable[] arr, String borrower, String date) {
//	      for(int i = 0; i < arr.length; i++)
//	         arr[i].checkOut(borrower, date); 
		 for(Lendable a : arr) {
			 a.checkOut(borrower, date);
		 }
		 
	}
}
