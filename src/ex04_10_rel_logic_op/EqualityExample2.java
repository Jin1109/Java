//���� ������
package ex04_10_rel_logic_op;

public class EqualityExample2 {
	public static void main(String[] args) {
		String s1 = "�ڹ�";
		
	// ������ ������ �ּҰ��� �����Ѵ�. 
	//	Ŭ����	������ ����	������		������ȣ��	
		String	s2		   = new		String("�ڹ�");
		System.out.println("s1=" + s1 + " s2" + s2);
		
		// �ּҰ� ������ ��
		if (s1 == s2) {
			System.out.println("���� �ּ�");
		}
		else {
			System.out.println("�ٸ� �ּ�");
		}
		
		// ���밪 ������ ��
		if (s1.equals(s2)) {
			System.out.println("���� ��");
		}
		else {
			System.out.println("�ٸ� ��");
		}
		
	}
}