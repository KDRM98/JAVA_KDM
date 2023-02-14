package basic04.b01;

import java.util.Scanner;

public class _1073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; ; i++) {
			int a = sc.nextInt();
			if(a==0) {
				break;
			}
			else {
				System.out.println(a);
			}
		}
	}
}
