package ex17_06_SharedArea_Problem;

public class PrintThread extends Thread {
	private SharedArea sharedArea;

	PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
		
	public void run() {
		//���� ������ ������ ����մϴ�.
		System.out.println("���� ������ ������ = " + sharedArea.getResult());
		       }
}
