package basic04.b01;

import java.util.Scanner;

public class _1281 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if(i%2==0) {
				System.out.print("-"+i);
				sum=sum-i;
			}
			else {
				if(i==a) {
					System.out.print(i);
				}
				else
					System.out.print("+"+i);
				sum+=i;
			}
		}
		System.out.print("="+sum);
	}
}
