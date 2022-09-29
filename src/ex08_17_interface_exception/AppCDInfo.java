//���� ���� �������̽��� �����ϴºη� CDŬ����
package ex08_17_interface_exception;
public class AppCDInfo extends CDInfo implements Lendable{
	String borrower;         // ������
    String checkOutDate;     // ������
    byte state;              // �������
    String writer;			 // �߰��� �κ� 
    
    //������ ����
    AppCDInfo(String regiserNo, String title, String writer){
    	super (regiserNo, title);
    	this.writer = writer;
    }
    
    //public : �������̽��� �޼ҵ带 ������ �� �ݵ�� ����ؾ� �ϴ� Ű����
    //�����Ѵ�
	@Override
	public void checkOut(String borrower, String date) {
		// TODO Auto-generated method stub
		if (state != 0) //ó�� state ����?(0) 
			 return;
	      this.borrower = borrower;
	      this.checkOutDate = date;
	      this.state = 1;	//������� : state=1
	      System.out.println("*" + title + " CD�� ����Ǿ����ϴ�.");
	      System.out.println("��   ��:" + writer);
	      System.out.println("������:" + borrower);
          System.out.println("������:" + date + "\n");
	}
	
	//public : �������̽��� �޼ҵ带 ������ �� �ݵ�� ����ؾ� �ϴ� Ű����
	// �ݳ��Ѵ�
	@Override
	public void checkIn() {	// �ݳ��Ѵ�
		// TODO Auto-generated method stub
		 this.borrower = null;
		 this.checkOutDate = null;
	     this.state = 0;	//�ݳ� ���� :state=0
	     System.out.println("*" + title + " CD�� �ݳ��Ǿ����ϴ�.\n");
	}
}
