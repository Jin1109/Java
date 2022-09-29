//메시지 발송 클래스를 상송하는 이메일 송신 클래스
package ex08_13_01_polymorphism;

public class EMailSender extends MessageSender {
	String senderAddr;
	String emailBody;
	
	EMailSender(String title, String senderName, 
				String senderAddr, String emailBody){
		super (title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}	
	 void sendMessage(String recipient) {
		  System.out.println("----------------------------------");
		  System.out.println("제목 : " + title);
	      System.out.println("보내는 사람 : " + senderName + 
	    		  				" " + senderAddr);
	      System.out.println("받는 사람 : " + recipient);
	      System.out.println("내용 : " + emailBody);
	   }
 
	 

	
}
