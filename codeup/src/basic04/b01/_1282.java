package basic04.b01;

import java.util.Scanner;

public class _1282 {

	public static boolean isInteger(double num) {
		return num%1 ==0.0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;
		int s = 0;
		for (int i = n; i > 0; i--) {
			double result = Math.sqrt(i);
			if(isInteger(result)==true) {
				s=(int)result;
				break;
			}
			k++;
		}
		System.out.println(k + " " + s);

	}
}
