//�ؽ�Ʈ ������ �д� ���α׷� - �����߻�
/*
 * java.lang.Object
 	jave.io.Reader
 		java.io.InputStreamReader
 			java.io.FileReader
 */
package ex18_1_FileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample1 {
	public static void main(String[] args) {
		//1. ������ ���ϴ�
		/* ������ ���ڰ����� ������ ��ġ�� �����Ϻ��.
		   ���� ��� : ����ο� ���� ��� ����
		 1)����� : ������Ʈ ��θ� �������� ���ʴ�� ������ ��ġ�� �����մϴ�.
		 2)������ : ����̺����� ���ʴ�� ������ ��ġ�� �����մϴ�.
		   			��) D:/�۾�����/������Ʈ/poem.txt. �ǹ�
		 */
		FileReader reader=new FileReader("poem.txt");
		
		//������ ����
		//FileReader reader =
		//new FileReader
		
		//2. ������ �о ó���մϴ�.
		while (true) {
			//read() : ���Ͽ� �ִ� ���� �ϳ��� �о �����ϴ� �޼ҵ�
				int data;
					data = reader.read();
					if (data == -1) //�� �̻� ���� �����Ͱ� ���°��
						break;
					char ch = (char) data;
					System.out.print(ch);
				}
		
		//3. ������ �ݽ��ϴ�.
			reader.close();
	}
}
