//StringBuffer���� ��Ƽ�������� ����ȭ�� �� StringBuilde�� �߰� �Ǿ����ϴ�. 
package ex11_2_StringBuffer_StringBuilder;
class StringBuilderExample1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("���ع��� ��λ��� ������  ");
	      
	      System.out.println(sb.append("�⵵�� �����ϻ� "));//���� ���ڿ��� �߰���
	      System.out.println(sb.insert(19, "�ϴ����� �ϴ����� "));//index�� 19�� ���� "�ϴ����� "�� ����
	      System.out.println(sb.delete(24, 28));	//index�� 24���� 27���� ���ڿ� ����
	      System.out.println(sb.deleteCharAt(9));	//index�� 9�� ���� ���� �ϳ� ����
	      System.out.println(sb.append("�⵵�� �����ϻ� ").delete(0, 5));
	}
}
