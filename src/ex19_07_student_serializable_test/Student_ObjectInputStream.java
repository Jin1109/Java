package ex19_07_student_serializable_test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Student_ObjectInputStream {
	public static void main(String[] args) {
		input();
	}
	
	static void input() {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("src/ex19_07_student_serializable_test/output.dat"));
			while (true) {
				Student2 s = (Student2) in.readObject();
				System.out.println(s.toString());
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (EOFException eofe) {
			System.out.println("끝");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				System.out.println("파일 단는 중 오류입니다.");
			}
		}
	}
}
