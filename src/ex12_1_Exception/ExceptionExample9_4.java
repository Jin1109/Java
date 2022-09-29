//��� ���Կ� �ִ� �� ������ Exception�� ó���ϴ� try~catch��
//���� ó�� ������ �ڽĿ� �θ� ������ �ۼ��մϴ�.
//FileNotFoundException -> IOExceoption
//�� �� �߻��� ������ ������ ��ġ�ϴ� �� �Ѱ��� catch���� ����˴ϴ�.
package ex12_1_Exception;

import java.io.FileReader;
import java.io.IOException;


public class ExceptionExample9_4 {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("some.text");
		}
		catch (IOException e) {
			System.err.println("����� ������ �߻��߽��ϴ�.");
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
			//} catch (Exception e) {
				
				System.err.println("���� �ݴ� �� ���� �߻��߽��ϴ�.");
			}
		
		}
	}
}
