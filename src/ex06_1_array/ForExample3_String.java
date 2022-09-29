package ex06_1_array;

public class ForExample3_String {
	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "세종대왕" };
		
		//항상된 for문, 확장 for 문 (jdk 1.5이상)
		for (String name : names) { // names의 첫번째 요소 값부터 차례대로 name 변수에 저장합니다.
			System.out.println(name);
		}
		// 기준 for문
		for(int i = 0; i < names.length; i++)
			System.out.println(names[i]);
	}
}
