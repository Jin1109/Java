//��� ���Կ� �ִ� �� ������ Exception�� ó���ϴ� try~catch��
//���� ó�� ������ �ڽĿ� �θ� ������ �ۼ��մϴ�.
//FileNotFoundException -> IOExceoption
//�� �� �߻��� ������ ������ ��ġ�ϴ� �� �Ѱ��� catch���� ����˴ϴ�.
package ex12_1_Exception;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample9_2 {
	public static void main(String[] args) {
		try {
		FileReader reader = new FileReader("some.text");
		reader.close();	
		
		}catch (FileNotFoundException e) {
			System.err.println("����� ������ �߻��߽��ϴ�.");
		}
		//�̹� �θ� IOException���� �ڽ� FileNotFoundException��
		//ó���� �� �ֱ� ������ �� �κ��� �ʿ�����ϴ�.
		catch (FileNotFoundException e) {
			System.err.println("������ ã�� �� �����ϴ�.");
		}
	}
}
