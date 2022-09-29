//���̸� �����ϰ� ����ϴ� Ŭ����
package ex17_13_notifyall_wait;

public class PrintThread extends Thread{
	private SharedArea sharedArea;

	PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
		
	public void run() {
		if (sharedArea.isReady() != true) { //���̰� ��� ���� ���
			try {
				synchronized (sharedArea) {
					sharedArea.wait();//��ȣ�� ��ٸ��ϴ�.
				}
			}//try end
			catch (InterruptedException e) { //wait �޼ҵ尡 �߻��ϴ� �ͼ��� ó��
				System.out.println(e.getMessage());
			}// catch end
		}//if end
		
		System.out.println("PrintThread : " + sharedArea.getResult());
		}//run end
}//class end
