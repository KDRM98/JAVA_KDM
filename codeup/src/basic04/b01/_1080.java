package basic04.b01;

import java.util.Scanner;

public class _1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		int l = 0;
		for (int i = 1; sum < a; i++) {
			sum += i;
			if(sum >= a)
				l=i;
		}
		System.out.println(l);
		
	}
}
