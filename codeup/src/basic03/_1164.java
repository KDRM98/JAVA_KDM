package basic03;

import java.util.Scanner;

public class _1164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a>170)&&(b>170)&&(c>170)) {
			System.out.println("PASS");
		}
		else
			System.out.println("CRASH");
	}
}
