package basic04.b01;

import java.util.Scanner;

public class _1261 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int stp = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i : arr) {
			if(i%5==0) {
				System.out.println(i);
				stp++;
				break;
			}
		}
		if(stp == 0) {
			System.out.println("0");
		}
	}
}
