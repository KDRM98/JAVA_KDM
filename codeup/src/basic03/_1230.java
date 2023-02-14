package basic03;

import java.util.Scanner;

public class _1230 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int hit = 0;
		int hit1 = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=170) {
				hit++;
				hit1 = i;
				break;
			}
		}
		if(hit!=0) {
			System.out.println("CRASH " + arr[hit1]);
		}
		else
			System.out.println("PASS");
	}
}
