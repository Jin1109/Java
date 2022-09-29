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

public class FileWriterExample3_gugudan {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			///true : append(���� �ִ� ���� ���� �ڿ� �߰��� ����.)
			//false : overwriter(���� ���� �Ѵ�.)
			writer = new FileWriter("src/ex18_2_FileWriter/gugudan.txt", true);//������ ����
			//public FileWriter(String fileName)throws IOException
			//FileWrtier �����ڴ� IOException������ �߻��ϱ� ������
			
			// �� title���
			for (int dan = 2; dan <= 9; dan++) {
				writer.write("[" + dan + "��]" + "\t");
			}
			
			for (int i = 1; i <= 9; i++) {
				writer.write("\n");//���� �ٲٴ� ���� �߰�
				for (int j =2; j <=9; j++) { // �� �� ���
					writer.write(j + "*" + i + "=" + (j * i) + "\t");
				}

			}
			
		}catch (IOException ioe) {
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
