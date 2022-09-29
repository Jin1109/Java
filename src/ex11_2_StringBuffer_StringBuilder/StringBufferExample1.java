/*
StringBuffer�� ��Ƽ�����忡 �����ϵ��� ����ȭ�Ǿ� �ֽ��ϴ�.
����ȭ�� ���� ������ ��� �߿� �� ���� �����͸�
�ٸ� ������(���� ���� ���α׷��� ���μ������ �ϸ� ���μ����� �����ϴ� ���� �۾� ����)��
������� ���ϵ��� ����� ���� �ǹ��մϴ�.
��Ƽ������� �ۼ��� ���α׷��� �ƴ� ��� StringBuffer�� ����ȭ��
���ʿ��ϰ� ���ɸ� ����߸��� �Ǿ� StringBuffer���� �������� ����ȭ�� �A
StringBuilder�� �߰��Ǿ����ϴ�.
StringBuilder�� StringBuffer�� �Ȱ��� ������� �ۼ��Ǿ� �ֽ��ϴ�.

1. ���ڿ� ���� ������ �� �ִ� mutable(����) �Դϴ�.
2. �⺻ 16���� ũ��� ������ ���۸� �̿��Ͽ�, ũ�⸦ ������ų �� �ֽ��ϴ�.
 */
package ex11_2_StringBuffer_StringBuilder;
class StringBufferExample1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("���ع��� ��λ��� ������  ");
	      //���� ���ڿ��� �߰���
	      System.out.println(sb.append("�⵵�� �����ϻ� "));
	      
	      //index�� 19�� ���� "�ϴ����� �ϴ����� "�� ����
	      System.out.println(sb.insert(19, "�ϴ����� �ϴ����� "));
	      
	      //index�� 24���� 27���� ���ڿ� ����
	      System.out.println(sb.delete(24, 28));
	      
	      //index�� 9�� ���� ���� �ϳ� ���� ����
	      System.out.println(sb.deleteCharAt(9));
	      
	      System.out.println(sb.toString());
	}
}