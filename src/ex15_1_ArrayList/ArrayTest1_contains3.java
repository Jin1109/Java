package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayTest1_contains3 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(10);
		list1.add("봄");
		list1.add("여름");
		
		ArrayList<String> list2 = new ArrayList<String>(10);
		list2.add("봄");
		list2.add("봄");
		list2.add("가을");
		list2.add("겨울");
		
		if (list1.contains("봄")) {
			System.out.println("봄이 존재합니다.");
		} else {
			System.out.println("봄이 존재하지 않습니다.");
		}		

		System.out.println("list1= " + list1);
		System.out.println("list2= " + list2);
		
		System.out.println("===============================");
		
		//list2에서 list1과 공통되는 요소들을 끝에서 부터 찾아 삭제
		for(int i = list2.size() - 1; i >= 0; i--) {
			//지정된 객체(list2.get(i))가 list1에 포함되어 있는지 확인
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		
		System.out.println("list1= " + list1);
		System.out.println("list2= " + list2);
	}
}
