//상속 받은 추상 메소드를 구현하라는 에러 발생
package ex08_14_01_interface;
class Dictionary implements Lendable {
	String title;
	Dictionary(String title){
		this.title = title;
	}
}
