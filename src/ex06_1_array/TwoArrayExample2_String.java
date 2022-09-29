//2차원 배월을 향상된 for문으로 작성하기
package ex06_1_array;

public class TwoArrayExample2_String {
	public static void main(String[] args) {
      String arr[][] = {{ "과일", "사과" },
    		  			{ "아이스크림", "메로나" },
    		  			{ "커피" } };
   
      //항상된 for문
		for (String n : arr[0]) {
			System.out.println(n);
		}
		
		System.out.println("==================");
		for (String [] i : arr) {
			for (String n : i) 
				System.out.printf("%s\t" , n);
			System.out.println();
			
		}	
		System.out.println("끝.");
		
		
      }
}