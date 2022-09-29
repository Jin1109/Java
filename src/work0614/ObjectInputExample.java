package work0614;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputExample {
	public static void main(String[] args) {
		ObjectInputStream input = null;
		try {
			input = new ObjectInputStream(new BufferedInputStream(new FileInputStream("jumsu.txt")));
			while(true) {
			Student2 obj = (Student2) input.readObject();// ��ü�� ������ȭ�ϴ� �κ�
			System.out.println(obj);}
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch(EOFException eofe) {//���Ϸκ��� �� �̻� ���� ��ü�� ���� �� �߻��ϴ� �ͼ��� ó���մϴ�.
			System.out.println("��"); 
		} catch (IOException ioe) {
			//����ȭ�� �� ����� Ŭ������ ������ȭ�� �� ����� Ŭ������ ������
			//�ٸ��� �߻��ϴ� ���� �޽��� ����ϴ� ��
			System.out.println(ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				input.close();//������ �ݽ��ϴ�.
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
