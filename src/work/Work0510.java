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
package work;

public class Work0510 {

   public static void main(String[] args) {
	   String name[]= {"강호동", "이승기", "유재석", "하하", "이광수"};
	   String sub_name[] = {"국어", "수학", "영어"};
	   int [][]score = {{ 85, 	60,		70},	//0행(1번학생)
			   			{ 90, 	95,		80},	//1행(2번학생)	
			   			{ 75, 	80,	   100},	//2행(3번학생)	
			   			{ 80, 	70,		95},	//3행(4번학생)	
			   			{ 100, 	65,		80},	//4행(5번학생)	
	   					};
	   int [] subject = new int[3];	//과목총점 저장
	   int [] student = new int[5];	//학생의 총점 저장
	   int [] avg = new int[5];		//학생의 평균


	   System.out.println("========== 학생별	/ 과목별 총점구하기 ===========");
	   System.out.println( "\t" + sub_name[0] +  "\t" + sub_name[1] + "\t" + sub_name[2] + "\t총점" + "\t평균");

	   for(int i=0; i<score.length; i++) {
	       student[i] = score[i][0] + score[i][1] + score[i][2];
	       avg[i]  = student[i] /3;   
	       
	      System.out.printf("%s\t%d\t%d\t%d\t%d\t%d \n", name[i], score[i][0], score[i][1], score[i][2], student[i], avg[i]);      
	   }	
	   System.out.println("===========================================");
   			
	 	  subject[0]  =	score[0][0] + score[1][0] + score[2][0] + score[3][0] + score[4][0];
	 	  subject[1]  = score[0][1] + score[1][1] + score[2][1] + score[3][1] + score[4][1];
	 	  subject[2]  = score[0][2] + score[1][2] + score[2][2] + score[3][2] + score[4][2];
	 	  System.out.printf("%s\t%d\t%d\t%d\t","총점",subject[0],subject[1],subject[2]);
	   				
				
				
       
   }
}