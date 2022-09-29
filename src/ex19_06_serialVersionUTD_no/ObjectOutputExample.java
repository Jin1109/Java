//BBSItem 객체를 직렬화하는 프로그램
package ex19_06_serialVersionUTD_no;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class ObjectOutputExample {
	public static void main(String[] args) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output10.dat"));
			Rectangle obj = new Rectangle(100, 200);
			System.out.println(obj);
			out.writeObject(obj);//객체를 직렬화 하는부분
		}catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}finally {
			try {
				out.close();
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally end
	}//main end
}//class end
