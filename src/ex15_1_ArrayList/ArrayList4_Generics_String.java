package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayList4_Generics_String {
	public static void main(String[] args) {
		//ArrayList ��ü ����
		ArrayList<String> list = new ArrayList<String>();
		
		//list�� 3���� �����͸� �߰�
		list.add("����");
		list.add("������");
		list.add("����");
		
		int num = list.size();// list�� �ִ� �������� ���� ���ϴ� �޼ҵ�
		
		// list�� �ִ� �������� ����ŭ �ݺ��ϸ鼭 �����͸� ������ ���
		for (int cnt = 0; cnt < num; cnt++) {
			// get(index)�޼ҵ带 ����Ͽ� index��ġ�� �մ� �ڷḦ �����ɴϴ�.
			String str = list.get(cnt);
			System.out.println(str);
		}
		
		System.out.println("==== �׻�� for �� ====");
		for (String str : list) {
			System.out.println(str);
		}
	}
}
