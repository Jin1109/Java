package ex06_1_array;

public class ForExample3_String {
	public static void main(String[] args) {
		String[] names = { "ȫ�浿", "�̼���", "�������" };
		
		//�׻�� for��, Ȯ�� for �� (jdk 1.5�̻�)
		for (String name : names) { // names�� ù��° ��� ������ ���ʴ�� name ������ �����մϴ�.
			System.out.println(name);
		}
		// ���� for��
		for(int i = 0; i < names.length; i++)
			System.out.println(names[i]);
	}
}
