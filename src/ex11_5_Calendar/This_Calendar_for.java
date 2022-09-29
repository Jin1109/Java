package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class This_Calendar_for {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		// �⵵, �� �Է� �ޱ�
		System.out.println("����� �⵵�� �Է��ϼ���>");
		int year = sc.nextInt();
		System.out.println("����� ���� �Է��ϼ���>");
		int month = sc.nextInt();
		sc.close();
		
		//�Է��� �⵵, ���� 1���� ���� �������� �˾ƾ� �մϴ�.
		Calendar c = new GregorianCalendar(year, month - 1, 1);
		
		//�Է��� �⵵, ���� ������ ���� ���մϴ�.
		int lastday = c.getActualMaximum(Calendar.DATE);
		
		// 1:�Ͽ���, 2:������, ... 7:�����
		int day_of_week = c.get(Calendar.DAY_OF_WEEK);
		
		//Ÿ��Ʋ ���
		String yoil[] = { "��", "��", "ȭ", "��", "��", "��", "��" };
		System.out.print("\t\t\t" + c.get(Calendar.YEAR) + "�� ");
		System.out.print((c.get(Calendar.MONTH) + 1) + "��" + "\n ");
		for (int i = 0; i < yoil.length; i++) {
			System.out.print(yoil[i] + "\t");
		}
		
		System.out.println();
		for (int i = 0; i < 51; i++)
			System.out.print("=");
		System.out.println();
		
		// ������ ����.
		/*
		 * c.get (calendar.DAY_OF_WEEK)=1 �Ͽ��� ���� �����
		 * c.get (calendar.DAY_OF_WEEK)=2 ������ ���� �Ѱ�
		 * c.get (calendar.DAY_OF_WEEK)=3 ȭ���� ���� �ΰ� 
		 * c.get (calendar.DAY_OF_WEEK)=3 ������ ���� ���� 
		 */
		
		int count;
		//							4
		for (count = 1; count < day_of_week; count++) { //1; 1<4		2<4			3<4			4<4
			System.out.print("\t");						//	\t			\t			\t
		}
		
		// count=4 
		// ��¥�� ����
		for (int i = 1; i <= lastday; i++) {	//1					2				3			4
			System.out.print(i + "\t");			//1 				2				3			4
			
			if ( count++ % 7 == 0) {			//4 % 7 == 0, 5		5%7 == 0, 6		6%7==0,7	7%7==0,8
				System.out.println("\n");
			}
		}
		
	}
}
