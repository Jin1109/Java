//BBSItem ��ü�� ����ȭ�ϴ� ���α׷�
package ex19_04_2_Serialization_interface_transient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputExample3 {
	public static void main(String[] args) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output3.dat"));
			BBSItem obj = new BBSItem("ȫ�浿", "HTA-L2", "7�� ����", "������ �� �� �ִ� ���");
			System.out.println(obj);
			out.writeObject(obj);//��ü�� ����ȭ �ϴºκ�
		}
		catch (IOException ioe) {
			System.out.println("������ ����� �� �����ϴ�.");
		}
		finally {
			try {
				out.close();
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally end
	}//main end
}//class end
