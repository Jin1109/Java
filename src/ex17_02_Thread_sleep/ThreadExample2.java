//���ĺ��� ���ڸ� ����ϴ� ���α׷�
package ex17_02_Thread_sleep;
public class ThreadExample2 {
	public static void main(String[] args) {
		Thread thread = new DigitThread();
		thread.start();
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
				System.out.print(ch);
			try {
				Thread.sleep(1000);
				//sleep �޼ҵ� : ���� �ð��� ����Ǳ⸦ ��ٸ��� �޼ҵ�.
				//public static void sleep(long millis) throws InterruptedException
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}//catch end
		}//for end
	}//main end
}//class end
