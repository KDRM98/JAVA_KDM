package basic02;

import java.util.Scanner;

public class _1053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a==0)
			a=1;
		else
			a=0;
		System.out.println(a);
		sc.close();
	}
}
