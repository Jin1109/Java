package work0618;

import java.util.List;
import java.util.Scanner;

public class Board_main4_update {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardDAO_seq dao = new BoardDAO_seq();

		do {
			int menu = menuselect(sc);
			switch (menu) {
			case 1:
				insert(sc, dao);
				break;

			case 2:
				update(sc, dao);
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
		String menus[] = { "글쓰기", "수정", "답변달기", "글삭제", "조회", "페이지 선정", "종료" };
		int i = 0;
		System.out.println("========================================================");
		for (String menu : menus) {
			System.out.println(++i + "." + menu);
		}
		System.out.println("========================================================");
		System.out.println("메뉴를 선택하세요");
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
					System.out.println(start + "~" + end + "사이의 숫자를 입력하세요");
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자로 입력하세요>");
			}
		return input;
	}

	private static void insert(Scanner sc, BoardDAO_seq dao) {
		Board board = new Board();
		System.out.print("작상자>");
		board.setBOARD_NAME(sc.nextLine());

		System.out.print("비밀번호>");
		board.setBOARD_PASS(sc.nextLine());

		System.out.print("제목>");
		board.setBOARD_SUBJECT(sc.nextLine());

		System.out.print("글 내용>");
		board.setBOARD_CONTENT(sc.nextLine());

		if (dao.boardInsert(board) == 1) {
			System.out.println("글이 작성되었습니다.");
		} else {
			System.out.println("오류가 발생되었습니다.");
		}
	}

	private static void printTitle() {
		System.out.printf("%s\t%s\t\t%-16s\t%-16s\t%s\t%s\t%s\t%s\n", "글번호", "작성자", "제목", "내용", "ref", "lev", "seq",
				"date");
	}

	private static void selectAll(BoardDAO_seq dao) {
		// 1 - 페이지(page)
		// 10 - 페이지 당 목록의 수(limit)
		List<Board> arrs = dao.getBoardList(1, 10);
		if (arrs != null) {
			printTitle();
			for (Board b : arrs) {
				System.out.println(b.toString());
			}
		} else {
			System.out.println("테이블에 데이터가 없습니다.");
		}
	}

	private static void update(Scanner sc, BoardDAO_seq dao) {
		System.out.println("수정할 글 번호를 입력하세요>");
		return inputNumber(sc, 1, num);
		Board board = select(dao, num);
		if (board != null) {
			System.out.println("제목 > ");
			board.setBOARD_SUBJECT(sc.nextLine());

			System.out.println("글 내용 > ");
			board.setBOARD_CONTENT(sc.nextLine());

			System.out.println("비밀번호 > ");
			board.setBOARD_PASS(sc.nextLine());
			board.setBOARD_PASS(sc.nextLine());
			if (!board.equals(sc)) {
				System.out.println("비밀번호가 다릅니다.");
			} else {
				if (dao.boardModify(board) == 1) {
					System.out.println("수정에 성공해였습니다.");
					return dao.boardModify(board);
				} else {
					System.out.println("수정에 실행하였습니다.");
				}
			}
		}

	}

	private static Board select(BoardDAO_seq dao, int num) {
		Board board = dao.getDetail(num);
		if (dao.getDetail(num) != null) {
			System.out.println(board.toString());
		} else {
			System.out.println("해당 값이 존재하지 않습니다.");
		}

	}
}