package basic02;

import java.util.Scanner;

public class _1117 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		String result = String.format("%.2f", a*b);
		System.out.println(result);
		sc.close();
	}
}
