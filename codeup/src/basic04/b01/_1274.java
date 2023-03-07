package basic04.b01;

import java.util.Scanner;

public class _1274 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 2; i < a; i++) {
			if(a%i==0) {
				System.out.println("not prime");
				return;
			}
		}
		System.out.println("prime");
	}
}
