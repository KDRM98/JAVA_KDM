package basic04.b01;

import java.util.Scanner;

public class _1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; ; i++) {
			char a = sc.next().charAt(0);
			System.out.println(a);
			if(a=='q')
				break;
		}
	}
}
