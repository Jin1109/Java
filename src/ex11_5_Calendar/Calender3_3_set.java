package ex11_5_Calendar;

import java.util.GregorianCalendar;

public class Calender3_3_set {
	public static void main(String[] args) {
		
		// 현재 날짜와 시간으로 설정
		GregorianCalendar g = new GregorianCalendar();
		
		// 특정 날짜로 변경
		g.set(2022, 4, 2); // 2022. 5. 2 달에 -1한 값을 넣는다
		Today t3 = new Today(g);
		System.out.println(t3.toString());
		
		// 생서자에서 년도, 달, 일 설정
		Today t1 = new Today(new GregorianCalendar(2021, 10, 30));
		System.out.println(t1.toString());
		
		// 생성자에서 년도,달,일,시,분,초 설정
		Today t2 = new Today(new GregorianCalendar(2021, 7, 2, 10, 10, 10));
		System.out.println(t2.toString());
	}
}
