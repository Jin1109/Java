//FileWriter 클래스를 이용해서 문자 데이터를 파일에 쓰는 프로그램
package ex18_2_FileWriter;
public class Gugudan_logic {
	public static void main(String[] args) {
		
		// 단 title출력
		for (int dan = 2; dan <= 9; dan++) {
			System.out.print("[" + dan + "단]" + "\t");
		}
		
		System.out.println("\n");
		for (int i = 1; i <= 9; i++) {
			for (int j =2; j <=9; j++) { // 각 단 출력
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
			}
			System.out.print("\n");
		}
	}
}
