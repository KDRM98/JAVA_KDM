package basic04.b01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _1255 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		for (double i = a; i <= b ; i+=0.01) {
			double result = Math.round(i*100)/100.0;
			System.out.printf("%.2f", i);
			System.out.print(" ");
		}
	}
}
