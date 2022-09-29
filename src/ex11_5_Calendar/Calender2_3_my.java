/*
 Calendar는 추상 클래스로 이렇게 사용할 수 없습니다.
 1. Calender c = new Calendar();
 
 2. Calender 사용법 두가지
 	하나)정적 메소드를 이용해서 사용하는 방법
 		Calender c1 = Calender.getInstance();
 		getInstance() : Calender 클래스를 구현한 클래스의 인스턴스르 반환
 		getInstance() 메소드는 달력 필드가 현재 날짜 및 시간으로 초기화 된 Calender 객체를 반환합니다.
 	둘)업캐스팅 방법(자식의 주소를 부모의 자료형을 가진 변수에 저장)
 		Calender c2 = new GregorianCalender();
 */
package ex11_5_Calendar;
import java.util.*;
public class Calender2_3_my {
	public static void main(String[] args) {
		//기본적으로 현재날짜와 시간으로 설정됩니다.
		Calendar today = Calendar.getInstance();
		
//		System.out.println(today.get(Calendar.YEAR) + '년'
//						+ (today.get(2)+1) + "월 " 
//						+ today.get(Calendar.DATE) + "일 " 
//						+ today.get(Calendar.AM) + " " 
//						+ today.get(Calendar.HOUR_OF_DAY) + "시간" 
//						+ today.get(Calendar.MINUTE) + "분" 
//						+ today.get(Calendar.SECOND) + "초 " 
//						+ today.get(Calendar.DAY_OF_WEEK) + "요일");
		
//		
//		System.out.print(today.get(Calendar.YEAR) + '년');
//		System.out.print(today.get(Calendar.MONTH) + 1 + '월');
//		System.out.print(today.get(Calendar.DATE) + '일');
//		System.out.print(today.get(Calendar.AM) + " " );
//		System.out.println(today.get(Calendar.MINUTE) + "분" );
//		System.out.print(today.get(Calendar.DAY_OF_WEEK) + '초');
//		System.out.print(today.get(Calendar.DAY_OF_WEEK) + "요일"
//		System.out.print("입니다.");
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
	            kordayofweek = "일";
	            break;
	            
	         case 2 :
	            kordayofweek = "월";
	            break;
	            
	         case 3 :
	            kordayofweek = "화";
	            break;
	            
	         case 4 :
	            kordayofweek = "수";
	            break;
	            
	         case 5 :
	            kordayofweek = "목";
	            break;
	            
	         case 6 :
	            kordayofweek = "금";
	            break;   
	            
	         case 7 :
	            kordayofweek = "토";
	            break;
	            
	            }
	      
	      int ampm = today.get(Calendar.AM_PM);
	      
	      String korampm = "";
	      switch(ampm) {
	         case 0 :
	            korampm = "오전";
	            break;
	         case 1 :
	            korampm = "오후";
	            break;
	         }
	      
	      System.out.println(year + "년 " + month + "월 " + date + "일 " +
	            korampm + " " + hourofday + ":" +
	            minute + ":" + second + "초 " + 
	            kordayofweek + "요일 입니다.");

		
		
	}
}
