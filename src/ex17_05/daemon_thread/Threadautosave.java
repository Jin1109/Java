/* 쓰레드는 일반 쓰레드와 데몬 쓰레드로 나뉩니다.
*
* 데몬 쓰레드 (daemon thread)는
   다른 일반 쓰레드(데몬 쓰레드가 아닌 쓰레드)의 작업을 돕는 보조적인 역할을 수행하는 쓰레드입니다.
   일반 쓰레드가 모두 종료되면 데몬 쓰레드는 강제적으로 자동 종료됩니다.
   데몬 쓰레드는 일반 쓰레드의 보조 역할을 수행하므로 일반 쓰레드가 모두 종료되고 나면 데몬 쓰레드의 존재의 의미가 없기 때문입니다.
   이 점을 제외하고는 데몬 쓰레드와 일반 쓰레드는 다르지 않습니다.
   데몬 쓰레드의 예로는 가비지 컬렉터, 워드프로세서의 자동저장, 화면자동갱신 등이 있습니다.
   
   데몬 쓰레드는 무한루프와 조건문을 이용해서 실행 후 대기하고 있다가 특정 조건이 만족되면 작업을 수행하고 다시 대기하도록 작성합니다.

 *데몬 쓰레드 사용법
   쓰레드 생성 -> 반드시 setDaemon (true) 메서드 호출 -> start () 메서드 호출
   void setDaemon (boolean on) : true (데몬 쓰레드로 설정),
                          false(일반 쓰레드로 설정)
*/   
package ex17_05.daemon_thread;

public class Threadautosave implements Runnable {
	static boolean autoSave = false;
	public void run() {
		while (true) {
			try {
				Thread.sleep(3 * 1000); // 3초마다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// autoSave의 값이 true이면 autoSave()를 호출한다.
			if (autoSave) {
				autoSave();
			}
		}
	}
	
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
	
}
