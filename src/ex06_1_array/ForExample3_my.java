package ex06_1_array;

public class ForExample3_my {
	public static void main(String[] args) {
		String arr[] = { "일기동", "이길동", "삼길동", "사길동", "오길동" };
		
		//항상된 for문, 확장 for 문 (jdk 1.5이상)
		for (String num : arr) {
			System.out.println(num);
		}
		System.out.println("End.");
	}
}
