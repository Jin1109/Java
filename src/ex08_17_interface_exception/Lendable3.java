//�߻� �޼ҵ忡 throws ���� �߰��� ���� ���� �������̽�
//���� Ŭ������ throws ���� ����� ���
//�������̽������� throws���� �ۼ��� �־�� �Ѵ�.
//�θ� Ŭ������ �޼ҵ庸�� �� ū ������ ���ܸ� ������ �� �����ϴ�.
package ex08_17_interface_exception;

interface Lendable3 {
	final static byte STATE_BORROWED = 1; // ���� ��
	final static byte STATE_NORMAL = 0; // ������� �ʴ� ����
	
	abstract void checkOut(String borrower, String date) throws IOException;
		
	abstract void checkIn();
}
