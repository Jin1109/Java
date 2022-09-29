/*
 * java.lang.Object
 	jave.io.Reader
 		java.io.InputStreamReader
 			java.io.FileReader
 */
/*
 * output.txt�� Ȯ���ϴ� ���
 * 1. ��Ŭ���� Package Explorer���� Java ������Ʈ���� ���ΰ�ħ(F5) ������ ���
 * 2. ��Ŭ���� Window �޴� - Preferences - General
 * 		- Workspace - Refresh using native hooks or polling ����
 */
package ex18_2_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2 {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			///true : append(���� �ִ� ���� ���� �ڿ� �߰��� ����.)
			//false : overwriter(���� ���� �Ѵ�.)
			writer = new FileWriter("output.txt", true);//������ ����
			//public FileWriter(String fileName)throws IOException
			//FileWrtier �����ڴ� IOException������ �߻��ϱ� ������
			
			char arr[] = {'��','��',' ','��','��','��'};
			
			//���Ͽ� �ݺ��ؼ� ���ڵ��� ���ϴ�.
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			
			writer.write("\n");//���� �ٲٴ� ���� �߰�
		}
		catch (IOException ioe) {
			System.out.println("������ ����� �� �����ϴ�.");
		}
		finally {
			try {
				writer.close();//������ �ݽ��ϴ�.
			}
			catch (Exception e) {
				System.out.println("���� �ݴ� �� ���� �Դϴ�.");
			}
		}
	}
}
