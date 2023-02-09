package basic03;

import java.util.Scanner;

public class _1169 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int age;
		int j;
		if(a<=13) {
			age=13-a;
			j=3;
		}
		else {
			age=113-a;
			j=1;
		}
		System.out.println(age + " " + j);
		
	}
}
