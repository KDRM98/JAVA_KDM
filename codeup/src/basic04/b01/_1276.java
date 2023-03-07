package basic04.b01;

import java.util.Scanner;

public class _1276 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = a;
		for (int i = 0; a>1; i++) {
			a--;
			sum = sum*a;
		}
		System.out.println(sum);
	}
}
