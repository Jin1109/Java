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
public class Calender2_3_my {
	public static void main(String[] args) {
		//�⺻������ ���糯¥�� �ð����� �����˴ϴ�.
		Calendar today = Calendar.getInstance();
		
//		System.out.println(today.get(Calendar.YEAR) + '��'
//						+ (today.get(2)+1) + "�� " 
//						+ today.get(Calendar.DATE) + "�� " 
//						+ today.get(Calendar.AM) + " " 
//						+ today.get(Calendar.HOUR_OF_DAY) + "�ð�" 
//						+ today.get(Calendar.MINUTE) + "��" 
//						+ today.get(Calendar.SECOND) + "�� " 
//						+ today.get(Calendar.DAY_OF_WEEK) + "����");
		
//		
//		System.out.print(today.get(Calendar.YEAR) + '��');
//		System.out.print(today.get(Calendar.MONTH) + 1 + '��');
//		System.out.print(today.get(Calendar.DATE) + '��');
//		System.out.print(today.get(Calendar.AM) + " " );
//		System.out.println(today.get(Calendar.MINUTE) + "��" );
//		System.out.print(today.get(Calendar.DAY_OF_WEEK) + '��');
//		System.out.print(today.get(Calendar.DAY_OF_WEEK) + "����"
//		System.out.print("�Դϴ�.");
//		
		  int year = today.get(Calendar.YEAR);
	      int month = today.get(Calendar.MONTH);
	      int date = today.get(Calendar.DATE);
	      int hourofday = today.get(Calendar.HOUR_OF_DAY);
	      int minute = today.get(Calendar.MINUTE);
	      int second = today.get(Calendar.SECOND);
	      int dayofweek = today.get(Calendar.DAY_OF_WEEK);
	      
	      String kordayofweek = "";
	      switch(dayofweek) {
	         case 1 :
	            kordayofweek = "��";
	            break;
	            
	         case 2 :
	            kordayofweek = "��";
	            break;
	            
	         case 3 :
	            kordayofweek = "ȭ";
	            break;
	            
	         case 4 :
	            kordayofweek = "��";
	            break;
	            
	         case 5 :
	            kordayofweek = "��";
	            break;
	            
	         case 6 :
	            kordayofweek = "��";
	            break;   
	            
	         case 7 :
	            kordayofweek = "��";
	            break;
	            
	            }
	      
	      int ampm = today.get(Calendar.AM_PM);
	      
	      String korampm = "";
	      switch(ampm) {
	         case 0 :
	            korampm = "����";
	            break;
	         case 1 :
	            korampm = "����";
	            break;
	         }
	      
	      System.out.println(year + "�� " + month + "�� " + date + "�� " +
	            korampm + " " + hourofday + ":" +
	            minute + ":" + second + "�� " + 
	            kordayofweek + "���� �Դϴ�.");

		
		
	}
}
