package basic03;

import java.util.Scanner;

public class _1167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			for (int j2 = 0; j2 < arr.length; j2++) {
				if(arr[j]<arr[j2]) {
					int temp = arr[j];
					arr[j] = arr[j2];
					arr[j2] = temp;
				}
			}
		}
		System.out.println(arr[1]);
	}
}
