/*
 * 이차원 배열
 * 
 * ============ 학생별	/ 과목별 총점구하기	============
 * 			국어  수학  영어  총점  평균
 * 강호동		85   60   70   215  71
 * 이승기		90	 95	  80   265  88
 * 유재석		75   80   100  255  85
 * 하하		80   70   95   245  81
 * 이광수		100  65	  80   245  81
 * =================================================
 * 총점		430	 370  425
 */
package ex06_1_array;

public class TwoArrayTest01_5 {

   public static void main(String[] args) {
	   String name[]= {"강호동", "이승기", "유재석", "하하", "이광수"};
	   String sub_name[] = {"국어", "수학", "영어"};
	   int [][]score = {{ 85, 	60,		70},	//0행("강호동")
			   			{ 90, 	95,		80},	//1행("이승기")	
			   			{ 75, 	80,	   100},	//2행("유재석")	
			   			{ 80, 	70,		95},	//3행("하하")	
			   			{ 100, 	65,		80},	//4행("이광수")	
	   					};
	   int [] subject = new int[3];	//과목총점 저장
	   int [] student = new int[5];	//학생의 총점 저장
	   
	   int r, c;
	   
	   System.out.println();
	   for(int i = 0; i < 10; i++)
		   System.out.print("=");
		
	   System.out.print(" 학생별	 / 	과목별 총점구하기 ");
	   for(int i =0; i < 10; i++)
		   System.out.print("=");
	   
	   System.out.print("\n\t");
	   for(c = 0; c < 3; c++)
		   System.out.print(sub_name[c] + "\t");
	   
	   System.out.print("총점\t평균");
	   
	   for(r = 0; r <5; r++) {							//r=0			r=1				r=2				r=3				r=4
		   System.out.print("\n" + name[r] + "\t");		//강호동			이승기			유잭석			하하				이광수
		   												//c=0 국어		c=1 영어			c=2 수학
		   for(c = 0; c < 3; c++) {						//r=0									
			   System.out.print(score[r][c] + "\t" );	//85							60							70
			   student[r] += score[r][c];				//student[0]=85					student[0]=85+60			student[0]=85+60+70
			   subject[c] += score[r][c];				//subject[0]=85					subject[1]=60				subject[2]=70
		   }											
		   												//r=1
		   												//90							95							80
		   												//student[1]=90					student[1]=90+95			student[1]=90+95+80
		   												//subject[0]=85+90				subject[1]=60+95			subject[1]=70+80
		   
														//r=2
														//75							80							100
														//student[2]=75					student[2]=75+80			student[2]=75+80+100
														//subject[0]=85+90+75			subject[1]=60+95+80			subject[1]=70+80+100		   
		   
														//r=3
														//80							70							95
														//student[3]=80					student[3]=80+70			student[3]=80+70+95
														//subject[0]=85+90+75+80		subject[1]=60+95+80+70		subject[1]=70+80+100+95
		   
														//r=4
														//100							65							80
														//student[4]=100				student[4]=100+65			student[4]=100+65+80
														//subject[0]=85+90+75+80+100	subject[1]=60+95+80+70+65	subject[1]=70+80+100+95+80
														   
		   
		   
		   
		   
		   //System.out.print(student [r] + "\t" + student[r] / 3); 		정수형		
		   System.out.printf("%d\t%.1f", student [r] , student[r] / 3.0); //실수형
	   
	   }
	 
	   System.out.println();
	   for (int i = 0; i < 45; i++)
		   System.out.print("=");
	   
	   System.out.print("\n" + "총점" + "\t");
	   for(c = 0; c < 3; c++)
		   System.out.print(subject[c] + "\t");
   }// main() end
}// class end