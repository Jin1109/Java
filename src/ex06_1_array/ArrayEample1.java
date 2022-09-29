package ex06_1_array;

public class ArrayEample1 {
	public static void main(String[] args) {
		int[] arr;			//배열 변수를 선언 stack arr
		arr = new int[10];	//배열 생성 0~9 10개의 공간을 가진 배열 생성
		
		//배열 사용
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = arr[0] + arr[1];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[9]);
		
		//java.lang.ArrayIndexOutOfBoundsException: Index 10
		// 10번의 배열이 없기 때문에 오류가 발생한다
		System.out.println(arr[10]);//오류 발생
	}
			
}
