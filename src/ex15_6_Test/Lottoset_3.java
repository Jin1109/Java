// 과제. 1~45 사이의 정수중에서 6개의 숫자를 추출하는
package ex15_6_Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Lottoset_3 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		while (set.size() < 6)
		{
			set.add(r.nextInt(45) + 1);
		}
		
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + "\t");
		}
 	}
}
