//객체를 직력화하는 프로그램
//직렬화 : 객체를 네트워크를 통해 전송하거나 파일에 저장하기 위해서 객체를 스트림으로 만드는 작업이 필요합니다.
//이런 작업을 자바에서는 객체의 직렬화(serialization)라고 합니다.
package ex19_03_Serialization_interface;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputExample2 {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output2.dat"));
			while (true) {
				GoodsStock obj = (GoodsStock) in.readObject();
				System.out.println(obj.toString());
			}
		} 
		catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} 
		catch (EOFException eofe) {//파일로부터 더 이상 읽을 객체가 없을 때 발생하는 익셉션 처리합니다.
			System.out.println("끝");
		} 
		catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} 
		catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		} finally {
			try {
				in.close();//파일을 닫습니다.
			}
			catch (Exception e) {
				System.out.println("파일을 닫는 중 오류 발생했습니다.");
			}
		}
	}
}
