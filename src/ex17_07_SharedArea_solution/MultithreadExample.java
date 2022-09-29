package ex17_07_SharedArea_solution;

public class MultithreadExample {
	public static void main(String[] args) {
		// 굥유 영역 객체를 생성해서 그 객체의 참조값을 두 스레드의 필드에 저장합니다.
		SharedArea obj = new SharedArea();
		CalcThread thread1 = new CalcThread(obj);
		PrintThread thread2 = new PrintThread(obj);
		
		thread1.start();
		thread2.start();
	}
}
