//��ü�� ����ȭ�ϴ� ���α׷�
//����ȭ : ��ü�� ��Ʈ��ũ�� ���� �����ϰų� ���Ͽ� �����ϱ� ���ؼ� ��ü�� ��Ʈ������ ����� �۾��� �ʿ��մϴ�.
//�̷� �۾��� �ڹٿ����� ��ü�� ����ȭ(serialization)��� �մϴ�.
package ex19_01_Serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectInputExample1 {
	public static void main(String[] args) {
		//������ ���ϴ�.
		//ObjectOutputStream Ŭ������ ��ü�� ��Ʈ������ ���� ����ϴ� �����
		//�ִ� Ŭ�����Դϴ�.
		//�� Ŭ�������� �����͸� ���Ͽ� �����ϴ� ����� ���� ������
		//FileOutputStream Ŭ������ �Բ� ����ؾ� �մϴ�.
		//FileOutputStream ��ü�� �����ؼ�
		//ObjectOutputStreamŬ������ ������ �Ķ���ͷ� �Ѱ��־�� �մϴ�.
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output.dat"));
			while (true) {
		//��ü�� ������ȭ �ϴ� �κ�
		//readObject �޼ҵ� :  �Էµ� ��Ʈ�����κ��� ��ü�� ���� �����ϴ� �޼ҵ�� ����Ÿ���� Object�Դϴ�.
		//���� ���� Object�� ������ Ŭ���� Ÿ������ ����ϱ� ���� ĳ��Ʈ ������ �ؾ��մϴ�.
		//readObject()�� Object���̹Ƿ� GregorianCalendar Ÿ������ �� ��ȯ �մϴ�.
			GregorianCalendar calendar = (GregorianCalendar) in.readObject();
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH) + 1;
			int date = calendar.get(Calendar.DATE);
			System.out.println(year + "/" + month + "/" + date);
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
			}
			catch (Exception e) {
				System.out.println("������ �ݴ� �� ���� �߻��߽��ϴ�.");
			}
		}
	}
}
