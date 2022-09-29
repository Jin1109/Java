package ex17_07_SharedArea_solution;

public class PrintThread extends Thread{
	private SharedArea sharedArea;

	PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
		
	public void run() {
		//SharedArea객체의 isReady 필드 값이 true될때 까지 반복한다.
		while (sharedArea.isReady() != true) {
			System.out.println("실행중 ~");
		}
		
		//공유 영역의 데이터 출력합니다.
		System.out.println("공유 영역의 데이터 = " + sharedArea.getResult());
		}//run end
}//class end
