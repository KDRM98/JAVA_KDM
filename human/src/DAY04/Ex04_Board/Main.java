package DAY04.Ex04_Board;

import java.util.Date;
import java.util.Scanner;

/**
 * 게시판 프로그램
 * - 메뉴판
 * - 게시글 목록
 * - 게시글 등록
 * - 게시글 읽기
 * - 게시글 쓰기
 * - 게시글 수정
 * - 게시글 삭제
 * 
 * 
 */
public class Main {

	static int max=10;				// 게시글 최대 10개 제한
	static Board[] boardList = new Board[max];
	static int index = 0;			// 현재 게시글 순서번호(0~max-1)
	
	// 메뉴판
	public static void showMenu() {
		System.out.println("############### 메뉴판 ###############");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 읽기");
		System.out.println("3. 게시글 쓰기");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("############### 번호 입력 : ");
	}
	
	// 게시글 목록
	public static void list() {
		System.out.println("# 게시글 목록");
		for (Board board : boardList) {
			if(board == null) {
				System.out.println("(게시글 없음)");
			}
			else
				System.out.println(board);
		}
	}
	
	// 게시글 읽기
	public static void read(int boardNo) {
		System.out.println("# 게시글 읽기");
		Board board = boardList[boardNo-1];
		System.out.println(board);
	}
	
	// 게시글 쓰기
	public static void write(Board board) {
		if(index < max) {
			boardList[index] = board;
			index++;
			board.setBoardNo(index);
			System.out.println("# 게시글이 작성되었습니다.");
		}
		else {
			System.out.println("# 게시글 목록이 꽉 찼습니다.");
		}
	}
	
	// 게시글 수정
	public static void update(Board board) {
		int boardNo = board.getBoardNo();
		
		// 게시글이 작성되지 않았다면,
		
		if(boardNo >= 1 && boardNo <= max && boardList[boardNo-1] != null) {
			board.setUpdDate(new Date());
			boardList[boardNo-1] = board;
			System.out.println("# 게시글이 수정되었습니다.");
		}
		else {
			System.out.println("# 게시글이 존재하지 않습니다.");
		}
	}
	
	// 게시글 삭제
	public static void delete(int boardNo) {
		if(boardNo >= 1 && boardNo <= max) {
			// null : 값이 없음
			boardList[boardNo-1] = null;
			System.out.println("# 게시글이 삭제되었습니다.");
		}
		else {
			System.out.println("# 게시글이 존재하지 않습니다.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		int count = 0;
		
		do {
			showMenu(); // 메뉴판 호출

			// 메뉴번호 입력
			menuNo = sc.nextInt(); // 1(엔터)
			sc.nextLine(); // 엔터를 버퍼에서 빼준다.

			int boardNo = 0;
			String title = "";
			String content = "";
			String writer = "";
			Board board = null;

			switch (menuNo) {
			// 게시글 목록
			case 1:
				list();
				System.out.println("총 게시글 개수 : " + count);
				break;
			// 게시글 읽기
			case 2:
				System.out.print("게시글 번호 : ");
				boardNo = sc.nextInt();
				sc.nextLine();
				read(boardNo);
				break;
			// 게시글 쓰기
			case 3:
				System.out.print("제목 : ");
				title = sc.nextLine();
				System.out.print("작성자 : ");
				writer = sc.nextLine();
				System.out.print("내용 : ");
				content = sc.nextLine();
				board = new Board(title, content, writer);
				write(board);
				count = index;
				break;
			// 게시글 수정
			case 4:
				System.out.print("게시글 번호 : ");
				boardNo = sc.nextInt();
				sc.nextLine();
				System.out.print("제목 : ");
				title = sc.nextLine();
				System.out.print("작성자 : ");
				writer = sc.nextLine();
				System.out.print("내용 : ");
				content = sc.nextLine();
				board = boardList[boardNo-1]; // 위에서 받은 내용들이 들어가는게 없는거같습니다.
				board.setTitle(title);
				board.setContent(content);
				board.setWriter(writer);
				update(board);				  // update로 가도 날짜갱신만 있고 받은 내용 넣기가 없음
				break;
			// 게시글 삭제
			case 5:
				System.out.print("게시글 번호 : ");
				boardNo = sc.nextInt();
				sc.nextLine();
				delete(boardNo);
				count = index;
				break;
			default:
				break;
			}
		}while(menuNo != 0);
		
		sc.close();
	}
}
