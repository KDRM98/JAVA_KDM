package DAY02;

import java.util.Scanner;

public class EX18_Gugu {
	
	public static void main(String[] args) {
		//구구단 (1~9단)
		// 원하는 단을 입력받아 아래와 같이 구구단 수식을 출력하시오.
		// 입력 : 3
		// 출력
		// 3*1 =3
		// 3*2 =6
		// 3*3 =9
		// 3*4 =12
		// 3*5 =15
		// 3*6 =18
		// 3*7 =21
		// 3*8 =24
		// 3*9 =27
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(input + "*" + i + "=" + input*i);
		}
		
		sc.close();
	}
}
