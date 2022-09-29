package ex08_16_interface_constant;
public interface Lendable {
	final static byte STATE_BORROWED = 1; // 대출 중
	final static byte STATE_NORMAL = 0; // 대출되지 않는 상태
	void checkOut(String borrower, String date);
	void checkIn();
}
