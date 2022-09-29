//슈퍼 클래스의 protected 구성요소를 사용하는 서브 클래스
package ex10_09.geometry.shape;
import ex10_09.geometry.common.Polygon;
public class Square extends Polygon {
		public Square(int x, int y, int sideLength) {
		super(4); //슈퍼 클래스의 protected 메스드 호출
		setPoint(0, x, y); //슈퍼 클래스의 protected의 메소드 호출
		setPoint(1, x + sideLength, y);
		setPoint(2, x + sideLength, y + sideLength);
		setPoint(3, x, y + sideLength);
	}
	public int getX(int index) {
		return x[index];	
	}
	public int getY(int index) {
		return y[index];			//슈퍼 클래스의 protectd 필드 사용
	}
	
	/*sideLength=10인 경우
	 *	  .(0, 0)		.(10, 0)
	 		x  y		 x+10, y
	 		index=0		index=1
	 		
	 		.(0, 10)	.(10, 10)
	 		x  y+10		 x+10, y+10
	 		index=3		index=2
	 */

}	
