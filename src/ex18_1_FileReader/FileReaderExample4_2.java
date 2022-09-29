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

public class FileReaderExample4_2 {
	public static void main(String[] args) {
		
		FileReader reader = null;
		char arr[] = new char[64]; // ���Ͽ� �ִ� ���ڸ� ���� char �迭
		try {
			reader = new FileReader("������ ��.txt");
			
		while (true) {
				// Returns: The number of characters read
				int num = reader.read(arr);
				
				if (num == -1) //�� �̻� ���� �����Ͱ� ���°��
					break;
				
					System.out.printf(new String(arr, 0, num));
				
			}// while end
		} // try end 
		catch (FileNotFoundException fnfe) { //FileReader() �����ڰ� �߻��� Exception ó��
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {	// Exception - IOException
			System.out.println("������ ���� �� �����ϴ�.");		
		} 
		finally { // ������ �ݴ� ��Ĺ��� ������ ������� ó���ϱ� ���� finally�ҷϿ��� �����.
			 try {
				 reader.close(); // ������ �ݴ� ��ɹ� 
			 } catch (Exception e) {//close�޼ҵ尡 �߻��ϴ� ����ó��
				 					// IOException�� NullPointerException ó���ϱ� ���� ��
				 System.out.println("Exception");
			 }
		}
	}
}