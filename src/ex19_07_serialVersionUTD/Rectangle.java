//기존 사각형 클래스에 메소드를 추가한 경우
//에러 발생 : 직렬화할 떄 사용한 클래스와
//역직렬화할 떄 사용한 클래스이 비전이 다르기 때문에
package ex19_07_serialVersionUTD;
public class Rectangle implements java.io.Serializable {

	private static final long serialVersionUID = -197671255631031685L;
		private int width, height;
		public Rectangle(int width, int height) {
			this.width = width;
			this.height = height;
		}
		
		public String toString() {
			return "가로: " + width + "\n높이: " + height;
		}
		
		 int getArea() {
		 	return width * height;
		 }

}
