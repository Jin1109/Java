package ex19_03_Serialization_interface;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputExample2 {
	public static void main(String[] args) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output2.dat"));
			out.writeObject(new GoodsStock("70101", 100));
			out.writeObject(new GoodsStock("70102", 50));
			out.writeObject(new GoodsStock("70103", 200));
			System.out.println("파일이 출력되었습니다.");
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("파일을 출력할 수 없습니다.");
		}
		finally {
			try {
				out.close();
			} catch (Exception e) {
				System.out.println("파일을 닫는 중 오류입니다.");
			}
		}//finally end
	}//main end
}//class end
