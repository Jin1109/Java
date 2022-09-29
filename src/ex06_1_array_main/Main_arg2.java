/*
 실행방법
  1. 이클립스에서 실행 순서(146페이지)
  	 1) 해당소스에서 Ctrl + F11
  	 2) Package Explorer에서 소스를 선택 후 오른쪽 마우스 버튼 클릭
  	 	-> Run as -> Run Configurations
  	 	-> 오른쪽 화면의 Arguments탭 선택 후
  	 	-> Program arguments 상자에서 값을 입력합니다.
  	 	-> 두개 이상 사용시에는 blank 또는 엔터로 구분합니다.
  	 				  만약 공백이 들어간 문자열인 경우 도블코드(")안에 문자열을 넣습니다.
  	 				  대한 민국 만세
 2. cmd 창에서 실습
   	 1) Java프로젝트 경로의 bin폴더로 이동
   	 2) java 패키지명.클래스이름 대한 민국 만세 입력 후 엔터
   	 	 예)C:\Users\JIN\Desktop\eclipse-workspace\Java\bin>java ex06_1_array_main.Main_arg1 대한 민국 만세
   	 	 cd C:\Users\JIN\Desktop\eclipse-workspace\Java\bin
   	 	 java ex06_1_array_main.Main_arg1 대한 민국 만세
 */

package ex06_1_array_main;

public class Main_arg2 {
	public static void main(String[] args) {
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}
}
