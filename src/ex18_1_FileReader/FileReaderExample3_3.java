//텍스트 파일을 읽는 프로그램 - 에러발생
/*
 * java.lang.Object
 	jave.io.Reader
 		java.io.InputStreamReader
 			java.io.FileReader
 */
package ex18_1_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample3_3 {
	public static void main(String[] args) {
		// reader 변수를 finally 문에서 사용하기 위해 try문 전에 선언
		FileReader reader = null;
		try {
			reader = new FileReader("poem2.text");
			//FileReader reader= new FileReader("poem.text");
			//FileReader reader= new FileReader("C:/Users/JIN/Desktop/eclipse-workspace/Java/poem.text");		
			//FileReader reader= new FileReader("C:\\Users\\JIN\\Desktop\\eclipse-workspace/Java/poem.text");	
		while (true) {
				int data = reader.read();// 파일에 있는 문자 하나를 읽어서 리턴하는 메소드
				if (data == -1) //더 이상 읽을 데이터가 없는경우
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
		} catch (FileNotFoundException fnfe) { //FileReader() 생성자가 발생한 Exception 처리
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {	// Exception - IOException
			System.out.println("파일을 읽을 수 없습니다.");		
		} 
		finally { // 파일을 닫는 명렬문을 에러와 상관없이 처리하기 위해 finally불록에서 상용함.
			 try {
				 reader.close(); // 파일을 닫는 명령문 
			 } catch (Exception e) {//close메소드가 발생하는 예외처리
				 					// IOException과 NullPointerException 처리하기 위한 문
				 System.out.println("Exception");
			 }
		}
	}
}