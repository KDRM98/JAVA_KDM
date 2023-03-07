package basic04.b01;

import java.util.Scanner;

public class _1272 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int h = sc.nextInt();
		int sum = 0;
		if(k%2==0) {
			sum = sum + k*5;
		}
		else
			sum= sum + k/2 +1;
		if(h%2==0) {
			sum = sum + h*5;
		}
		else
			sum= sum + h/2 +1;
		System.out.println(sum);
	}
}
