package basic03;

import java.util.Scanner;

public class _1163 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int sum=(a+b+c)/100;
		if(sum%2==0)
			System.out.println("대박");
		else
			System.out.println("그럭저럭");
	}
}
