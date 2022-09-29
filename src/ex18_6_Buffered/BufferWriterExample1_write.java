package ex18_6_Buffered;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample1_write {
	public static void main(String[] args) {
		String message = "하하입니다.\n오늘도 화이팅입니다.";
		
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("src/ex18_6_Buffered/output2.dat"));
			writer.write(message);
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {// Exception - IOException
			System.out.println("파일을 읽을 수 없습니다.");
		} finally { // 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블ㄹ록에서 사용함.
			try {
				writer.close(); // 파일을 닫는 명령문
			} catch (IOException e) { // close메소드가 발생하는 예외 처리
				System.out.println("닫는 중 오류입니다.");
			}
			
		}
	}
}
