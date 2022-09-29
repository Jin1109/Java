//파이를 출력하는 클래스
package ex17_12_notify_wait;

public class PrintThread extends Thread{
	private SharedArea sharedArea;

	PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
		
	public void run() {
		if (sharedArea.isReady() != true) { //파이가 계산 중인 경우
			/* 이전의 방식 - 파이 계산이 끝날때 까지 계속 체크해야 했스빈다.
			 * while (sharedArea.isReady != true) {
			 		System.out.printLn("실행중 ~");
			 	}
			 */
			try {
				synchronized (sharedArea) {
					sharedArea.wait();//다른 스레드로 부터 신호를 기다립니다.
							//파이의 계산이 끝나면 다른 스레드에서 신호를 보냅니다.
					
				}
			}//try end
			catch (InterruptedException e) { //wait 메소드가 발생하는 익셉션 처리
				System.out.println(e.getMessage());
			}// catch end
		}//if end
		
		System.out.println(sharedArea.getResult());
		}//run end
}//class end
