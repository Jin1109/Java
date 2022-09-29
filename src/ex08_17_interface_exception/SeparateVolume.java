//checkOut �޼ҵ� ������ �ͼ����� ������ ���ົ ũ����
package ex08_17_interface_exception;

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
    //�θ𺸴� �� ���� ���ܸ� ���� �� �����ϴ�.
	public void checkOut(String borrower, String date) 
												throws Exception {
		 if (state != STATE_NORMAL) 
			 throw new Exception("*����Ұ�:" + bookTitle);
	      this.borrower = borrower;
	      this.checkOutDate = date;
	      this.state = STATE_BORROWED;	
	      System.out.println("*" + bookTitle + "��(��) ����Ǿ����ϴ�.");
	      System.out.println("�� �� :" + writer);//�߰��� �κ�
	      System.out.println("������ : " + borrower);
	      System.out.println("������ : " + date + "\n");
	}
	public void checkIn() {	
		 this.borrower = null;
		 this.checkOutDate = null;
	     this.state = STATE_NORMAL;	//�ݳ� ���� :state=0
	     System.out.println("*" + bookTitle + " ��(��) �ݳ��Ǿ����ϴ�.\n");
	}
}
