//�޽��� �߼� Ŭ������ ����ϴ� �̸��� �۽� Ŭ����
package ex08_09_abstract_method;

public class EMailSender extends MessageSender {
	String senderAddr;
	String emailBody;
	
	EMailSender(String title, String senderName, String senderAddr, String emailBody){
		super (title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}
	

	//���� Ŭ������ �޼ҵ带 �������̵��ϴ� �޼ҵ�
	//�߻� �޼��� ����(implement)
	 void sendMessage(String recipient) {
		  System.out.println("----------------------------------");
		  System.out.println("���� : " + title);
	      System.out.println("������ ��� : " + senderName + "\n" + "���� �ּ� : " + senderAddr);
	      System.out.println("�޴� ��� : " + recipient);
	      System.out.println("���� : " + emailBody);
	   }
 
	 

	
}