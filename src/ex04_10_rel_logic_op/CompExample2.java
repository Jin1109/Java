package ex04_10_rel_logic_op;

public class CompExample2 {
	public static void main(String[] args) {
		int a = 10, b = 4;
		boolean test; // true �� flase ���� ���´�
		
		test = a > b; //10 > 4
		System.out.println(a + ">" + b + "=" + test);
		
		test = a < b; //10 < 4
		System.out.println(a + "<" + b + "=" + test);
		
		//��������� a+b, a-b ���� �� �� ���� ��
		System.out.println(a + b > a - b);//14 > 6
		
		
	}
}