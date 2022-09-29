//객체를 직력화하는 프로그램
//직렬화 : 객체를 네트워크를 통해 전송하거나 파일에 저장하기 위해서 객체를 스트림으로 만드는 작업이 필요합니다.
//이런 작업을 자바에서는 객체의 직렬화(serialization)라고 합니다.
package ex19_01_Serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectInputExample1 {
	public static void main(String[] args) {
		//파일을 엽니다.
		//ObjectOutputStream 클래스는 객체를 스트림으로 만들어서 출력하는 기능이
		//있는 클래스입니다.
		//이 클래스에는 데이터를 파일에 저장하는 기능이 없기 때문에
		//FileOutputStream 클래스와 함께 사용해야 합니다.
		//FileOutputStream 객체를 생성해서
		//ObjectOutputStream클래스의 생성자 파라미터로 넘겨주어야 합니다.
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output.dat"));
			while (true) {
		//객체를 역직렬화 하는 부분
		//readObject 메소드 :  입력된 스트림으로부터 개체를 만들어서 리턴하는 메소드로 리턴타입은 Object입니다.
		//리턴 파입 Object를 원래의 클래스 타입으로 사용하기 위해 캐스트 연산을 해야합니다.
		//readObject()가 Object형미므로 GregorianCalendar 타입으로 형 변환 합니다.
			GregorianCalendar calendar = (GregorianCalendar) in.readObject();
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH) + 1;
			int date = calendar.get(Calendar.DATE);
			System.out.println(year + "/" + month + "/" + date);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (EOFException eofe) {//파일로부터 더 이상 읽을 객체가 없을 때 발생하는 익셉션 처리합니다.
			System.out.println("끝");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		} finally {
			try {
				in.close();//파일을 닫습니다.
			}
			catch (Exception e) {
				System.out.println("파일을 닫는 중 오류 발생했습니다.");
			}
		}
	}
}
