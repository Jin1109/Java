//obj변수에 null이라는 참조값이 있기 때문에 컴파일 에러는 없지만
//실행시 에러 발생(런타임 에러 발생)
package ex09_02_null;
public class RefTyoeExample4 {
	public static void main(String[] args) {
		Point obj = null;	//NullPointerException
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}
