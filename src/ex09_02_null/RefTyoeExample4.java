//obj������ null�̶�� �������� �ֱ� ������ ������ ������ ������
//����� ���� �߻�(��Ÿ�� ���� �߻�)
package ex09_02_null;
public class RefTyoeExample4 {
	public static void main(String[] args) {
		Point obj = null;	//NullPointerException
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}
