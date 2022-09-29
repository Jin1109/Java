package ex06_1_array;

public class TwoArrayExample1_int {
	public static void main(String[] args) {
      int arr[][] = {	{ 10, 20 },
    		  			{ 30, 40 },
    		  			{ 50 }
                  		};
   
      for(int i=0; i<arr.length; i++)	{
         for(int j=0; j<arr[i].length; j++) {
            System.out.print(arr[i][j] +" ");
         }
         System.out.println();
      }
      
      System.out.println("===============================");
      
		for (int [] a : arr) { // arr이 가리키고 있는 각 요소들은 일차원 배월을 가르키고 있습니다.
			for (int n : a) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		System.out.println("끝");
		
		
      }
}