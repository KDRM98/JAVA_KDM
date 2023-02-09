package basic03;

import java.util.Scanner;

public class _1170 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		if(c<10) {
			System.out.print(a);
			System.out.print(b);
			System.out.print("0");
			System.out.print(c);
		}
		else {
			System.out.print(a);
			System.out.print(b);
			System.out.print(c);
		}
		sc.close();
	}
}
