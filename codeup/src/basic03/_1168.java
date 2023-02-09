package basic03;

import java.util.Scanner;

public class _1168 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int age;
		if(b==1||b==2) {
			age=100-(a/10000)+13;
		}
		else {
			age=13-(a/10000);
		}
		System.out.println(age);
	}
}
