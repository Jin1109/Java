package work0614;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {
	public static void main(String[] args) {
		ObjectOutputStream write = null;
		try {
			write = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("jumsu.txt")));
			write.writeObject(new Student2("�̽±�", 100, 70, 80));
			write.writeObject(new Student2("��ȣ��", 98, 100, 20));
			write.writeObject(new Student2("������", 50, 60, 78));
			write.writeObject(new Student2("���缮", 80, 70, 80));
			write.writeObject(new Student2("ȫ�浿", 80, 80, 80));
		}catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}finally {
			try {
				write.close();
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally end
	}//main end
}//class end
