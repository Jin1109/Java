//��� ������ ��뿹
package ex04_06_arithmetic_op;
public class Oper01_0 {
	public static void main(String[] args) {
		/*
		 * 1. ������ : ����(���� ���� ������ ��Ģ�� �ٶ� ����ϴ� ��) �� �����ϴ� ��ȣ
		 * 		��) + - * /
		 * 2. �ǿ����� : ������ ���
		 * 
		 * 3. �� : �����ڿ� �ǿ����ڸ� �����Ͽ� ����ϰ��� �ϴ� �ٸ� ǥ���� ��
		 * 		��) x + 3
		 * 		x�� 3�� �ǿ�����, +�� ������
		 * 
		 * 4. ���� ����Ͽ� ����� ��� ���� ���� ��(evaluation) �Ѵٰ� �մϴ�.
		 */
		//������(int) ���� a,b,c�� �����մϴ�.
		//a=10, b=4�� �ʱ�ȭ �մϴ�.
		int a = 10, b = 4, //c = 14;
		
		c = a + b;	// c=14;
		System.out.println(a + "+" + b + "=" + c);
		
		c = a - b;	// c=6;
		System.out.println(a + "-" + b + "=" + c);
		
		c = a * b;	// c=40;
		System.out.println(a + "*" + b + "=" + c);
		
		c = a / b;	// c=2;
		System.out.println(a + "/" + b + "=" + c);
		
		c = a % b;	// c=2;	(������) �����θ� ���´�
		System.out.println(a + "%" + b + "=" + c);
		System.out.printf("%d %% %d = %d",a,b,c);
		
		// a/b = 2.5�� ����� ���ô� 
		// �������� �غ�����
		
	}
}
