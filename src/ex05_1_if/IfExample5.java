/*
 * 정수형 변수 num을 선언하고 정수값을 입력받아 저장합니다.
 * 1. 입력받은 값이 10미만이면				"num의 값은 10 미만입니다."
 * 2. 입력받은 값이 10이상, 100 미만이면		"num의 값은 10 이상, 100 미만입니다."
 * 3. 입력받은 값이 100이상이면, 1000 미만이면	"num의 값은 100이상, 1000 미만입니다."
 * 4. 입력받은 값이 1000이상이면				"num의 값은 1000 이상입니다."
 * 
 * 
 * if() {
 * 
 * }else if() {
 * 
 * }else if() {
 * 
 *  )else{
 *  
 *  }
 */
package ex05_1_if;

import java.util.Scanner;

public class IfExample5 {
	public static void main(String[] args) {
		System.out.println("수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num < 10) {
			System.out.println("num의 값은 10 미만입니다.");
		}else if (num <100) {
			System.out.println("num의 값은 10 이상, 100 미만입니다.");
		}else if (num <1000) {
			System.out.println("num의 값은 100 이상, 1000 미만입니다.");
		}else {
			System.out.println("num의 값은 1000 이상입니다.");
		}
		
			sc.close();
			
	}
}
