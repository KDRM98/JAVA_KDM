package basic04.b01;

import java.util.Scanner;

public class _1090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		int t = sc.nextInt();
		long sum = a;
		int count = 0;
		
		for (int i = 1; i < t ; i++) {
			sum= sum * n;
		}
		System.out.println(sum);
		
	}
}
