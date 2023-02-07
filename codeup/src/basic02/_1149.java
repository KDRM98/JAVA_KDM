package basic02;

import java.util.Scanner;

public class _1149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max = a;
		
		if(a<b) {
			max = b;
		}
		
		System.out.println(max);
		
		sc.close();
	}
}
