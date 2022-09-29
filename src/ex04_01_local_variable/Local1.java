package ex04_01_local_variable;
/*
 * 혹시 main(String[] arg) 와 main (String arg[]) 의 차이점이 있나요
 * -차이자 없습니다.
 */
//local variable - method 안에 정의된 변수
public class Local1 {
	
	public static void main(String[] args) {//args 변수명이므로 아무거나 넣어도 동작한다.
		int num;	//local variable	(여기 안에서만 사용가능하다)
		num = 10 + 20;
		System.out.println(num);
	}
}
