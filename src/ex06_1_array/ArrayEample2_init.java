package ex06_1_array;

public class ArrayEample2_init {
	public static void main(String[] args) {
		int arr[]; // 배열 변수 선언
		arr = new int[10]; // 배열 생성 : 생성과 동시에 자동적으로 자신의 타입에
						   // 해당하는 기본값으로 초기화 됩니다.
						   // 10개까지 공간을 만든다 
		
		for (int i = 0; i < 10; i++)
			System.out.println("arr[" + i + "]=" + arr[i]);
		
		System.out.println("=================================");
		
		// arr.length;배열의 크기
		for (int i = 0; i < arr.length; i++)
			System.out.println("arr[" + i + "]=" + arr[i]);
		
	}
			
}
