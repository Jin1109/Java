//상속 관게에 있는 두 종류의 Exception을 처리하는 try~catch문
//예외 처리 순서가 자식에 부모 순으로 작성합니다.
//FileNotFoundException -> IOExceoption
//이 중 발생한 예외의 종류와 일치하느 단 한계의 catch블럭만 수행됩니다.
package ex12_1_Exception;

import java.io.FileReader;
import java.io.IOException;


public class ExceptionExample9_4 {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("some.text");
		}
		catch (IOException e) {
			System.err.println("입출력 에러가 발생했습니다.");
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
			//} catch (Exception e) {
				
				System.err.println("파일 닫는 중 오류 발생했습니다.");
			}
		
		}
	}
}
