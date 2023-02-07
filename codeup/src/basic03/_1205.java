package basic03;

import java.util.Scanner;

public class _1205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double max = a + b;
		
		if (max < a-b) {
			max = a-b;
		}
		
		if (max < b-a) {
			max = b-a;
		}
		
		if (max < a*b) {
			max = a*b;
		}
		
		if (max < a/b) {
			max = a/b;
		}
		if (max < b/a) {
			max = b/a;
		}
		double j = Math.pow(a, b);
		
		
		if (max < j) {
			max = j;
		}
		
		j = Math.pow(b, a);
		
		
		if (max < j) {
			max = j;
		}
		
		String resultS = String.format("%6f", max);
		
		System.out.println(resultS);
		sc.close();
		
	}
}
