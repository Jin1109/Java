package ex08_14_01_interface;
public interface Lendable {
	//대출한다
	public abstract void checkOut(String borrower, String date);
	
	//반납한다
	public abstract void checkIn();
}
