package basic03;

import java.util.Scanner;

public class _1180 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int one, ten;
		one = a%10;
		ten = a/10;
		int b = one*10 + ten;
		b*=2;
		if(b>=100) {
			b%=100;
		}
		System.out.println(b);
		if(b>50) {
			System.out.println("OH MY GOD");
		}
		else
			System.out.println("GOOD");
		sc.close();
	}
}
