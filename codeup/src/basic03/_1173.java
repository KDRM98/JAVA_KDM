package basic03;

import java.util.Scanner;

public class _1173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		b-=30;
		if(b<0) {
			a--;
			b+=60;
		}
		if(a<0) {
			a+=24;
		}
		System.out.println(a + " " + b);
		sc.close();
	}
}