package basic03;

import java.util.Scanner;

public class _1228 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		
		double aver = (height - 100) * 0.9;
		double bmi = (weight - aver)*100/aver;
		
		if(bmi<=10) {
			System.out.println("정상");
		}
		else if(bmi<=20) {
			System.out.println("과체중");
		}
		else
			System.out.println("비만");
		sc.close();
	}
}
