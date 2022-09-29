package ex15_4_HashMap.Test;

import java.util.HashMap;
import java.util.Scanner;

public class Mothd_Test05_maxmin_my {
	
	static HashMap<String, Integer> max_min(int data[]){
		/*int result[]=new int[2];
		result[0] = data[0];
		result[1] = data[0];*/
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		
		for(int i=1; i < data.length; i++){
			if(result.values() < result.values()) result.values() = result.values(); //max	
			if(result.values() > result.values()) result.values() = result.values(); //min
		}
		return result;		
	}

	public static void main(String args[]) {
		int data[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요?");
		for(int i=0; i< data.length; i++)
			data[i] = sc.nextInt();
		
		HashMap<String, Integer> result = max_min(data);
	    System.out.println("최댓값 = " + result);
	    System.out.println("최솟값 = " + result);
	    
	    sc.close();
  }

}
