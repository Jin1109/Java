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

public class FileWriterExample1 {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			//�������� �Ű������� �� ������ �̸��� �ǹ��մϴ�.
			//output.txt������ ���� ���� ���� ���� �� ������ �����ϴ�.
			//���� �̸��� �ִ� ��� ���� ������ ������ �������ϴ�.
			writer = new FileWriter("output.txt");
			//public FileWriter(String fileName)throws IOException
			//FileWrtier �����ڴ� IOException������ �߻��ϱ� ������
			//IOException ó������ �־�� �մϴ�.
			
			char arr[] = {'��','��','��',' ','��',' ','��','��',' ',
                    '��','��',' ','��','��',' ','��','��','��'};
			
			//���Ͽ� �ݺ��ؼ� ���ڵ��� ���ϴ�.
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			//�� �� ����� ���� �ǹ�
			//writer.write(arr);
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
