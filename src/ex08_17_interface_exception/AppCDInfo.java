//대출 가능 인터페이스를 구현하는부록 CD클래스
package ex08_17_interface_exception;
public class AppCDInfo extends CDInfo implements Lendable{
	String borrower;         // 대출인
    String checkOutDate;     // 대출일
    byte state;              // 대출상태
    String writer;			 // 추가된 부분 
    
    //생성자 숫정
    AppCDInfo(String regiserNo, String title, String writer){
    	super (regiserNo, title);
    	this.writer = writer;
    }
    
    //public : 인터페이스의 메소드를 구현할 때 반드시 사용해야 하는 키원드
    //대출한다
	@Override
	public void checkOut(String borrower, String date) {
		// TODO Auto-generated method stub
		if (state != 0) //처음 state 값은?(0) 
			 return;
	      this.borrower = borrower;
	      this.checkOutDate = date;
	      this.state = 1;	//대출상태 : state=1
	      System.out.println("*" + title + " CD가 대출되었습니다.");
	      System.out.println("저   자:" + writer);
	      System.out.println("대출인:" + borrower);
          System.out.println("대출일:" + date + "\n");
	}
	
	//public : 인터페이스의 메소드를 구현할 때 반드시 사용해야 하는 키원드
	// 반납한다
	@Override
	public void checkIn() {	// 반납한다
		// TODO Auto-generated method stub
		 this.borrower = null;
		 this.checkOutDate = null;
	     this.state = 0;	//반납 상태 :state=0
	     System.out.println("*" + title + " CD가 반납되었습니다.\n");
	}
}
