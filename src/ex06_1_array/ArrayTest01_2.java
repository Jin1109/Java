package ex06_1_array;

public class ArrayTest01_2 {
	public static void main(String[] args) {
		
	 int[] score = new int[5];
	 score[0] = 95;score[1] = 70;score[2] = 80;
	 score[3] = 75;score[4] = 100;
	 // int score[]  = {95,70,80,75,100};¿Í °°Àº ÀÇ¹Ì
	 
	 int sum = 0;
	 for (int i = 0; i < score.length; i++) {
		 System.out.println("score[" + i + "]=" + score[i]);
		 sum += score[i];
	 }
	 System.out.println("ÃÎÁ¡=" +sum);
		
//		int socore[]  = {95,70,80,75,100};
//		
//		for (int i = 0; i < socore.length; i++)
//			System.out.println("arr[" + i + "]=" + "=" + socore[i]);
//		
//		int sum = socore[0] + socore[1] + socore[2] +socore[3] + socore[4]; 
//		System.out.println("ÃÑÁ¡=" + sum);

	}
	

}
