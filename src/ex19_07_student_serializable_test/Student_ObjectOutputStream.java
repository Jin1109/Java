
package ex19_07_student_serializable_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Student_ObjectOutputStream {
	public static void main(String[] args) {
		write();
	}
	
	static void write() {
		BufferedReader reader = null;
		ObjectOutputStream out = null;
		try {
			reader = new BufferedReader(new FileReader("src/ex19_07_student_serializable_test/jumsu.txt"));
			out = new ObjectOutputStream(new FileOutputStream("src/ex19_07_student_serializable_test/output.dat"));
			while (true) {
				String str = reader.readLine();//파일로 부터 한 행씩 읽어요.
				if (str == null)
					break;
				String[] sep = str.split(" ");
				out.writeObject(new Student2(sep[0], Integer.parseInt(sep[1]),
											Integer.parseInt(sep[2]), Integer.parseInt(sep[3])));
			}
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if (out != null)
					reader.close();
			} catch (IOException e) {
				System.out.println("파일을 닫는 중 오류 입니다.");
			}
			
		}
	}
}
