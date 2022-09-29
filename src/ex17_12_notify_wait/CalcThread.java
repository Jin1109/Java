//���̸� ����ϴ� ������
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
		    sharedArea.setReady(true);	//���� ��� �����ٶ�� �ǹ�
		    
		    synchronized (sharedArea) {
				sharedArea.notify(); //�ٸ� ������� ��ȣ�� ������ �޼ҵ�
		    }
	 }
}