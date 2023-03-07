package basic04.b01;

import java.util.Scanner;

public class _1278 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		int count = 1;
		while(a/10 != 0) {
			a/=10;
			count++;
		}
		System.out.println(count);
	}
}
