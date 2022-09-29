//Rectangle ��ü�� ������ȭ�ϴ� ���α׷�
package ex19_07_serialVersionUTD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputExample {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output10.dat"));
			Rectangle obj = (Rectangle) in.readObject();// ��ü�� ������ȭ�ϴ� �κ�
			System.out.println(obj);
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {
			//����ȭ�� �� ����� Ŭ������ ������ȭ�� �� ����� Ŭ������ ������
			//�ٸ��� �߻��ϴ� ���� �޽��� ����ϴ� ��
			System.out.println(ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				in.close();//������ �ݽ��ϴ�.
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
