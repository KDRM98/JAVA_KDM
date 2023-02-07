package basic02;

import java.util.Scanner;

public class _1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		double c=(double)a/b;
		String result = String.format("%.2f", c);
		System.out.println(result);
	}
}
