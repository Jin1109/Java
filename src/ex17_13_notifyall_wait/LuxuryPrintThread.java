//파이를 이쁘게 출력하는 메소드
package ex17_13_notifyall_wait;
public class LuxuryPrintThread extends Thread{
	private SharedArea sharedArea;
	LuxuryPrintThread(SharedArea sharedArea) {
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
		System.out.println("*** π =" + sharedArea.getResult() + " ***");
		// : ㅎ+한자키
	}//run end
}//class end
