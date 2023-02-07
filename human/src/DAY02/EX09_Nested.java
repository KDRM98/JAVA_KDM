package DAY02;

import java.util.Scanner;

public class EX09_Nested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정보처리기사 자격증 합격 기준
		// 4학년, 70점 이상 - 합격
		int year, score;
		do{
			System.out.print("학년(1~4) : ");
			year = sc.nextInt();
			System.out.println("올바른 학년을 입력해주세요.");
		}while(year >4 || year <1);
		
		// 중첩 if 문은 구너장하지 않는다.
		if (year != 4) {
			System.out.println("응시 자격요건에 해당되지 않습니다.");
		}
		else {
			System.out.print("점수 입력 : ");
			score = sc.nextInt();
			if(score >= 70) {
				System.out.println("합격!");
			}
			else {
				System.out.println("불합격!");
			}
		}
		// 중첩하지 않고 조건을 줄 수 있다.
		/*
		 * if (year == 4 && score >= 70){
		 * 		System.out.println("합격!");
		 * }
		 * 
		 */
		
		sc.close();
	}
}
