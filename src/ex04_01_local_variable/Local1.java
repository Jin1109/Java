package ex04_01_local_variable;
/*
 * Ȥ�� main(String[] arg) �� main (String arg[]) �� �������� �ֳ���
 * -������ �����ϴ�.
 */
//local variable - method �ȿ� ���ǵ� ����
public class Local1 {
	
	public static void main(String[] args) {//args �������̹Ƿ� �ƹ��ų� �־ �����Ѵ�.
		int num;	//local variable	(���� �ȿ����� ��밡���ϴ�)
		num = 10 + 20;
		System.out.println(num);
	}
}
