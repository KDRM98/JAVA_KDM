package basic04.b01;

import java.util.Scanner;

public class _1268 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int[] arr = new int[a];
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i : arr) {
				if(i%2==1) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
