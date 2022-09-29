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

public class TwoArrayTest01_5 {

   public static void main(String[] args) {
	   String name[]= {"��ȣ��", "�̽±�", "���缮", "����", "�̱���"};
	   String sub_name[] = {"����", "����", "����"};
	   int [][]score = {{ 85, 	60,		70},	//0��("��ȣ��")
			   			{ 90, 	95,		80},	//1��("�̽±�")	
			   			{ 75, 	80,	   100},	//2��("���缮")	
			   			{ 80, 	70,		95},	//3��("����")	
			   			{ 100, 	65,		80},	//4��("�̱���")	
	   					};
	   int [] subject = new int[3];	//�������� ����
	   int [] student = new int[5];	//�л��� ���� ����
	   
	   int r, c;
	   
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
	   
	   for(r = 0; r <5; r++) {							//r=0			r=1				r=2				r=3				r=4
		   System.out.print("\n" + name[r] + "\t");		//��ȣ��			�̽±�			���輮			����				�̱���
		   												//c=0 ����		c=1 ����			c=2 ����
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
														   
		   
		   
		   
		   
		   //System.out.print(student [r] + "\t" + student[r] / 3); 		������		
		   System.out.printf("%d\t%.1f", student [r] , student[r] / 3.0); //�Ǽ���
	   
	   }
	 
	   System.out.println();
	   for (int i = 0; i < 45; i++)
		   System.out.print("=");
	   
	   System.out.print("\n" + "����" + "\t");
	   for(c = 0; c < 3; c++)
		   System.out.print(subject[c] + "\t");
   }// main() end
}// class end