package basic02;

import java.util.Scanner;

public class _1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double m = ((double)a + b + c)/3;
		String result = String.format("%.1f", m);
		System.out.println(a+b+c);
		System.out.println(result);
		sc.close();
	}
}
