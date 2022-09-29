//checked exception�� ������ �޼ҵ�
//������ ���� �߻�
//throws Exception�� ���� �޼��� ȣ��� try-catch������ ó��
package ex07_2_Exception;
class ExceptionExample3_3 {
	public static void main(String[] args) {
		
		try {
			int result = add(1, -2);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//throws Exception : throws�� ���� �߻��ѿ����� ȣ���� �޼���� �ѱ�ϴ�. 
	static int add(int a, int b) throws Exception {
		int result = a + b;
		if (result < 0)
			throw new Exception("0���� �۾� ���� �߻��մϴ�.");//12�� ���ο��� ��µȴ�
		System.out.println("���� ����� �ɱ��?");// ��µ��� �ʴ´�
		return result;
		}
	
}
