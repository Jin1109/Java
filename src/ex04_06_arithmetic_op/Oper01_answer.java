//��� ������ ��뿹
package ex04_06_arithmetic_op;
public class Oper01_answer {
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
		
		// a/b = 2.5�� ����� ���ô� 
		System.out.println("a/b = " + a/b);
		System.out.println("(double)(a/b) = " + (double)(a/b));
		System.out.println("(double)a = " + (double)a);
		System.out.println("(double)a/b = " + (double)a/b);
		System.out.println("a/(double)b = " + a/(double)b);
		System.out.println("(double)a/(double)b = "
										+ (double)a/(double)b);
		System.out.println(a + "/" + b + "=" + (double)a/b);
		
		double d;
		d = (double)a/b;
		System.out.println(a + "/" + b + "=" + d);
	}
}
