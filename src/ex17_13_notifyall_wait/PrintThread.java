//파이를 간단하게 출력하는 클래스
package ex17_13_notifyall_wait;

public class PrintThread extends Thread{
	private SharedArea sharedArea;

	PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
		
	public void run() {
		if (sharedArea.isReady() != true) { //파이가 계산 중인 경우
			try {
				synchronized (sharedArea) {
					sharedArea.wait();//신호를 기다립니다.
				}
			}//try end
			catch (InterruptedException e) { //wait 메소드가 발생하는 익셉션 처리
				System.out.println(e.getMessage());
			}// catch end
		}//if end
		
		System.out.println("PrintThread : " + sharedArea.getResult());
		}//run end
}//class end
