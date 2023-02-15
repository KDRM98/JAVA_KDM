package basic04.b01;

import java.util.Scanner;

public class _1089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		int t = sc.nextInt();
		int sum = a;
		int count = 0;
		
		for (int i = a; ; i+=n) {
			sum=i;
			count++;
			if(count==t) {
				break;
			}
		}
		System.out.println(sum);
		
	}
}
