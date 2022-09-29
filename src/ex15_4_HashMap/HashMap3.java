/*HashMap Generic ��� ��
 * Map �������̽� - HashMap, Hashtable (��ӹ޴� Ŭ����)
		1. �������� �ڷ����� Data�� ��� ����
		  ex) int, double, char, boolean, String etc
		2. Data�� ������ �� Key, Value �� ���ÿ� ����

 *HashMap�� HashSet � ���Ǵ� hashing�� ���� ����
   - �ؽ��̶� �ؽ��Լ��� �̿��ؼ� �����͸� �ؽ� ���̺� �����ϰ� �˻��ϴ� ����� ���մϴ�.
   - �ؽ� ���̺��̶� ���� ���� �� (bucket)�� ����� �ΰ� Ű ���� �̿��Ͽ�
     �����͸� ���� �� ��ȣ�� ����ϴ� ������ �����Դϴ�.

   - �ؽ� �Լ��� Ű ���� �޾� �ؽ� ���̺��� �ε��� Ű ���� ���ϴ� �Լ��Դϴ�.
   - �ؽ��Լ��� �����Ͱ� ����Ǿ� �ִ� ���� �˷� �ֱ� ������ �ٷ��� ������ �߿�����
		���ϴ� �����͸� ������ ã�� �� �ֽ��ϴ�.

   - �ػ��� ������ �÷��� Ŭ�����δ� HashSet, HashMap, Hashtable ���� �ֽ��ϴ�.
   - Object Ŭ������ ���ǵ� hashCode () �� �ؽ��Լ��� ����մϴ�.	
*/		
package ex15_4_HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap3 {
	public static void main(String[] args) {
		//HashMap ��ü ���� ��� �� ����
		//Map hm = new HashMap();		// ���1. ��ĳ����
		HashMap<String, String> hm = new HashMap<String, String>();//���2. ���� Ŭ������ ���� ��ü ����
		
		//Key�� Value ���� ����
		//Map�� put()�� �̿��� (key, Value) ������ �ڷ� �����մϴ�.
		hm.put( "woman", "����ִ�" );
		hm.put( "man", "�����Ϸ�" );
		hm.put( "age", new String("10") );
		hm.put( "city", "Seoul" );
		hm.put( "city", "Busan" );
		
		//HashMap�� �մ� ��ü���� ���
		//��� ��� 1. �ش� ��ü������ ���
		System.out.println( hm );
		//{woman=����ִ�, city=Busan, man=�����Ϸ�, age=10}
		
		//��� ��� 2. Key  ���� ���
		System.out.println( hm.keySet() );//{woman, city, age}
		
		//��� ��� 3.Value ���� �߷�
		System.out.println( hm.values());
		
		//��� ��� 4.
		//get (key) : key�� �ش��ϴ� Value�� ��� - ���� ���� ���
		System.out.println( hm.get( "woman" ));//����ִ�
		System.out.println( hm.get("city" ));//Busan
		
		//��¹�� 5
		System.out.println("===========================");
		Set<String> keys = hm.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + hm.get(key));
		}
	
	}
}
