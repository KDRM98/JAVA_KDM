package basic04;

import java.util.Scanner;

public class _1355 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = N; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
