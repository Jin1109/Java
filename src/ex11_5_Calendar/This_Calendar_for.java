package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class This_Calendar_for {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		// 년도, 달 입력 받기
		System.out.println("출력할 년도를 입력하세요>");
		int year = sc.nextInt();
		System.out.println("출력할 달을 입력하세요>");
		int month = sc.nextInt();
		sc.close();
		
		//입력한 년도, 달의 1일이 무슨 요일인지 알아야 합니다.
		Calendar c = new GregorianCalendar(year, month - 1, 1);
		
		//입력한 년도, 달으 마지막 날을 구합니다.
		int lastday = c.getActualMaximum(Calendar.DATE);
		
		// 1:일요일, 2:월요일, ... 7:토요일
		int day_of_week = c.get(Calendar.DAY_OF_WEEK);
		
		//타이틀 출력
		String yoil[] = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.print("\t\t\t" + c.get(Calendar.YEAR) + "년 ");
		System.out.print((c.get(Calendar.MONTH) + 1) + "월" + "\n ");
		for (int i = 0; i < yoil.length; i++) {
			System.out.print(yoil[i] + "\t");
		}
		
		System.out.println();
		for (int i = 0; i < 51; i++)
			System.out.print("=");
		System.out.println();
		
		// 공백을 찍어요.
		/*
		 * c.get (calendar.DAY_OF_WEEK)=1 일요일 공백 없어요
		 * c.get (calendar.DAY_OF_WEEK)=2 월요일 공백 한개
		 * c.get (calendar.DAY_OF_WEEK)=3 화요일 공백 두개 
		 * c.get (calendar.DAY_OF_WEEK)=3 수요일 공백 세개 
		 */
		
		int count;
		//							4
		for (count = 1; count < day_of_week; count++) { //1; 1<4		2<4			3<4			4<4
			System.out.print("\t");						//	\t			\t			\t
		}
		
		// count=4 
		// 날짜를 찍어요
		for (int i = 1; i <= lastday; i++) {	//1					2				3			4
			System.out.print(i + "\t");			//1 				2				3			4
			
			if ( count++ % 7 == 0) {			//4 % 7 == 0, 5		5%7 == 0, 6		6%7==0,7	7%7==0,8
				System.out.println("\n");
			}
		}
		
	}
}
