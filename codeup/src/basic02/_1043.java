package basic02;

import java.util.Scanner;

public class _1043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		float result = a%b;
		System.out.println((int)result);
		sc.close();
	}
}