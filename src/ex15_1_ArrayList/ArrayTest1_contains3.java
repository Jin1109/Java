package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayTest1_contains3 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(10);
		list1.add("��");
		list1.add("����");
		
		ArrayList<String> list2 = new ArrayList<String>(10);
		list2.add("��");
		list2.add("��");
		list2.add("����");
		list2.add("�ܿ�");
		
		if (list1.contains("��")) {
			System.out.println("���� �����մϴ�.");
		} else {
			System.out.println("���� �������� �ʽ��ϴ�.");
		}		

		System.out.println("list1= " + list1);
		System.out.println("list2= " + list2);
		
		System.out.println("===============================");
		
		//list2���� list1�� ����Ǵ� ��ҵ��� ������ ���� ã�� ����
		for(int i = list2.size() - 1; i >= 0; i--) {
			//������ ��ü(list2.get(i))�� list1�� ���ԵǾ� �ִ��� Ȯ��
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		
		System.out.println("list1= " + list1);
		System.out.println("list2= " + list2);
	}
}