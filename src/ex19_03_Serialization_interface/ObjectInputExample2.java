//��ü�� ����ȭ�ϴ� ���α׷�
//����ȭ : ��ü�� ��Ʈ��ũ�� ���� �����ϰų� ���Ͽ� �����ϱ� ���ؼ� ��ü�� ��Ʈ������ ����� �۾��� �ʿ��մϴ�.
//�̷� �۾��� �ڹٿ����� ��ü�� ����ȭ(serialization)��� �մϴ�.
package ex19_03_Serialization_interface;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputExample2 {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output2.dat"));
			while (true) {
				GoodsStock obj = (GoodsStock) in.readObject();
				System.out.println(obj.toString());
			}
		} 
		catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} 
		catch (EOFException eofe) {//���Ϸκ��� �� �̻� ���� ��ü�� ���� �� �߻��ϴ� �ͼ��� ó���մϴ�.
			System.out.println("��");
		} 
		catch (IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		} 
		catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				in.close();//������ �ݽ��ϴ�.
			}
			catch (Exception e) {
				System.out.println("������ �ݴ� �� ���� �߻��߽��ϴ�.");
			}
		}
	}
}
