//추상 메소드를 포함하는클래스 - 매시지 전송 클래스
package ex08_13_02_polymorphism;
public abstract class MessageSender {//클래스 자체도 추상 클래스로 선언
	String title;		//제목
	String senderName;	//발송자 이름
	MessageSender(String title, String senderName){
		this.title = title;
		this.senderName = senderName;
	}
	
	//추상 메소드- 메시지를 송신한다
	//abstract void sendMessage(String recipient) ;
}
