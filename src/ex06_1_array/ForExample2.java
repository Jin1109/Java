package ex06_1_array;

public class ForExample2 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		
		//항상된 for문, 확장 for 문 (jdk 1.5이상)
		for (int num : arr) {
			System.out.println(num);
		}
		System.out.println("End.");
	}
}
