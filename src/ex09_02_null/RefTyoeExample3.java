//지역 변수 obj에 초기화 하지 않아 컴파일 에러 발생
package ex09_02_null;
public class RefTyoeExample3 {
	public static void main(String[] args) {
		Point obj;
		//The local variable obj may not have been initialized
		System.out.println(obj.x);
		
		System.out.println(obj.y);
	}
}
