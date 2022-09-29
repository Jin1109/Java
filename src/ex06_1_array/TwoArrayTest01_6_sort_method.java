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
package ex06_1_array;

public class TwoArrayTest01_6_sort_method {

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
		   
		   cal(subject, student, score);
		   //print (sub_name, name, score, student, subject);
		   
		   System.out.print("\n\n\n");
		   
		   sort(name,score,student);
		   print(sub_name, name, score, student, subject);
	   
    	}// main() end

		public static void print(String[] sub_name, String[] name, int[][] score, int[] student, int[] subject) {
			
			int r,c;
			
			System.out.println();
			   for(int i = 0; i < 10; i++)
				   System.out.print("=");
				
			   System.out.print(" �л���	 / 	���� �������ϱ� ");
			   for(int i =0; i < 10; i++)
				   System.out.print("=");
			   
			   System.out.print("\n\t");
			   for(c = 0; c < 3; c++)
				   System.out.print(sub_name[c] + "\t");
			   
			   System.out.print("����\t���");
			   
			   for(r = 0; r <5; r++) {							//r=0
				   System.out.print("\n" + name[r] + "\t");		//��ȣ��				�̽±�				���輮
				   
				   for(c = 0; c < 3; c++) {						//c=0				c=1					c=2
					   System.out.print(score[r][c] + "\t" );	//85	90			60	95				70
				   }
//				   System.out.print(student [r] + "\t" + student[r] / 3);
				   System.out.printf("%d\t%.1f", student [r] , student[r] / 3.0);
			   
				   
			   }
			 
			   System.out.println();
			   for (int i = 0; i < 45; i++)
				   System.out.print("=");
			   
			   System.out.print("\n" + "����" + "\t");
			   for(c = 0; c < 3; c++)
				   System.out.print(subject[c] + "\t");
		       
			   
		}

		public static void sort(String[] name, int[][] score, int[] student) {
			 for (int i= 0; i < student.length - 1; i++) {
		    	   for (int j = i + 1; j < student.length; j++) {
		    		   if (student[i] > student[j]) {
		    			   int imsi = student[i];
		    			   student[i] = student[j];
		    			   student[j] = imsi;
		    			   
		    			   int imsi2[] = score[i];
		    			   score[i] = score[j];
		    			   score[j] = imsi2;
		    			   
		    			   String imsi3 = name[i];
		    			   name[i] = name[j];
		    			   name[j] = imsi3;
		    			   
		    		   } // if
		    	   } // for j
		       } // for i
			 
		}

		public static void cal(int[] subject, int[] student, int[][] score) {
			for(int r = 0; r <5; r++) {							
				   
				   for(int c = 0; c < 3; c++) {						
					   student[r] += score[r][c];				
					   subject[c] += score[r][c];				
				   }
			   
			   }
			
		}
   
   
   
   
}// class end