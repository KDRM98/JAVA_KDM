package basic03;

import java.util.Scanner;

public class _1166 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%400==0) {
			System.out.println("Leap");
		}
		else if(a%100 != 0 && a%4==0)
			System.out.println("Leap");
		else
			System.out.println("Normal");
	}
}
