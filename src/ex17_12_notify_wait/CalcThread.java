//파이를 계산하는 스레드
package ex17_12_notify_wait;

public class CalcThread extends Thread {
	private SharedArea sharedArea;
	
	public CalcThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
	
	 public void run() {
			double total = 0.0;
			for (int cnt = 1; cnt < 1000000000; cnt += 2)
				if (cnt / 2 % 2 == 0)
					total += 1.0 / cnt;
				else
					total -= 1.0 / cnt;
			sharedArea.setResult(total * 4);
		    sharedArea.setReady(true);	//파이 계산 끝났다라는 의미
		    
		    synchronized (sharedArea) {
				sharedArea.notify(); //다른 스레드로 신호를 보내는 메소드
		    }
	 }
}
