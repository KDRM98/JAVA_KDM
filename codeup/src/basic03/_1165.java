package basic03;

import java.util.Scanner;

public class _1165 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		while(a<90) {
			++count;
			a+=5;
		}
		count+=b;
		System.out.println(count);
	}
}
