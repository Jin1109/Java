/*
 * 자바에서는 실행도중에 발생하는 에러(런타임 에러)를 에러(Error)와 예외(Exception)으로 구분함
   Error : 프로그램 코드에 의해 수습될 수 없는 심각한 오류
   Exception : 프로그램 코드에 의해 수습될 수 있느 다소 미약한 오류
   
   
   Exception이 일어나는 상황
   (1) 정수를 0으로 나누는 경우
   (2) 배열의 index값이 음수 값을 가지거나 범위를 벗어나는 경우
   (3) 부적절한 형변환
   (4) 입출력하기 위한 파일이 존재하지 않는 경우
   (5) 메소드 호출시
   
 */
//unckecked exception에 해당 - 컴파일 에러 없음
//실행시 에러 발생 - 에외 발생
package ex12_1_Exception;

public class ExceptionExample2_1 {
	public static void main(String[] args) {
		try {
		int num1 = 3, num2 = 0;
		int result = num1 / num2;
		System.out.println(result);
		}catch(ArithmeticException e) {
			 String message = e.getMessage();
		    System.out.println(message);
		}finally{
			System.out.println("finally까지 왔어요~");
		}
	}
}
