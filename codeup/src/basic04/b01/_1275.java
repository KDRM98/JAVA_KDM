package basic04.b01;

import java.util.Scanner;

public class _1275 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a = n;
		for (int i = 1; i < k; i++) {
			a = a * n;
		}
		if(k == 0) {
			System.out.println("1");
		}
		else
			System.out.println(a);
	}
}
