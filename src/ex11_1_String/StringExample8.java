package ex11_1_String;

public class StringExample8 {
	public static void main(String[] args) {
		
		String message = "Java program creates namy object";
		String message2 = "Java programaaaaaaaa namy object";
		
		//������ ���ڰ� ���ʷ� ��ġ�� �ε����� ���մϴ�.
		//�������� ���� ��� -1�� �����Ѵ�.
		//���ڿ� �տ��� ���� ���ʴ�� �˻��մϴ�.
		int index1 = message.indexOf('a');
		System.out.println("a�� ��ġ��" + index1);
		
		//�ƽ�Ű�ڵ� 97�� �ҹ��� 'a'
		int index2 = message.indexOf(97);
		System.out.println("a�� ��ġ��" + index2);
		 
		//�ƽ�Ű�ڵ� 65�� �ҹ��� 'A'
		int index23 = message.indexOf(65);
		//'A'�� ���� ���� index ���� -1�� ��ȯ�մϴ�.
		System.out.println("A�� ��ġ��" + index23);
		
		//index��ȣ 13��° ���� 'a'�� ã���ϴ�.
		int index3 = message.indexOf('a', 13);
		System.out.println("13�� ���� a�� ��ġ�� " + index3);
		
		//"av"�� ���� index�� ã���ϴ�.
		int index4 = message.indexOf("av");
		System.out.println("av�� �����ϴ� index�� " + index4);
		
		//index��ȣ 12��° ���� "man"�� ���� index�� ã���ϴ�.
		int index5 = message.indexOf("man", 12);
		System.out.println("av�� �����ϴ� index�� " + index5);
		
		int index6 = message.indexOf("java");
		System.out.println("java�� ��ġ�� " + index6);


		
	}
}
