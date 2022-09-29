//���� �Ҽ��� ���ڸ����� ����ϴ� Ŭ����
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
					sharedArea.wait(); //��ȣ�� ��ٸ��ϴ�
				}
				catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}//catch end
			}//����ȭ end
		}//if end
		System.out.printf("SimplePrintThread : %.2f %n" , sharedArea.getResult());
	}
}
