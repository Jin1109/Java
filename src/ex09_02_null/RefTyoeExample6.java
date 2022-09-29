//obj변수에 null이라는 참조값이 있기 때문에 컴파일 에러는 없지만
//실행시 에러 발생(런타임 에러 발생)
package ex09_02_null;

class RefTyoeExample6 {
	public static void main(String[] args) {
		Point obj = null;
		try {
			System.out.println(obj.x);
			System.out.println(obj.y);
		}catch(NullPointerException n) {
			System.out.println("Point는 null 입니다");
		}
		
	}
}
