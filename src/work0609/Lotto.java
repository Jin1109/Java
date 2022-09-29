package work0609;

import java.util.HashSet;

public class Lotto {
	public static void main(String[] args) {		
		
		HashSet<Integer> num = new HashSet<Integer>();		
		
		while (num.size() < 6) {			
			num.add((int) (Math.random() * 45) + 1);		
		}		
		
		System.out.println(num);
	
	}

}
