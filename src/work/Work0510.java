/*
 * ������ �迭
 * 
 * ============ �л���	/ ���� �������ϱ�	============
 * 			����  ����  ����  ����  ���
 * ��ȣ��		85   60   70   215  71
 * �̽±�		90	 95	  80   265  88
 * ���缮		75   80   100  255  85
 * ����		80   70   95   245  81
 * �̱���		100  65	  80   245  81
 * =================================================
 * ����		430	 370  425
 */
package work;

public class Work0510 {

   public static void main(String[] args) {
	   String name[]= {"��ȣ��", "�̽±�", "���缮", "����", "�̱���"};
	   String sub_name[] = {"����", "����", "����"};
	   int [][]score = {{ 85, 	60,		70},	//0��(1���л�)
			   			{ 90, 	95,		80},	//1��(2���л�)	
			   			{ 75, 	80,	   100},	//2��(3���л�)	
			   			{ 80, 	70,		95},	//3��(4���л�)	
			   			{ 100, 	65,		80},	//4��(5���л�)	
	   					};
	   int [] subject = new int[3];	//�������� ����
	   int [] student = new int[5];	//�л��� ���� ����
	   int [] avg = new int[5];		//�л��� ���


	   System.out.println("========== �л���	/ ���� �������ϱ� ===========");
	   System.out.println( "\t" + sub_name[0] +  "\t" + sub_name[1] + "\t" + sub_name[2] + "\t����" + "\t���");

	   for(int i=0; i<score.length; i++) {
	       student[i] = score[i][0] + score[i][1] + score[i][2];
	       avg[i]  = student[i] /3;   
	       
	      System.out.printf("%s\t%d\t%d\t%d\t%d\t%d \n", name[i], score[i][0], score[i][1], score[i][2], student[i], avg[i]);      
	   }	
	   System.out.println("===========================================");
   			
	 	  subject[0]  =	score[0][0] + score[1][0] + score[2][0] + score[3][0] + score[4][0];
	 	  subject[1]  = score[0][1] + score[1][1] + score[2][1] + score[3][1] + score[4][1];
	 	  subject[2]  = score[0][2] + score[1][2] + score[2][2] + score[3][2] + score[4][2];
	 	  System.out.printf("%s\t%d\t%d\t%d\t","����",subject[0],subject[1],subject[2]);
	   				
				
				
       
   }
}