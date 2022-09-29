package ex07_2_Exception;
class ExceptionExample1_0 {
	public static void main(String[] args) {
		int sum = 1 + -2;
		if (sum < 0) {
			new Exception("俊矾 惯积");//Exception 按眉 积己
		}
		
		System.out.println(sum);
	}
}
