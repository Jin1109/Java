//�ؽ�Ʈ ������ �д� ���α׷� - �����߻�
/*
 * java.lang.Object
 	jave.io.Reader
 		java.io.InputStreamReader
 			java.io.FileReader
 */
package ex18_2_FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2 {
	public static void main(String[] args) {
		// reader ������ finally ������ ����ϱ� ���� try�� ���� ����
		FileReader reader = null;
		try {
			reader = new FileReader("src/ex18_2_FileWriter/gugudan.txt");
			//FileReader reader= new FileReader("poem.text");
			//FileReader reader= new FileReader("C:/Users/JIN/Desktop/eclipse-workspace/Java/poem.text");		
			//FileReader reader= new FileReader("C:\\Users\\JIN\\Desktop\\eclipse-workspace/Java/poem.text");	
		while (true) {
				int data = reader.read();// ���Ͽ� �ִ� ���� �ϳ��� �о �����ϴ� �޼ҵ�
				if (data == -1) //�� �̻� ���� �����Ͱ� ���°��
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
		} catch (FileNotFoundException fnfe) { //FileReader() �����ڰ� �߻��� Exception ó��
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {	// Exception - IOException
			System.out.println("������ ���� �� �����ϴ�.");		
		} finally { // ������ �ݴ� ��Ĺ��� ������ ������� ó���ϱ� ���� finally�ҷϿ��� �����.
			 try {
				 reader.close(); // ������ �ݴ� ��ɹ� 
			 } catch (IOException e) {
				 System.out.println("IOException");
			 }
		}
	}
}