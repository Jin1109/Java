//File Ŭ������ �̿��Ͽ� ����, ���丮 ���� �� ���� ����
package ex18_10_File;

import java.io.File;

public class FileExample2_4 {
	public static void main(String[] args) {
		//�𷺵��� ����
		/*
		 * boolean java.io.File.delete() : ���丮 �����մϴ�.
		 * �� ���丮 �ȿ� ������ ������ �������� ���մϴ�.
		 * �̶� ��ȯ���� false�� �˴ϴ�.
		 */
		String dir = "C:\\newDirectory";
		File f3 = new File(dir);
		if(f3.exists()) {
			if(f3.delete()) {// ���ϻ���
				System.out.println(f3.getPath() + "�����߽��ϴ�.");
			}else{
				System.out.println(f3.getPath() + "���� ���� ���߽��ϴ�.");
			}
		}else 
		 System.out.println(f3.getPath() + "�� �����ϰ��� �ϴ� ������ �����ϴ�.");
		
	}
}
