/*
 * String names[]= {"홍길동", "전우치", "홍길동", "세종대왕", "김길동");
 * 
 *  실행1. 배열 요소의 값 입력한 경우
 *  실행결과화면)
 *  이름:홍길동
 *  홀길동는(은) 배열의 인덱스 2에서 찾았습니다.
 *  
 *  실행2. 배열 요소의 값이 아닌 데이터를 입력한 경우
 *  실행결과화면)
 *  검색할 이름을 입력하세요/
 *  이름:HTA
 *  HTA(은) 배열방에서 찾지 못했습니다.
 */

package ex06_1_array;

import java.util.Scanner;

public class ArrayEample06_2_back_String {
	public static void main(String[] args) {
		
		// String names[]= {"홍길동", "전우치", "홍길동", "세종대왕", "김길동"}; 아래와 같은 의미
		String[] names =
				new String[] {"홍길동", "전우치", "홍길동", "세종대왕", "김길동"};
		Scanner sc = new Scanner(System.in);// Scanner위에 Ctrl+Shift+o 클릭
		int index = -1;
		
		System.out.println("검색할 이름을 입력하세요");
		System.out.println("이름:");
		String inputname = sc.next();
		
		for (int i = names.length-1; i >=0; --i) {//i=4, 3, 2, 1, 0 0부터 시작하기 때문에 -1을 한다
			if (inputname.equals(names[i])) {
				index = i; // 마지막 인덱스 위치에서 부터 입력한 이름과 같은 이름을 찾습니다.
				break;     // 입력한 이름과 같은 이름을 찾으면 반복문 벗어납니다.
			}
		}
		
		// 입력한 이름과 배열의 이름을 찾았을 떄
		if (index != -1) {
			System.out.println(inputname + "는(은) 배열의 인덱스 " + index + "찾았습니다.");
		}else	//찾지 못했을 때
			System.out.println(inputname + "는(은) 배열방에서 찾지 못했습니다.");
		
		sc.close();
		
		
	}
			
}
