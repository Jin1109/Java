//Thread�� �̿��� ��
package ex17_02_Thread_sleep;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep_date extends Thread {
	public void run() {
		SimpleDateFormat s = new SimpleDateFormat ( "yyyy�� MM��dd�� HH��mm��ss��");
		for (;;) {
			Date d = new Date(); // ���� �ý��� ��¥�� �ð�
			System.out.println(s.format(d));
			try {
				Thread.sleep(1000); // 1��
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		 			
	}
}
