package work0618;

import java.util.Scanner;

public class Board_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do {
			int menu = menuselect(sc);
			System.out.println(menu);
		} while (true);
	}
		
		private static int menuselect(Scanner sc) {
			String menus[] = { "�۾���", "����", "�亯�ޱ�","�ۻ���", "��ȸ", "������ ����", "����" };
			int i = 0;
			System.out.println("========================================================");
			for (String menu : menus) {
				System.out.println(++i + "." + menu);
			}
			System.out.println("========================================================");
			System.out.println("�޴��� �����ϼ���");
			return inputNumber(sc, 1, menus.length);
			
		}
	
		private static int inputNumber(Scanner sc, int start, int end) {
			int input = 0;
			while (true) 
				try {
					input = Integer.parseInt(sc.nextLine());
					if (input <= end && input >= start) {
						break;
					} else {
						System.out.println(start + "~" + end + "������ ���ڸ� �Է��ϼ���");
					}
				} catch (NumberFormatException e) {
					System.out.println("���ڷ� �Է��ϼ���>");
				}
				return input;
				}
		}
