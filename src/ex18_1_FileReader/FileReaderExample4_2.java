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

public class FileReaderExample4_2 {
	public static void main(String[] args) {
		
		FileReader reader = null;
		char arr[] = new char[64]; // 파일에 있는 문자를 담을 char 배열
		try {
			reader = new FileReader("거위의 꿈.txt");
			
		while (true) {
				// Returns: The number of characters read
				int num = reader.read(arr);
				
				if (num == -1) //더 이상 읽을 데이터가 없는경우
					break;
				
					System.out.printf(new String(arr, 0, num));
				
			}// while end
		} // try end 
		catch (FileNotFoundException fnfe) { //FileReader() 생성자가 발생한 Exception 처리
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