package basic02;

import java.util.Scanner;

public class _1029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		String result = String.format("%.11f", a);
		System.out.println(result);
		sc.close();
	}
}
