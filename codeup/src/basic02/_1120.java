package basic02;

import java.util.Scanner;

public class _1120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String result = String.format("%.2f", (double)(a+b+c)/3);
		System.out.println(result);
		sc.close();
	}
}
