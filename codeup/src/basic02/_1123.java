package basic02;

import java.util.Scanner;

public class _1123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String result = String.format("%.3f", 9.0/5*a + 32);
		System.out.println(result);
		sc.close();
	}
}
