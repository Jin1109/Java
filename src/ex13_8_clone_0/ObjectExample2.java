package ex13_8_clone_0;

class ObjectExample2 {
	public static void main(String[] args) {
		//��ü�� �����մϴ�.
		Rectangle obj1 = new Rectangle(10, 20);
		
		//clone �޼���� ��ü�� �����մϴ�.
		Rectangle obj2 = (Rectangle) obj1.clone();
	}
}