//�߻� �޼ҵ带 �����ϴ�Ŭ���� - �Ž��� ���� Ŭ����
package ex08_13_02_polymorphism;
public abstract class MessageSender {//Ŭ���� ��ü�� �߻� Ŭ������ ����
	String title;		//����
	String senderName;	//�߼��� �̸�
	MessageSender(String title, String senderName){
		this.title = title;
		this.senderName = senderName;
	}
	
	//�߻� �޼ҵ�- �޽����� �۽��Ѵ�
	//abstract void sendMessage(String recipient) ;
}
