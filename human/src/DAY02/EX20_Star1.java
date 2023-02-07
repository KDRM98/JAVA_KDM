package DAY02;

import java.util.Scanner;

public class EX20_Star1 {

	public static void main(String[] args) {
		
		//자연수 n을 입력받아 삼각형 모양의 "*"을 출력하시오.
		// 입력 : 5
		// 출력 :
		// *
		// **
		// ***
		// ****
		// *****
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//마름모
		
		System.out.println();
		
		for (int i = 1; i <= N; i++) {
			for (int j = N-i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= N-1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = (2*N)- (i * 2 + 1); j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		//모래시계
		
		sc.close();
	}
}
