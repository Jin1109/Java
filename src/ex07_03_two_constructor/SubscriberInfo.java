//두 개의 생성자를 갖는 클래스
package ex07_03_two_constructor;
public class SubscriberInfo {
		String name , id , password, phoneNo, address;
		
		//3개의 String타입 파라미터를 갖는 생성자 선언
		SubscriberInfo (String name, String id, String password) {
			this.name = name;
			this.id = id;
			this.password = password;
		}

		//5개의 String타입 파라미터를 갖는 생성자 선언
		SubscriberInfo (String name, String id, String password,
						String phoneNo, String address) {
			this.name = name;
			this.id = id;
			this.password = password;
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
