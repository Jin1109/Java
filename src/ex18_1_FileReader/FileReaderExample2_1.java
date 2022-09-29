//�ؽ�Ʈ ������ �д� ���α׷� - �����߻�
/*
 * java.lang.Object
 	jave.io.Reader
 		java.io.InputStreamReader
 			java.io.FileReader
 */
package ex18_1_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2_1 {
	public static void main(String[] args) {
		try {
			//FileReader reader= new FileReader("poem.txt");
			FileReader reader= new FileReader("C:/Users/JIN/Desktop/eclipse-workspace/Java/poem.txt");		
			//FileReader reader= new FileReader("C:\\Users\\JIN\\Desktop\\eclipse-workspace/Java/poem.txt");	
		while (true) {
			//read() : ���Ͽ� �ִ� ���� �ϳ��� �о �����ϴ� �޼ҵ�
				int data = reader.read();
				if (data == -1) //�� �̻� ���� �����Ͱ� ���°��
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
			reader.close(); //���� read()�޼��忡�� ������ �߻��ϸ�
							//close()�޼��尡 ������� ���� ä ���α׷��� �����ϴ�. 
		}//try end
		catch (FileNotFoundException fnfe) { //FileReader() �����ڰ� �߻��� Exception ó��
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		catch (IOException ioe) {	//read() �޼ҵ尡 �߻��� ����ó��
			System.out.println("������ ���� �� �����ϴ�.");		
		}
		
	}
}
