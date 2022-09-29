/*
 * java.lang.Object
 	jave.io.Reader
 		java.io.InputStreamReader
 			java.io.FileReader
 */
/*
 * output.txt를 확인하는 방법
 * 1. 이클립스 Package Explorer에서 Java 프로젝트에서 새로고침(F5) 누르는 방법
 * 2. 이클립스 Window 메뉴 - Preferences - General
 * 		- Workspace - Refresh using native hooks or polling 선택
 */
package ex18_2_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample3_gugudan {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			///true : append(원래 있던 파일 내용 뒤에 추가로 쓴다.)
			//false : overwriter(덮어 쓰기 한다.)
			writer = new FileWriter("src/ex18_2_FileWriter/gugudan.txt", true);//파일을 연다
			//public FileWriter(String fileName)throws IOException
			//FileWrtier 생성자는 IOException에러를 발생하기 때문어
			
			// 단 title출력
			for (int dan = 2; dan <= 9; dan++) {
				writer.write("[" + dan + "단]" + "\t");
			}
			
			for (int i = 1; i <= 9; i++) {
				writer.write("\n");//줄을 바꾸는 문자 추가
				for (int j =2; j <=9; j++) { // 각 단 출력
					writer.write(j + "*" + i + "=" + (j * i) + "\t");
				}

			}
			
		}catch (IOException ioe) {
			System.out.println("파일을 출력할 수 없습니다.");
		}
		finally {
			try {
				writer.close();//파일을 닫습니다.
			}
			catch (Exception e) {
				System.out.println("파일 닫는 중 오류 입니다.");
			}
		}
	}
}
