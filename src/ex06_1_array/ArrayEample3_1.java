//�� �� ����� ������ �ʱ�ȭ
package ex06_1_array;

public class ArrayEample3_1 {
	public static void main(String[] args) {
		//���1.
		System.out.println("==== ��� 1 ====");
		
		int arr[]; 			// �迭  ����
		arr = new int[5];	// �迭 ���� 
		//�迭 ���
		arr[0]=10;arr[1]=20;arr[2]=30;arr[3]=40;arr[4]=50;
						   
		//�迭���
		System.out.println("arr[0]=" + arr[0]);
		System.out.println("arr[1]=" + arr[1]);
		System.out.println("arr[2]=" + arr[2]);
		System.out.println("arr[3]=" + arr[3]);
		System.out.println("arr[4]��=" + arr[4]);
		
		// arr.length;�迭�� ũ��
		for (int i = 0; i < arr.length; i++)
			System.out.println("arr[" + i + "]=" + arr[i]);
		
	}
			
}
