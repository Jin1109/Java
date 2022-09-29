package ex08_17_interface_exception;

public class SeparateVolume3 implements Lendable3 {
    String requestNo;      // 청구번호
    String bookTitle;      // 제목
    String writer;         // 저자
    String borrower;       // 대출인
    String checkOutDate;   // 대출일
    byte state;            // 대출상태
    SeparateVolume3(String requestNo, String bookTitle, String writer){
        this.requestNo = requestNo;
        this.bookTitle = bookTitle;
        this.writer = writer;
     }
    //부모의 예외는 IOException
    //자식의 예외는 Exception
    //Exception - IOException 관계로 오버라이팅하는 곳에서
    //예외 범위가 더 커서 오류 발생합니다.
	public void checkOut(String borrower, String date) 
										throws Exception {
		 if (state != STATE_NORMAL) //STATE_NORMAL=0(대출되지 않은 상태)-Lendable 인터페이스 상수 필드
			 throw new Exception("*대출불가:" + bookTitle);
	      this.borrower = borrower;
	      this.checkOutDate = date;
	      this.state = STATE_BORROWED;	//STATE_NORMAL=0(대출중)-Lendable 인터페이스 상수 필드
	      System.out.println("*" + bookTitle + "이(가) 대출되었습니다.");
	      System.out.println("저 자 :" + writer);//추가된 부분
	      System.out.println("대출인 : " + borrower);
	      System.out.println("대출일 : " + date + "\n");
	}
	public void checkIn() {	// 반납한다
		 this.borrower = null;
		 this.checkOutDate = null;
	     this.state = STATE_NORMAL;	//반납 상태 :state=0
	     System.out.println("*" + bookTitle + " 이(가) 반납되었습니다.\n");
	}
}
