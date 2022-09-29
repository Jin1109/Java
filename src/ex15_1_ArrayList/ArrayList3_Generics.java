/*
 * 1.지네릭스(Generics) jdk 1.5에서 처음 도입
	다양한 타압의 객체들을 다루는 메소드나 컬랙션 클래스에 컴파일 시의 타입케그를
	해주는 기능입니다.
 * 2. 클래스 옆에 꺽쇠(<>)기호를 이용해서 만듭니다.
	  1) <>안에 특정 자료형(Wrapper 클래스, String, 사용자 정의 클래스형-참조형)을 넣어주면 됩니다.
	  2) Class ArrayList<E> : E의 ArrayList라고 읽습니다.
		  - ArrayList : 원시 타입(row type)
		  - E(타입 매게 변수) : 기호의 종류만 다를 뿐 임의의 참조형 타입을 의미합니다.
			
  			변수 : 의미
			E : 원소(Element)
			K : 키(key)
			T : 타입(Type)
			V : 값(Value)
	
	 - 사용 예)
			List<String>	  list = new ArrayList<String>();
			ArrayList<String> list = new ArrayList<String>();
			ArrayList<Integer>list = new ArrayList<Integer>();
			ArrayList<Double> list = new ArrayList<Double>();
			ArrayList<MemberInput> list = new ArrayList<MemberInput>();*/
			
package ex15_1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3_Generics {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//ArrayList list = new ArrayList();
		
		//자료 추가
		list.add("하나");
		list.add(2);	//list.add(Integer,valueOf(2));
		list.add(false);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add('A');
		
		// 출력 방법 1. - 해당 객체명으로 출력하는 방법
		System.out.println("===객체명으로 출력하기===");
		System.out.println(list);
		
	}
}
