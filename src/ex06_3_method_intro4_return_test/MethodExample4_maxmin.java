package ex06_3_method_intro4_return_test;

import java.util.Scanner;

public class MethodExample4_maxmin {

   public static int [] max_min(int data[]) {
      /*
       int[] result=new int[2];
       result[0] = data[0];
       result[1] = data[0];
       */
      int result[] = { data[0], data[0]};
      
      //0 1 2 일 경우
      // 0 1 => max
      // max 2				3개에서는 2번의 비교가 이루어진다	//i가 1부터 시작되는 이유
      for(int i = 1; i < data.length; i++) { 
         if(result[0] < data[i]) result[0] = data[i];// max
         if(result[1] > data[i]) result[1] = data[i];// min
      }
      return result;
   }
   
   
   //접근제어자
   public static void main(String[] args) {
      int [] data = new int[5];
      Scanner sc = new Scanner(System.in);
      System.out.println("정수 5개를 입력하세요?");
      for(int i = 0; i < data.length; i++)
         data[i] = sc.nextInt();
         
      int[] result = max_min(data);//메서드 홀출 (실행)
      
      System.out.println("최댓값 = " + result[0]);
      System.out.println("최솟값 = " + result[1]);
            
      sc.close();
   }
   
}