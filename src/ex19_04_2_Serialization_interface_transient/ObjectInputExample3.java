//��ü�� ����ȭ�ϴ� ���α׷�
//����ȭ : ��ü�� ��Ʈ��ũ�� ���� �����ϰų� ���Ͽ� �����ϱ� ���ؼ� ��ü�� ��Ʈ������ ����� �۾��� �ʿ��մϴ�.
//�̷� �۾��� �ڹٿ����� ��ü�� ����ȭ(serialization)��� �մϴ�.
package ex19_04_2_Serialization_interface_transient;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputExample3 {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output3.dat"));
			while (true) {
				BBSItem obj = (BBSItem) in.readObject();// ��ü�� ������ȭ�ϴ� �κ�
				System.out.println(obj);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (EOFException eofe) {//���Ϸκ��� �� �̻� ���� ��ü�� ���� �� �߻��ϴ� �ͼ��� ó���մϴ�.
			System.out.println("��");
		} catch (IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				in.close();//������ �ݽ��ϴ�.
			} catch (Exception e) {
				System.out.println("������ �ݴ� �� ���� �߻��߽��ϴ�.");
			}
		}
	}
}
