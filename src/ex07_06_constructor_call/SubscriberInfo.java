//�����ڿ��� �����ڸ� ȣ���ϴ� ��
package ex07_06_constructor_call;
public class SubscriberInfo {
		String name , id , password; 
		String phoneNo, address;
		SubscriberInfo(){
		}
		
		//this�� ���������� �ν��Ͻ� �ڽ��� ����ŵ�ϴ�.
		SubscriberInfo (String name, String id, String password) {
			this.name = name;
			this.id = id;
			this.password = password;
		}

		//5���� StringŸ�� �Ķ���͸� ���� ������ ����
		SubscriberInfo (String name, String id, String password,
						String phoneNo, String address) {
			//this( ) : ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ����մϴ�
			//Stirng Ÿ���� �Ķ���� 3���� ���� �����ڸ� ȣ��
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
