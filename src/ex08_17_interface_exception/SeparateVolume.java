//checkOut 메소드 밖으로 익셉션을 던지는 단행본 크래스
package ex08_17_interface_exception;

public class SeparateVolume implements Lendable {
    String requestNo;      // 청구번호
    String bookTitle;      // 제목
    String writer;         // 저자
    String borrower;       // 대출인
    String checkOutDate;   // 대출일
    byte state;            // 대출상태
    SeparateVolume(String requestNo, String bookTitle, String writer){
        this.requestNo = requestNo;
        this.bookTitle = bookTitle;
        this.writer = writer;
     }
    //부모보다 더 많은 예외를 던질 수 없습니다.
	public void checkOut(String borrower, String date) 
												throws Exception {
		 if (state != STATE_NORMAL) 
			 throw new Exception("*대출불가:" + bookTitle);
	      this.borrower = borrower;
	      this.checkOutDate = date;
	      this.state = STATE_BORROWED;	
	      System.out.println("*" + bookTitle + "이(가) 대출되었습니다.");
	      System.out.println("저 자 :" + writer);//추가된 부분
	      System.out.println("대출인 : " + borrower);
	      System.out.println("대출일 : " + date + "\n");
	}
	public void checkIn() {	
		 this.borrower = null;
		 this.checkOutDate = null;
	     this.state = STATE_NORMAL;	//반납 상태 :state=0
	     System.out.println("*" + bookTitle + " 이(가) 반납되었습니다.\n");
	}
}
