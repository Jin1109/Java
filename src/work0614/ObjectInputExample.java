package work0614;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputExample {
	public static void main(String[] args) {
		ObjectInputStream input = null;
		try {
			input = new ObjectInputStream(new BufferedInputStream(new FileInputStream("jumsu.txt")));
			while(true) {
			Student2 obj = (Student2) input.readObject();// 개체를 역직렬화하는 부분
			System.out.println(obj);}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch(EOFException eofe) {//파일로부터 더 이상 읽을 객체가 없을 때 발생하는 익셉션 처리합니다.
			System.out.println("끝"); 
		} catch (IOException ioe) {
			//직렬화할 때 사용한 클래스와 역직렬화할 때 사용한 클래스의 버전이
			//다른때 발생하는 에러 메시지 출력하는 곳
			System.out.println(ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		} finally {
			try {
				input.close();//파일을 닫습니다.
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
