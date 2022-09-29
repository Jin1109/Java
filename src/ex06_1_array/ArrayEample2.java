package ex06_1_array;

public class ArrayEample2 {
	public static void main(String[] args) {
		int[] arr;			//�迭 ������ ���� stack arr
		arr = new int[10];	//�迭 ����
		
		//�迭 ���
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = arr[0] + arr[1];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[9]);
		

		try {
		//java.lang.ArrayIndexOutOfBoundsException: Index 10
			System.out.println(arr[10]);
		}catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("�ε����� ������ ������ϴ�.~");
			System.out.println(e.getMessage());
		}
	}
			
}
