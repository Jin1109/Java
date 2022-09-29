//메시지 발송 클래스를 상송하는 이메일 송신 클래스
package ex08_09_abstract_method;

public class EMailSender extends MessageSender {
	String senderAddr;
	String emailBody;
	
	EMailSender(String title, String senderName, String senderAddr, String emailBody){
		super (title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}
	

	//슈퍼 클래스의 메소드를 오버라이드하는 메소드
	//추상 메서들 구현(implement)
	 void sendMessage(String recipient) {
		  System.out.println("----------------------------------");
		  System.out.println("제목 : " + title);
	      System.out.println("보내는 사람 : " + senderName + "\n" + "보낸 주소 : " + senderAddr);
	      System.out.println("받는 사람 : " + recipient);
	      System.out.println("내용 : " + emailBody);
	   }
 
	 

	
}
