//checked exception에 해당 - 컴파일 에러 발생
//해결책 : try-catch 무능로 처리 또는 메서드 밖으로 던짐
package ex07_2_Exception;
class ExceptionExample1_2 {
	public static void main(String[] args) {
		int sum = 1 + 2;
		try {
		if (sum < 0) {
			throw new Exception("에러 발생");
		}
		System.out.println(sum);
		} catch (Exception e) {
			System.out.println("[catch]"+e.getMessage());
		}
		
	}
}
