package ex23_Board;

import java.util.List;
import java.util.Scanner;

public class Board_main3_selectAll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardDAO_seq dao = new BoardDAO_seq();
		
		do {
			int menu = menuselect(sc);
			switch (menu) {
			case 1:
				insert(sc, dao);
				break;
			
			case 5:
				selectAll(dao);
				break;	
				
			case 7:
				sc.close();
				return;
			}
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
		
				private static void insert(Scanner sc, BoardDAO_seq dao) {
					Board board = new Board();
					System.out.print("�ۻ���>");
					board.setBOARD_NAME(sc.nextLine());
					
					System.out.print("��й�ȣ>");
					board.setBOARD_PASS(sc.nextLine());
					
					System.out.print("����>");
					board.setBOARD_SUBJECT(sc.nextLine());
					
					System.out.print("�� ����>");
					board.setBOARD_CONTENT(sc.nextLine());
					
					if (dao.boardInsert(board)==1) {
						System.out.println("���� �ۼ��Ǿ����ϴ�.");
					} else {
						System.out.println("������ �߻��Ǿ����ϴ�.");
					}
				}
				
				private static void printTitle() {
					System.out.printf("%s\t%s\t\t%-16s\t%-16s\t%s\t%s\t%s\t%s\n", 
							        "�۹�ȣ", "�ۼ���", "����", "����", "ref", "lev", "seq",	"date");
				}
				
				private static void selectAll(BoardDAO_seq dao) {
					// 1 - ������(page)
					// 10 - ������ �� ����� ��(limit)
					List<Board> arrs = dao.getBoardList(1, 10);
					if (arrs != null) {
						printTitle();
						for (Board b : arrs) {
							System.out.println(b.toString());
						}
					} else {
						System.out.println("���̺��� �����Ͱ� �����ϴ�.");
					}
				}
				
	
}