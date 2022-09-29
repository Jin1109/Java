//익셉션 파라미터의 다형성을 보여주는 예
//익셉션을 처리하지 안아서 컴파일 오류 발생했습니다.
package ex12_1_Exception;

import java.io.FileReader;

public class ExceptionExample8 {
	public static void main(String[] args) {
		FileReader reader = new FileReader("some.text");
		
		reader.close();		
	}
}
