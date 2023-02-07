package basic03;

import java.util.Scanner;

public class _1226 {

	public static void main(String[] args) {
		int arr1[], arr2[];
		arr1 = new int[7];
		arr2 = new int[6];
		int cnt=0;
		int bon=0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					cnt++;
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[6]==arr2[i]) {
				bon++;
			}
		}
		switch (cnt) {
		case 1:
			System.out.println("0");
			break;
		case 2:
			System.out.println("0");
			break;
		case 3:
			System.out.println("5");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			if(bon==1) {
				System.out.println("2");
			}
			else
				System.out.println("3");
			break;
		case 6:
			System.out.println("1");
			break;

		default:
			break;
		}
		sc.close();
	}
}
