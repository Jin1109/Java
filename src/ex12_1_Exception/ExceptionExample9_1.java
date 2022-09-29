//��� ���Կ� �ִ� �� ������ Exception�� ó���ϴ� try~catch��
//���� ó�� ������ �ڽĿ� �θ� ������ �ۼ��մϴ�.
//FileNotFoundException -> IOExceoption
//�� �� �߻��� ������ ������ ��ġ�ϴ� �� �Ѱ��� catch������ ����˴ϴ�.
package ex12_1_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample9_1 {
	public static void main(String[] args) {
		try {
		FileReader reader = new FileReader("some.text");
		reader.close();	
		}catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}catch (IOException e) {
			System.out.println("���߷� ������ �߻��߽��ϴ�.");
		}
	}
}