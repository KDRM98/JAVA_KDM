package basic04.b01;

import java.util.Scanner;

public class _1076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		int a = (int)t.charAt(0);
		for (int i = 97; i <= a; i++) {
			System.out.print((char)i + " ");
		}
	}
}
