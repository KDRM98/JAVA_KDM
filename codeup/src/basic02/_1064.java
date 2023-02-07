package basic02;

import java.util.Scanner;

public class _1064 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min = a;
		if(a<b)
			min = a;
		else
			min = b;
		if(min>c)
			min=c;
		System.out.println(min);
		sc.close();
	}
}
