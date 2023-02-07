package basic02;

import java.util.Scanner;

public class _1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = a.length();
		for (int i = 0; i < b; i++) {
			System.out.println("\'" + a.charAt(i) + "\'");
		}
		sc.close();
	}
}
