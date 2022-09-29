/*
 	* Set �������̽�
	   - HashSet (��ӹ޴� Ŭ����) : ���������� HashMap�� �̿��ؼ� �����������
		 HashSet�̶� �̸��� �ػ��� �̿��ؼ� �����߱� ������ �ٿ��� ���Դϴ�.
	   - TreeSet�� ���� �˻� Ʈ�� (binary search tree)��� �ڷᱸ���� ���·�
				�����͸� �����ϴ� �÷��� Ŭ�����Դϴ�. ������ �˴ϴ�.
	1. �������� �ڷ��� (�⺻�ڷ���, â���� ���)�� Data�� ��� ������ �� �ֽ��ϴ�.
	   ex) int, double, char, boolean, String etc
	2. ���� ���� ��, ��� �մϴ�.
	3. �ߺ��� Data�� �������� ���մϴ�.
			��) �ζ� ��ȣ 6���� �ߺ� ���� �ʰ� �ϴ� ���α׷��� �̿�
			
*/				
package ex15_5_HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet2_Generics_add_print {
	public static void main(String[] args) {
		//HashSet ��ü ����
		HashSet<String> set = new HashSet<String>();
		//������ ����
		set.add("�ڹ�");
		set.add("īǪġ��");
		set.add("����������");
		set.add("�ڹ�");
		System.out.println("����� �������� �� = " + set.size());
		
		// set ��ü�� �����ϰ� �ִ� ������ ��ü ���
		System.out.println(set);
		
		//iterator() : set�� �ִ� �����͸� ��� �����ɴϴ�.
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
	}
}
