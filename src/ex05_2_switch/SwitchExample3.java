package ex05_2_switch;

public class SwitchExample3 {
	public static void main(String[] args) {
		String ch = "G";
		
		switch (ch)	{
			case "A" :
			case "a" :
				System.out.println("���");
				break;
			case "P" :
			case "p" :
				System.out.println("��");
				break;
			case "G" :
			case "g" :
				System.out.println("����");
				break;
			default :
				System.out.println("?");
		}
		System.out.println("��.");
	}
}
