//LinkedList 사용 예
/* LinkedList와 ArrayList의 차이점
   - 데이터의 추가 또는 삭제시 ArrayList보다 속도가 빠릅니다.
   	 ArrayList의 경우 차례대로 데이터를 추가하고 마지막에서부터 데이터를 삭제하는 것은 LinkedList보다 빠릅니다.
   	 하지만 중간에 테이터를 추가하려면 빈자리를 만들기 위해 다른 데이터를 복사해서 이동해야 하고
   	 삭제인 경우에는 데이터를 재배치해야 하지만
   	 LinkedList의 경우에는 각 요소간 연결만 변경해주면 되기 때문에 처리속도가 상당히 빠릅니다.
 * - 검색에 ArrayList는 연속적으로 메모리상에 존쟇기 때문에 찾는데 빠르지만
   	 불연속적으로 위치한 LinkedList는 처음부터 차례대로 따라가야 원하는 값을 얻을 수 있어 검색시간이 느립니다.
 */
package ex15_1_Linked;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2_set_remove {
	public static void main(String[] args) {
		//LinkedList 객체를 생성
		LinkedList<String> list = new LinkedList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2, "키위");
		pLinkedList(list);
				
		// 인덱스 0 위치에 데이터를 "오렌지" 바꿉니다.
		list.set(0, "오렌지");
		pLinkedList(list);
				
		// 인덱스 1 위치에 데이터를 삭제합니다.
		list.remove(1);
		pLinkedList(list);
				
		// list에서 "키위"라는 데이터를 찾아서 삭제합니다.
		list.remove("키위");
		pLinkedList(list);
				
	}
		
	static void pLinkedList (LinkedList<String> list) {
		System.out.println("=====================");
		// iterator()메소드를 호출하여 Iteraotr 객체를 얻습니다.
		Iterator<String> iterator = list.iterator();
		
		// Iterator 객체를 이용하여 list에 있는 데이터를 순서대로 가져와서 출력
		while (iterator.hasNext()) {//현재 위치에서 다음 데이터가 있는지 확인하는 메소드
			String str = iterator.next();// 다음 데이터를 가져오는 메소드
			System.out.println(str);
		}
	}
		
		
	
}
