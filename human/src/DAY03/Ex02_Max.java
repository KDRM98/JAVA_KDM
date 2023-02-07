package DAY03;

import java.util.Scanner;

public class Ex02_Max {

	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N을 입력받고,
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수중, 최댓값을 구하여 출력하시오
		int Max;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 갯수 : ");
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		
		System.out.print(N + "개의 정수를 공백을 두고 입력하세요. : ");
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Max = arr[0];
		for (int i = 1; i < N; i++) {
			if(Max < arr[i]) {
				Max = arr[i];
			}
		}
		
		System.out.println("입력받은 정수 중 최댓값은 " + Max + "입니다.");
		
		sc.close();
	}
}
