/*
 * String names[]= {"ȫ�浿", "����ġ", "ȫ�浿", "�������", "��浿");
 * 
 *  ����1. �迭 ����� �� �Է��� ���
 *  ������ȭ��)
 *  �̸�:ȫ�浿
 *  Ȧ�浿��(��) �迭�� �ε��� 2���� ã�ҽ��ϴ�.
 *  
 *  ����2. �迭 ����� ���� �ƴ� �����͸� �Է��� ���
 *  ������ȭ��)
 *  �˻��� �̸��� �Է��ϼ���/
 *  �̸�:HTA
 *  HTA(��) �迭�濡�� ã�� ���߽��ϴ�.
 */

package ex06_1_array;

import java.util.Scanner;

public class ArrayEample06_2_back_String {
	public static void main(String[] args) {
		
		// String names[]= {"ȫ�浿", "����ġ", "ȫ�浿", "�������", "��浿"}; �Ʒ��� ���� �ǹ�
		String[] names =
				new String[] {"ȫ�浿", "����ġ", "ȫ�浿", "�������", "��浿"};
		Scanner sc = new Scanner(System.in);// Scanner���� Ctrl+Shift+o Ŭ��
		int index = -1;
		
		System.out.println("�˻��� �̸��� �Է��ϼ���");
		System.out.println("�̸�:");
		String inputname = sc.next();
		
		for (int i = names.length-1; i >=0; --i) {//i=4, 3, 2, 1, 0 0���� �����ϱ� ������ -1�� �Ѵ�
			if (inputname.equals(names[i])) {
				index = i; // ������ �ε��� ��ġ���� ���� �Է��� �̸��� ���� �̸��� ã���ϴ�.
				break;     // �Է��� �̸��� ���� �̸��� ã���� �ݺ��� ����ϴ�.
			}
		}
		
		// �Է��� �̸��� �迭�� �̸��� ã���� ��
		if (index != -1) {
			System.out.println(inputname + "��(��) �迭�� �ε��� " + index + "ã�ҽ��ϴ�.");
		}else	//ã�� ������ ��
			System.out.println(inputname + "��(��) �迭�濡�� ã�� ���߽��ϴ�.");
		
		sc.close();
		
		
	}
			
}
