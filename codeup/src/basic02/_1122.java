package basic02;

import java.util.Scanner;

public class _1122 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int min = a/60;
		int sec = a%60;
		System.out.println(min + " " + sec);
	}
}
