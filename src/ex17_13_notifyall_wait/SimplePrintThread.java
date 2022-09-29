//파이 소수점 두자리까지 출력하는 클래스
package ex17_13_notifyall_wait;
public class SimplePrintThread extends Thread {
	private SharedArea sharedArea;
	SimplePrintThread(SharedArea sharedArea) {
		this.sharedArea=sharedArea;
	}
	public void run() {
		if (sharedArea.isReady() !=true) {
			synchronized (sharedArea) {
				try {
					sharedArea.wait(); //신호를 기다립니다
				}
				catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}//catch end
			}//동기화 end
		}//if end
		System.out.printf("SimplePrintThread : %.2f %n" , sharedArea.getResult());
	}
}
