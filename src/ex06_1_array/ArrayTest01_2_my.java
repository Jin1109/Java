package ex06_1_array;

public class ArrayTest01_2_my {
	public static void main(String[] args) {
		int socore[]  = {95,70,80,75,100};
		
		for (int i = 0; i < socore.length; i++)
			System.out.println("arr[" + i + "]=" + "=" + socore[i]);
		
		int sum = socore[0] + socore[1] + socore[2] +socore[3] + socore[4]; 
		System.out.println("รัมก=" + sum);

	}
	

}
