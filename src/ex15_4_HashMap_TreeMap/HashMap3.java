/*
 * TreeMap
 *  키와 값의 쌍으로 이루어진 데이터를 키로 정렬해서 저장합니다.
 *  검색과 정렬에 적합한 걸렉션 클래스입니다.
 */
package ex15_4_HashMap_TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class HashMap3 {
	public static void main(String[] args) {
		// 방법1. 업캐스팅
		//Map<String, String> tm = new TreeMap<String, String>();
		
		// 방법2. 구현 클래스를 통한 객체 생성
		TreeMap<String, String> tm = new TreeMap<String, String>();//방법2. 구현 클래스를 통한 객체 생성
		
		//Key와 Value 쌍을 삽입
		//Map의 put()을 이용해 (key, Value) 쌍으로 자료 저장합니다.
		tm.put( "woman", "재미있니" );
		tm.put( "man", "좋은하루" );
		tm.put( "age", new String("10") );
		tm.put( "city", "Seoul" );
		tm.put( "city", "Busan" );
		//{woman=재미있니, city=Busan, man=좋은하루, age=10}
		//{age=10, city=seoul, man=좋은하루, woman=재미있니} 
		
//		//HashMap에 잇는 객체들을 출력
//		//출력 방법 1. 해당 객체명으로 출력
//		System.out.println( tm );
//		//{woman=재미있니, city=Busan, man=좋은하루, age=10}
		
		//출력 방법 2. Key  값만 출력
		System.out.println( tm.keySet() );//{woman, city, age}
		
		//출력 방법 3.Value 값만 추력
		System.out.println( tm.values());
		
		//출력 방법 4.
		//get (key) : key에 해당하는 Value를 출력 - 가장 많이 사용
		System.out.println( tm.get( "woman" ));//재미있니
		System.out.println( tm.get("city" ));//Busan
		
		//출력방법 5
		System.out.println("===========================");
		Set<String> keys = tm.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + tm.get(key));
		}
	
	}
}
