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

public class FileReaderExample2_1 {
	public static void main(String[] args) {
		try {
			//FileReader reader= new FileReader("poem.txt");
			FileReader reader= new FileReader("C:/Users/JIN/Desktop/eclipse-workspace/Java/poem.txt");		
			//FileReader reader= new FileReader("C:\\Users\\JIN\\Desktop\\eclipse-workspace/Java/poem.txt");	
		while (true) {
			//read() : 파일에 있는 문자 하나르 읽어서 리턴하는 메소드
				int data = reader.read();
				if (data == -1) //더 이상 읽을 데이터가 없는경우
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
			reader.close(); //만약 read()메서드에서 오류가 발생하면
							//close()메서드가 실행되지 않은 채 프로그램이 끝납니다. 
		}//try end
		catch (FileNotFoundException fnfe) { //FileReader() 생성자가 발생한 Exception 처리
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch (IOException ioe) {	//read() 메소드가 발생한 예외처리
			System.out.println("파일을 읽을 수 없습니다.");		
		}
		
	}
}
