//checked exception�� �ش� - ������ ���� �߻�
//�ذ�å : try-catch ���ɷ� ó�� �Ǵ� �޼��� ������ ����
package ex07_2_Exception;
class ExceptionExample1_1 {
	public static void main(String[] args) {
		int sum = 1 + -2;
		if (sum < 0) {
			//throw�� ������ �߻���Ű�� Ű���� �Դϴ�.
			throw new Exception("���� �߻�");//Exception ��ü ����
		}
		
		System.out.println(sum);
	}
}
