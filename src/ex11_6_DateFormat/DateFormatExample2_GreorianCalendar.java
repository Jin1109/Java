//SimpleDateFormat Ŭ������ ����Ͽ� ��¥�� �ð��� �����ϴ� ���α׷�
//SimpleDateFormat Ŭ������ format()�޼ҵ��� �Ű������� Data�� �ʿ�

package ex11_6_DateFormat;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateFormatExample2_GreorianCalendar {

   public static void main(String[] args) {
      GregorianCalendar calendar = new GregorianCalendar();
      
      //calengar.getTime() : calendar��ü�� ������ �ִ� ��¥�� �ð��� �Ȱ���
      //������ ���� Date ��ü�� ���� �����ϴ� �޼����Դϴ�.
      System.out.println(calendar.getTime());
      
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� a h�� m�� s�� E����");
      System.out.println(sdf.format(calendar.getTime()));

   }

}
