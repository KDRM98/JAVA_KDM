package basic03;

import java.util.Scanner;

public class _1222 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int t = 90-a;
		int count=0;
		for (int i = 0; i < t; i+=5) {
			++count;
		}
		if(b+count>c) {
			System.out.println("win");
		}
		else if(b+count<c) {
			System.out.println("lose");
		}
		else if(b+count == c) {
			System.out.println("same");
		}
	}
}
