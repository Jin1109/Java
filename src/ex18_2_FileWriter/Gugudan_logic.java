//FileWriter Ŭ������ �̿��ؼ� ���� �����͸� ���Ͽ� ���� ���α׷�
package ex18_2_FileWriter;
public class Gugudan_logic {
	public static void main(String[] args) {
		
		// �� title���
		for (int dan = 2; dan <= 9; dan++) {
			System.out.print("[" + dan + "��]" + "\t");
		}
		
		System.out.println("\n");
		for (int i = 1; i <= 9; i++) {
			for (int j =2; j <=9; j++) { // �� �� ���
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
			}
			System.out.print("\n");
		}
	}
}
