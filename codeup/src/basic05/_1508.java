package basic05;

import java.util.Scanner;

public class _1508 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [][] a = new int [N][N];
		for (int i = 0; i < N; i++) {
			a[i] = new int[i+1];
		}
		for (int i = 0; i < N; i++) {
			a[i][0] = sc.nextInt();
		}
		for (int i = 1; i < N; i++) {
			for (int j = 1; j <= i; j++) {
				a[i][j] = a[i][j-1]-a[i-1][j-1];
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
