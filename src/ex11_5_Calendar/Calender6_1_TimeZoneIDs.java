package ex11_5_Calendar;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calender6_1_TimeZoneIDs {
	public static void main(String[] args) {
		
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println("현재 타임 zone = " + cal.getTimeZone().getID());
		
		System.out.println("=======================");
		for (String name : TimeZone.getAvailableIDs())
			System.out.println(name);
	}
}
