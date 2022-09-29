//상속 관게에 있는 두 종류의 Exception을 처리하는 try~catch문
//예외 처리 순서가 자식에 부모 순으로 작성합니다.
//FileNotFoundException -> IOExceoption
//이 중 발생한 예외의 종류와 일치하느 단 한계의 catch블럭만 수행됩니다.
package ex12_1_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample9_1 {
	public static void main(String[] args) {
		try {
		FileReader reader = new FileReader("some.text");
		reader.close();	
		}catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}catch (IOException e) {
			System.out.println("입추력 에러가 발생했습니다.");
		}
	}
}
