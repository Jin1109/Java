//unchecked exception�� �ش� - Ŀ���� ���� ����
//����� ���� �߻� - ���ܹ߻�
package ex07_2_Exception;

class ExceptionExample2_4 {
	public static void main(String[] args) {
		int num1 = 3, num2 = 0;
		
		try {
			int result = num1 / num2;
			System.out.println(result);
		}catch (ArithmeticException e) {
			//ArithmeticException��ü�� �ִ� ���� �޽����� �����ɴϴ�.
			String message = e.getMessage();
			System.out.println(message);
		}finally {
			System.out.println("������� �Ծ��~");
		}
	}
}
