package basic03;

import java.util.Scanner;

public class _1172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [3];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp;
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		sc.close();
	}
}
