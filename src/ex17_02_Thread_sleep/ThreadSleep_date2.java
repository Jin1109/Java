package ex17_02_Thread_sleep;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep_date2 {
	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				SimpleDateFormat s = new SimpleDateFormat ( "yyyy년 MM월dd일 HH시mm분ss초");
				for (;;) {
					Date d = new Date(); // 오늘 시스템 날짜와 시간
					System.out.println(s.format(d));
					try {
						Thread.sleep(1000); // 1초
					}catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				} 			
			}
		};
		
		t.start();
	}
}
