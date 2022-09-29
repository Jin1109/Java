package work0614;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.StringTokenizer;

public class ReadLine_Test2 {
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("src/ex18_6_Buffered3_sort/jumsu.txt"));
			while (true) {
				String str = reader.readLine();//���Ϸ� ���� �� �྿ �о��.
				if (str == null)
					break;
				// System.out.println(str);
				String[] sep = str.split(" ");
				System.out.println(sep[0]);
				System.out.println(sep[1]);
				System.out.println(sep[2]);
				System.out.println(sep[3]);
				//�̽±� 
				//100 
				//70 
				//80
//				//���� �Ѱ�
//				StringTokenizer token = new StringTokenizer(str, " ");
//				
//				System.out.println(token.nextToken());
//				System.out.println(token.nextToken());
//				System.out.println(token.nextToken());
//				System.out.println(token.nextToken());
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				System.out.println("������ �ݴ� �� ���� �Դϴ�.");
			}
		}
	}
}
