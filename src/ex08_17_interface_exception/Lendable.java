//�߻� �޼ҵ忡 throws ���� �߰��� ���� ���� �������̽�
//���� Ŭ������ throws ���� ����� ���
//�������̽������� throws���� �ۼ��� �־�� �Ѵ�.
//�θ� Ŭ������ �޼ҵ庸�� �� ū ������ ���ܸ� ������ �� �����ϴ�.
package ex08_17_interface_exception;
public interface Lendable {
	final static byte STATE_BORROWED = 1; // ���� ��
	final static byte STATE_NORMAL = 0; // ������� �ʴ� ����
	void checkOut(String borrower, String date);
	void checkIn();
}
