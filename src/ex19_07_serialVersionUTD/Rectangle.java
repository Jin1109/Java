//���� �簢�� Ŭ������ �޼ҵ带 �߰��� ���
//���� �߻� : ����ȭ�� �� ����� Ŭ������
//������ȭ�� �� ����� Ŭ������ ������ �ٸ��� ������
package ex19_07_serialVersionUTD;
public class Rectangle implements java.io.Serializable {

	private static final long serialVersionUID = -197671255631031685L;
		private int width, height;
		public Rectangle(int width, int height) {
			this.width = width;
			this.height = height;
		}
		
		public String toString() {
			return "����: " + width + "\n����: " + height;
		}
		
		 int getArea() {
		 	return width * height;
		 }

}
