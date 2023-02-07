package DAY02;

import java.util.Scanner;

public class EX11_Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학점 : ");
		// sc.next();		--> (String)
		// toUpperCase()	--> 대문자로 변환
		// charAt(0)		--> 문자열에서 해당 index(순서번호)의 문자를 추출
		
		// 입력받은 문자'열'을 대문자로 변환하고, 첫번째(0) 문자를 가져온다.
		// ex) 'abc' 입력시 'ABC'로 변환 후 첫번째 문자인 'A'를 가져온다.
		char grade = sc.next().toUpperCase().charAt(0);
		
		switch (grade) {
			case 'A':
				System.out.println("90~100점 입니다.");
				break;
			case 'B':
				System.out.println("80~90점 입니다.");
				break;
			case 'C':
				System.out.println("70~80점 입니다.");
				break;
			case 'D':
				System.out.println("60~70점 입니다.");
				break;
			case 'F':
				System.out.println("60점 미만입니다.");
				break;
			default:
				System.out.println("A~F 사이의 문자를 입력해주세요.");
				break;
		}
		
		sc.close();
	}
}
