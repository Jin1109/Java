package ex08_14_01_interface;
public interface Lendable {
	//�����Ѵ�
	public abstract void checkOut(String borrower, String date);
	
	//�ݳ��Ѵ�
	public abstract void checkIn();
}
