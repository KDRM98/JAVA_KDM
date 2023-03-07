package basic04.b01;

import java.util.Scanner;

public class _1277 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(arr[0] + " " + arr[a/2] + " " + arr[a-1]);
	}
}
