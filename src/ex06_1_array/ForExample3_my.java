package ex06_1_array;

public class ForExample3_my {
	public static void main(String[] args) {
		String arr[] = { "�ϱ⵿", "�̱浿", "��浿", "��浿", "���浿" };
		
		//�׻�� for��, Ȯ�� for �� (jdk 1.5�̻�)
		for (String num : arr) {
			System.out.println(num);
		}
		System.out.println("End.");
	}
}
