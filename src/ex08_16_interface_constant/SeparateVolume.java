package ex08_16_interface_constant;

public class SeparateVolume implements Lendable {
    String requestNo;      // û����ȣ
    String bookTitle;      // ����
    String writer;         // ����
    String borrower;       // ������
    String checkOutDate;   // ������
    byte state;            // �������
    SeparateVolume(String requestNo, String bookTitle, String writer){
        this.requestNo = requestNo;
        this.bookTitle = bookTitle;
        this.writer = writer;
     }

	public void checkOut(String borrower, String date) {
		 if (state != STATE_NORMAL) //STATE_NORMAL=0(������� ���� ����)-Lendable �������̽� ��� �ʵ�
			 return;
	      this.borrower = borrower;
	      this.checkOutDate = date;
	      this.state = STATE_BORROWED;	//STATE_NORMAL=0(������)-Lendable �������̽� ��� �ʵ�
	      System.out.println("*" + bookTitle + "��(��) ����Ǿ����ϴ�.");
	      System.out.println("�� �� :" + writer);//�߰��� �κ�
	      System.out.println("������ : " + borrower);
	      System.out.println("������ : " + date + "\n");
	}
	public void checkIn() {	// �ݳ��Ѵ�
		 this.borrower = null;
		 this.checkOutDate = null;
	     this.state = STATE_NORMAL;	//�ݳ� ���� :state=0
	     System.out.println("*" + bookTitle + " ��(��) �ݳ��Ǿ����ϴ�.\n");
	}
}