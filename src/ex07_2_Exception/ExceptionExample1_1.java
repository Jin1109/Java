//checked exception에 해당 - 컴파일 에러 발생
//해결책 : try-catch 무능로 처리 또는 메서드 밖으로 던짐
package ex07_2_Exception;
class ExceptionExample1_1 {
	public static void main(String[] args) {
		int sum = 1 + -2;
		if (sum < 0) {
			//throw는 에러를 발생시키는 키워드 입니다.
			throw new Exception("에러 발생");//Exception 객체 생성
		}
		
		System.out.println(sum);
	}
}
