package basic03;

import java.util.Scanner;

public class _1201 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("양수");
		}
		else if(a<0) {
			System.out.println("음수");
		}
		else
			System.out.println("0");
		sc.close();
	}
}
