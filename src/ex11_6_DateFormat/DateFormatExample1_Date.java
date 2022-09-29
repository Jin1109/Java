package ex11_6_DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample1_Date {
	public static void main(String[] args) {
		
		//���� �ý��� ��¥�� �ð� ���ϴ� ���
		//Ŭ���� Date �̿��ϴ� ��� - ��° �ý��� ���ڿ� �ð� ���մϴ�.
		Date d = new Date();
		System.out.println("Date ��� : " + d);
		//System.out.println(new Date());//�� �� ����� ���� �ǹ�
		
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy��MM��dd��");
		System.out.println(sd1.format(d));//yyyy-MM-dd ���·� ���
		System.out.println(sd2.format(d));//yyyy��MM��dd ���·� ���
		
		/* 379������ �����ϼ���
		   �������� �Ű������� ��¥�� �ð��� ������ �ۼ��Ͽ� �Ѱ��ݴϴ�.
		   ���Ϲ��� 		  �ǹ�
		     y		��
		   	 M		��
		   	 d		��
		   	 D		��(1~365)
		   	 E		����
		   	 a		����/����
		   	 H		��(0~23)
		   	 h		��(1~12)
		   	 m		��
		   	 s		��
		   	 s		1/1000ch
		 */
		
		SimpleDateFormat sdf 
		= new SimpleDateFormat("yyyy�� MM�� dd�� a h�� m�� s�� E����");
	    System.out.println(sdf.format(d));
	}
}