package work0607;

import java.util.Calendar;
import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("년도를 입력하세요 : ");
		int year = sc.nextInt(); 
		System.out.println("월을 입력하세요 : ");
		int month = sc.nextInt(); 

		c.set(Calendar.YEAR, year); 
		c.set(Calendar.MONTH, month); 

		System.out.println("\t\t"+year+"년 "+month+"월"+"\t\t");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("==================================================");
		
		c.set(year,month-1,1); 
		                         
		  
		int enddate = c.getActualMaximum(Calendar.DATE); 
		int Week = c.get(Calendar.DAY_OF_WEEK); 
		

		for(int i=1; i<=enddate; i++) {
			if(i==1) {
				for(int j=1; j<Week; j++) {
					System.out.print("\t");
				}
			}
			if(i<10) { 
				System.out.print(" ");
			}
			System.out.print(i+"\t");
			if(Week%7==0) { 
				System.out.println();
			}
			Week++;
		}
		
		sc.close();
		
	} 
} 
