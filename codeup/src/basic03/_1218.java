package basic03;

import java.util.Scanner;

public class _1218 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp;
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		
		if(arr[0] == arr[1] && arr[1] == arr[2]) {
			System.out.println("정삼각형");
		}
		else if(arr[0] == arr[1] && arr[2]<arr[1]+arr[0]) {
			System.out.println("이등변삼각형");
		}
		else if(arr[1]==arr[2] && arr[2]<arr[1]+arr[0]) {
			System.out.println("이등변삼각형");
		}
		else if(arr[0]*arr[0] + arr[1]*arr[1] == arr[2]*arr[2]) {
			System.out.println("직각삼각형");
		}
		else if(arr[2]<arr[1]+arr[0]) {
			System.out.println("삼각형");
		}
		else if(arr[2]>=arr[1]+arr[0])
			System.out.println("삼각형아님");
	}
}
