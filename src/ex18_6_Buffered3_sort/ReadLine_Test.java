package ex18_6_Buffered3_sort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine_Test {
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("src/ex18_6_Buffered3_sort/jumsu.txt"));
			while (true) {
				String str = reader.readLine();//파일로 부터 한 행씩 읽어요.
				if (str == null)
					break;
				System.out.println(str);
				//이승기 
				//100 
				//70 
				//80
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				System.out.println("파일을 닫는 중 오류 입니다.");
			}
		}
	}
}
