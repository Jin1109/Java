//생성자에서 생성자를 호출하는 예
package ex07_06_constructor_call;
public class SubscriberInfo {
		String name , id , password; 
		String phoneNo, address;
		SubscriberInfo(){
		}
		
		//this는 참조변수로 인스턴스 자신을 가리킵니다.
		SubscriberInfo (String name, String id, String password) {
			this.name = name;
			this.id = id;
			this.password = password;
		}

		//5개의 String타입 파라미터를 갖는 생성자 선언
		SubscriberInfo (String name, String id, String password,
						String phoneNo, String address) {
			//this( ) : 같은 클래스의 다른 생성자를 호출할 때 사용합니다
			//Stirng 타입의 파라미터 3개를 갖는 생성자를 호출
			this(name, id,  password);
			this.phoneNo = phoneNo;
			this.address = address;
		}
		
		void changePasword(String password) {
			this.password = password;
		}
		
		void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		
		void setAddress(String address) {
			this.address = address;
		}
		
}
