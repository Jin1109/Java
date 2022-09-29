//protected 구성요소를 포함하는 크래스의 예
//protected가 붙은 변수, 메소드는 동일 패키지내의 클래스 또는 
//해당 클래스를 상속받은 외부 패키지의 클래스에서 접급이 가능하다.
package ex10_09.geometry.common;
public class Polygon {
	public int x [];
	protected int y[];		// 꼭지점의 Y 좌표
	protected Polygon(int size) { // 생성자
		x = new int[size];
		y = new int[size];
	}
	// 꼭지점의 좌표를 설정한다.
	protected void setPoint(int index, int x, int y) {
		this.x[index] = x;
		this.y[index] = y;
	}
}

