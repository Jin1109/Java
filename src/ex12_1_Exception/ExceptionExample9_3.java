//��� ���Կ� �ִ� �� ������ Exception�� ó���ϴ� try~catch��
//���� ó�� ������ �ڽĿ� �θ� ������ �ۼ��մϴ�.
//FileNotFoundException -> IOExceoption
//�� �� �߻��� ������ ������ ��ġ�ϴ� �� �Ѱ��� catch���� ����˴ϴ�.
package ex12_1_Exception;
import java.io.*;

public class ExceptionExample9_3 {
	public static void main(String[] args) {
		try {
		//java.io.FileReader.FileReader(String fileName)
		//throws FileNotFoundExceoption
		//FileNotFoundException �߻��ϴ� �κ�
		FileReader reader = new FileReader("some.text");
		reader.close();	
		
		}
		//FileNotFoundException�� IOExceoption�� ����Ŭ������
		//FileNotFoundException�� ���� �� �ֽ��ϴ�.
		catch (IOException e) {
			System.err.println("����� ������ �߻��߽��ϴ�.");
		}
	}
}
