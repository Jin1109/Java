/*
 * TreeMap
 *  Ű�� ���� ������ �̷���� �����͸� Ű�� �����ؼ� �����մϴ�.
 *  �˻��� ���Ŀ� ������ �ɷ��� Ŭ�����Դϴ�.
 */
package ex15_4_HashMap_TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class HashMap3 {
	public static void main(String[] args) {
		// ���1. ��ĳ����
		//Map<String, String> tm = new TreeMap<String, String>();
		
		// ���2. ���� Ŭ������ ���� ��ü ����
		TreeMap<String, String> tm = new TreeMap<String, String>();//���2. ���� Ŭ������ ���� ��ü ����
		
		//Key�� Value ���� ����
		//Map�� put()�� �̿��� (key, Value) ������ �ڷ� �����մϴ�.
		tm.put( "woman", "����ִ�" );
		tm.put( "man", "�����Ϸ�" );
		tm.put( "age", new String("10") );
		tm.put( "city", "Seoul" );
		tm.put( "city", "Busan" );
		//{woman=����ִ�, city=Busan, man=�����Ϸ�, age=10}
		//{age=10, city=seoul, man=�����Ϸ�, woman=����ִ�} 
		
//		//HashMap�� �մ� ��ü���� ���
//		//��� ��� 1. �ش� ��ü������ ���
//		System.out.println( tm );
//		//{woman=����ִ�, city=Busan, man=�����Ϸ�, age=10}
		
		//��� ��� 2. Key  ���� ���
		System.out.println( tm.keySet() );//{woman, city, age}
		
		//��� ��� 3.Value ���� �߷�
		System.out.println( tm.values());
		
		//��� ��� 4.
		//get (key) : key�� �ش��ϴ� Value�� ��� - ���� ���� ���
		System.out.println( tm.get( "woman" ));//����ִ�
		System.out.println( tm.get("city" ));//Busan
		
		//��¹�� 5
		System.out.println("===========================");
		Set<String> keys = tm.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + tm.get(key));
		}
	
	}
}
