//BBSItem 객체를 직렬화하는 프로그램
package ex19_04_2_Serialization_interface_transient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputExample3 {
	public static void main(String[] args) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output3.dat"));
			BBSItem obj = new BBSItem("홍길동", "HTA-L2", "7월 모임", "집에서 할 수 있는 취미");
			System.out.println(obj);
			out.writeObject(obj);//객체를 직렬화 하는부분
		}
		catch (IOException ioe) {
			System.out.println("파일을 출력할 수 없습니다.");
		}
		finally {
			try {
				out.close();
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally end
	}//main end
}//class end
