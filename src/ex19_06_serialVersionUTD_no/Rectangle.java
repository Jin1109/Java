//���� �簢�� Ŭ������ �޼ҵ带 �߰��� ���
//���� �߻� : ����ȭ�� �� ����� Ŭ������
//������ȭ�� �� ����� Ŭ������ ������ �ٸ��� ������
package ex19_06_serialVersionUTD_no;
public class Rectangle implements java.io.Serializable {

		private int width, height;
		public Rectangle(int width, int height) {
			this.width = width;
			this.height = height;
		}
		
		public String toString() {
			return "����: " + width + "\n����: " + height;
		}
		
	/*���� ���
	//
	 * 1. �Ʒ� getArea �޼ҵ��� �ּ��� �ް� ������ ��쿡�� ���� ����
	   ObjectOutputExample.java�� ����
	   ObjectInputExample.java ����
	   
	   * 2. �Ʒ� �޼ҵ��� �ּ��� Ǭ �� - ���� �߻�
	   		ObjectInputExample.java ����
	   	
	   	serialVersionUTD�� ���� Ŭ�������� �˷��ִ� �ĺ��� ������ �ϸ�
	    Serializable �������̽��� ������ Ŭ������ �������ϸ� �ڵ�������
	    serialVersionUTD ���� �ʵ尡 �߰��˴ϴ�.
	    
	    serialVersionUTD�� �ڹ��� ����ȭ ��Ŀ����� ������ȭ ��Ŀ������ ����ɶ�
	    �ڵ����� �ο��Ǵµ� ����ȭ ���� Ŭ������ ������ �״���̸� ���� ��ȣ�� �ο��ǰ�
	    Ŭ������ ������Ұ� �ϳ��� �ٲ�� ������ �ٸ� serialVersionUTD�� �ο� �Ǻ��.
	    
	    	������ ��������� Ŭ������ serialVersionUTD�� ����Ǿ� ������
	    	������ �� �߰� ���� �ʱ� ������ ������ ���� ������ �� �ֽ��ϴ�.
*/
		
//		 int getArea() {
//		 	return width * height;
//		 }
		 
}
