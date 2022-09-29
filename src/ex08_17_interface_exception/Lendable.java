//추상 메소드에 throws 절을 추가한 대출 가능 인터페이스
//구현 클래스에 throws 절을 사용할 경우
//인터페이스에서도 throws절을 작성해 주어야 한다.
//부모 클래스의 메소드보다 더 큰 범위의 예외를 선언할 수 없습니다.
package ex08_17_interface_exception;
public interface Lendable {
	final static byte STATE_BORROWED = 1; // 대출 중
	final static byte STATE_NORMAL = 0; // 대출되지 않는 상태
	void checkOut(String borrower, String date);
	void checkIn();
}
