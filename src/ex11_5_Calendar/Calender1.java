/*
 Calendar�� �߻� Ŭ������ �̷��� ����� �� �����ϴ�.
 1. Calender c = new Calendar();
 
 2. Calender ���� �ΰ���
 	�ϳ�)���� �޼ҵ带 �̿��ؼ� ����ϴ� ���
 		Calender c1 = Calender.getInstance();
 		getInstance() : Calender Ŭ������ ������ Ŭ������ �ν��Ͻ��� ��ȯ
 		getInstance() �޼ҵ�� �޷� �ʵ尡 ���� ��¥ �� �ð����� �ʱ�ȭ �� Calender ��ü�� ��ȯ�մϴ�.
 	��)��ĳ���� ���(�ڽ��� �ּҸ� �θ��� �ڷ����� ���� ������ ����)
 		Calender c2 = new GregorianCalender();
 */
package ex11_5_Calendar;
import java.util.*;
public class Calender1 {
	public static void main(String[] args) {
		//�⺻������ ���糯¥�� �ð����� �����˴ϴ�.
		Calendar today = Calendar.getInstance();
		
		System.out.println("�� ���� �⵵ : " + today.get(1));//public final staic int YEAR = 1;
		
		System.out.println("��(0~11, 0:1��): " + today.get(2));//public final staic int MONTH = 2;
		
		System.out.println("��(0~11, 0:1��): "
							+ (today.get(Calendar.MONTH) + 1));
		
		System.out.println("�� ���� �� ° ��: "
				+ today.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("�� ���� �� ° ��: "
				+ today.get(Calendar.WEEK_OF_MONTH));
		
		// DATE�� DAY_OF_MONTH�� ����.
		System.out.println("�� ���� ��ĥ: "
				+ today.get(Calendar.DATE));
		
		
		System.out.println("�� ���� ��ĥ: "
				+ today.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("�� ���� ��ĥ: "
				+ today.get(Calendar.DAY_OF_YEAR));
		
		
		// 1:�Ͽ���, 2:������, ... 7:�����
		System.out.println("����(1~7, 1:�Ͽ���): "
				+ today.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("�� ���� ��� ���� ����): "
				+ today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("����_����(0:���� 1:����): "
				+ today.get(Calendar.AM_PM));
		
		System.out.println("�ð�(0~11): "
				+ today.get(Calendar.HOUR));
		
		
		System.out.println("�ð�(0~23): "
				+ today.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("��(0~59): "
				+ today.get(Calendar.MINUTE));
		
		System.out.println("��(0~59): "
				+ today.get(Calendar.SECOND));
		
		//�� ���� ������ ���� ã�´�.
		System.out.println("�� ���� ������ ��: "
				+ today.getActualMaximum(Calendar.DATE));
		
		System.out.println("1000���� 1��(0~999): "
				+ today.get(Calendar.MILLISECOND));
	}
}
