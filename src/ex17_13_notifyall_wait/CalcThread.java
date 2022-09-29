//파이를 계산하는 스레드
package ex17_13_notifyall_wait;

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
			//계산 결과를 공유 영역에 저장
			sharedArea.setResult(total * 4);
		    
			//SharedArea 객체의 isReady 필드 값을 true로 설정
			sharedArea.setReady(true);	
			
		    synchronized (sharedArea) {	
				sharedArea.notifyAll(); //기다리고 있는 모든 스레드로 신호를 보냅니다
				//sharedArea.notify(); //wait중인 쓰레드 중 하나에게만 신호가 보내집니다.
		    }
	 }
}
