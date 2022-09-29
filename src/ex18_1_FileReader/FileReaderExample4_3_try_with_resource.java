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

public class FileReaderExample4_3_try_with_resource {
	public static void main(String[] args) {
		char arr[] = new char[64]; // ���Ͽ� �ִ� ���ڸ� ���� char �迭
		/*
		 	1. try-with-resource������ try()��ȣ �ȿ� ����� �ڿ���
		 	   try���� ������ �ڵ����� close()�޼��带 ȣ���Ϻ��.
		 	   
		 	2. try-with-resource���� ���� �ڵ�����
		 	   ��ü�� close()�� ȣ��� �� �������� Ŭ������
		 	   AutoCloseable�̶�� �������̽��� ������ ���̾�� �Ϻ��.
		 */
		
		try (
			FileReader reader = new FileReader("������ ��.txt");
			) {
		while (true) {
				// Returns: The number of characters read
				int num = reader.read(arr);
				
				if (num == -1) //�� �̻� ���� ���ڰ� ���� ��� -1�� �����մϴ�.
					break;
					
					//arr�� 0���� num�� ��ŭ ��Ʈ������ ������ ���
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
				  
			 } catch (Exception e) {//close�޼ҵ尡 �߻��ϴ� ����ó��
				 					// IOException�� NullPointerException ó���ϱ� ���� ��
				 System.out.println("Exception");
			 }
		}
	}
}