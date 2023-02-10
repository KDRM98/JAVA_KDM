package basic03;

import java.util.Scanner;

public class _1204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.print(a);
		if(a%10 ==1&&a/10!=1) {
			System.out.print("st");
		}
		else if(a%10 ==2&&a/10!=1) {
			System.out.print("nd");
		}
		else if(a%10 ==3&&a/10!=1) {
			System.out.print("rd");
		}
		else
			System.out.print("th");
		
	}
}
