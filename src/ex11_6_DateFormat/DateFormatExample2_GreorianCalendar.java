//SimpleDateFormat 클래스를 사용하여 날짜와 시간을 포맷하는 프로그램
//SimpleDateFormat 클래스의 format()메소드의 매개변수로 Data형 필요

package ex11_6_DateFormat;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateFormatExample2_GreorianCalendar {

   public static void main(String[] args) {
      GregorianCalendar calendar = new GregorianCalendar();
      
      //calengar.getTime() : calendar객체가 가지고 있는 날짜와 시간과 똑같은
      //정보를 갖는 Date 객체를 만들어서 리턴하는 메서드입니다.
      System.out.println(calendar.getTime());
      
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a h시 m분 s초 E요일");
      System.out.println(sdf.format(calendar.getTime()));

   }

}
