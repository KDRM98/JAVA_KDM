package basic04.b01;

import java.util.Scanner;

public class _1270 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			if(i%10==1) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
