//checked exception�� �ش� - ������ ���� �߻�
//�ذ�å : try-catch ���ɷ� ó�� �Ǵ� �޼��� ������ ����
package ex07_2_Exception;
class ExceptionExample1_2 {
	public static void main(String[] args) {
		int sum = 1 + 2;
		try {
		if (sum < 0) {
			throw new Exception("���� �߻�");
		}
		System.out.println(sum);
		} catch (Exception e) {
			System.out.println("[catch]"+e.getMessage());
		}
		
	}
}
