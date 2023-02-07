package basic02;

import java.util.Scanner;

public class _1118 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		String result = String.format("%.1f", a*b/2);
		System.out.println(result);
		sc.close();
	}
}
