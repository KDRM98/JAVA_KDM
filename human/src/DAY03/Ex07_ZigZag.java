package DAY03;

import java.util.Scanner;

public class Ex07_ZigZag {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. N을 입력받는다.
		System.out.print("입력 : ");

		// 2. NXN 구조로 배열을 생성한다.

		int N = sc.nextInt();
		int arr[][] = new int[N][N];

		int k = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = k++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		k = 1;
		int sw = 1;
		for (int i = 0; i < N; i++) {

			if (sw == 1) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = k++;
				}
			}

			if (sw == -1) {
				for (int j = N - 1; j >= 0; j--) {
					arr[i][j] = k++;
				}
			}
			sw *= -1;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
