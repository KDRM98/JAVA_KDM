package basic04.b01;

import java.util.Scanner;

public class _1286 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if(max<a[i])
				max=a[i];
			if(min>a[i])
				min=a[i];
		}
		System.out.println(max);
		System.out.println(min);
	}
}
