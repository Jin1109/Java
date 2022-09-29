//LinkedList ��� ��
/* LinkedList�� ArrayList�� ������
   - �������� �߰� �Ǵ� ������ ArrayList���� �ӵ��� �����ϴ�.
   	 ArrayList�� ��� ���ʴ�� �����͸� �߰��ϰ� �������������� �����͸� �����ϴ� ���� LinkedList���� �����ϴ�.
   	 ������ �߰��� �����͸� �߰��Ϸ��� ���ڸ��� ����� ���� �ٸ� �����͸� �����ؼ� �̵��ؾ� �ϰ�
   	 ������ ��쿡�� �����͸� ���ġ�ؾ� ������
   	 LinkedList�� ��쿡�� �� ��Ұ� ���Ḹ �������ָ� �Ǳ� ������ ó���ӵ��� ����� �����ϴ�.
 * - �˻��� ArrayList�� ���������� �޸𸮻� ���K�� ������ ã�µ� ��������
   	 �ҿ��������� ��ġ�� LinkedList�� ó������ ���ʴ�� ���󰡾� ���ϴ� ���� ���� �� �־� �˻��ð��� �����ϴ�.
 */
package ex15_1_Linked;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2_set_remove {
	public static void main(String[] args) {
		//LinkedList ��ü�� ����
		LinkedList<String> list = new LinkedList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		list.add(2, "Ű��");
		pLinkedList(list);
				
		// �ε��� 0 ��ġ�� �����͸� "������" �ٲߴϴ�.
		list.set(0, "������");
		pLinkedList(list);
				
		// �ε��� 1 ��ġ�� �����͸� �����մϴ�.
		list.remove(1);
		pLinkedList(list);
				
		// list���� "Ű��"��� �����͸� ã�Ƽ� �����մϴ�.
		list.remove("Ű��");
		pLinkedList(list);
				
	}
		
	static void pLinkedList (LinkedList<String> list) {
		System.out.println("=====================");
		// iterator()�޼ҵ带 ȣ���Ͽ� Iteraotr ��ü�� ����ϴ�.
		Iterator<String> iterator = list.iterator();
		
		// Iterator ��ü�� �̿��Ͽ� list�� �ִ� �����͸� ������� �����ͼ� ���
		while (iterator.hasNext()) {//���� ��ġ���� ���� �����Ͱ� �ִ��� Ȯ���ϴ� �޼ҵ�
			String str = iterator.next();// ���� �����͸� �������� �޼ҵ�
			System.out.println(str);
		}
	}
		
		
	
}
