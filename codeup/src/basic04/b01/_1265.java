package basic04.b01;

import java.util.Scanner;

public class _1265 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(a + "*" + i + "=" + a*i);
		}
	}
}
