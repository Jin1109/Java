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

public class TwoArrayTest01_6_sort {

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
	   
	   int r, c;
	   
	   
//----------------------------------------------------------------------------------------
	   
	   
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
	   
	   for(r = 0; r <5; r++) {							//r=0
		   System.out.print("\n" + name[r] + "\t");		//강호동				이승기				유잭석
		   
		   for(c = 0; c < 3; c++) {						//c=0				c=1					c=2
			   System.out.print(score[r][c] + "\t" );	//85	90			60	95				70
			   student[r] += score[r][c];				//student[1]=90		student[1]=90+95	student[1]=85+60
			   subject[c] += score[r][c];				//subject[0]=85+90	subject[0]=65+90
		   }
//		   System.out.print(student [r] + "\t" + student[r] / 3);
		   System.out.printf("%d\t%.1f", student [r] , student[r] / 3.0);
	   
		   
	   }
	 
	   System.out.println();
	   for (int i = 0; i < 45; i++)
		   System.out.print("=");
	   
	   System.out.print("\n" + "총점" + "\t");
	   for(c = 0; c < 3; c++)
		   System.out.print(subject[c] + "\t");
		
	   System.out.println();
	   for(int i =0;i<=50;i++)
		   System.out.print("*");
	   
       for (int i= 0; i < student.length - 1; i++) {
    	   for (int j = i + 1; j < student.length; j++) {
    		   if (student[i] > student[j]) {
    			   int imsi = student[i];
    			   student[i] = student[j];
    			   student[j] = imsi;
    			   
    			   int imsi2[] = score[i];	
    			   // int ims2는 기본형으로 값이 들어간다
    			   score[i] = score[j];
    			   score[j] = imsi2;
    			   
    			   String imsi3 = name[i];
    			   name[i] = name[j];
    			   name[j] = imsi3;
    			   
    		   } // if
    	   } // for j
       } // for i
       
       
       
//--------------------------------------------------------------------------------------    
       
       
       
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
	   
	   for(r = 0; r <5; r++) {							//r=0
		   System.out.print("\n" + name[r] + "\t");		//강호동				이승기				유잭석
		   
		   for(c = 0; c < 3; c++) {						//c=0				c=1					c=2
			   System.out.print(score[r][c] + "\t" );	//85	90			60	95				70
		   }
//		   System.out.print(student [r] + "\t" + student[r] / 3);
		   System.out.printf("%d\t%.1f", student [r] , student[r] / 3.0);
	   
		   
	   }
	 
	   System.out.println();
	   for (int i = 0; i < 45; i++)
		   System.out.print("=");
	   
	   System.out.print("\n" + "총점" + "\t");
	   for(c = 0; c < 3; c++)
		   System.out.print(subject[c] + "\t");
       
    		   }// main() end
}// class end