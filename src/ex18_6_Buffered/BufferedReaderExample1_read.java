package ex18_6_Buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample1_read {
	public static void main(String[] args) {
		
		BufferedReader reader = null;
		char arr[] = new char[64];//파일에 있는 문자를 담을 char배열
		int num=-1;
		try {
			reader = new BufferedReader(
					new FileReader("src/ex18_6_Buffered/output2.dat"));
			
			while( (num=reader.read(arr)) != -1) {
				System.out.println(new String(arr,0,num));
			}
		} 
		catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch (IOException ioe) { //Exception - IOException
			System.out.println("파일을 읽을 수 없습니다.");
		}
		finally { //파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용함.
			try {
				reader.close(); // 파일을 닫는 명령문
			}
			catch (Exception e) { //close메소드가 발생하는 예외 처리
				System.out.println(e.getStackTrace());
			}
		}
	}
}
