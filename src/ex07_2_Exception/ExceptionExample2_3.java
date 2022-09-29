//unchecked exception에 해당 - 커파일 에러 없음
//실행시 에러 발생 - 예외발생
package ex07_2_Exception;
class ExceptionExample2_3 {
	public static void main(String[] args) {
		int num1 = 3, num2 = 0;
		try {
			int result = num1 / num2;
			System.out.println(result);
		}catch (ArithmeticException e) {
			//ArithmeticException객체에 있는 에러 메시지를 가져옵니다.
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}
