package ex03_4_consting;

public class Casting1_int_float3 {
	public static void main(String[] args) {
		
		//2. ����� ����ȯ
		double d2=10.12345;
		//int d2=10.12345;
		
		//	���� �߻� - Type mismatch: cannot convert from double to int
		//int i2 = d2;	//������ ������ �Ǽ��� ���� ������ �� �����ϴ�.
		
		//double -> int
		int i2 = (int) d2;	//������ ������ �Ǽ��� ���� ������ �� �����ϴ�.
		
		System.out.println("i2 �����ʹ� " + i2 + "�Դϴ�.");
	}
		
}
