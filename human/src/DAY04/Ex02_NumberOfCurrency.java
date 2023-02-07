package DAY04;

import java.util.Scanner;

/**
 * 화폐 매수 구하기 금액 : 534760 50000 : 10개 
 * 10000 : 3개
 * 5000 : 0개
 * 1000 : 4개
 * 500 : 1개
 * 100 : 2개 
 * 50 : 1개 
 * 10 : 1개 
 * 5 : 0개 
 * 1 : 0개
 * 
 * @author User
 *
 */
public class Ex02_NumberOfCurrency {

	public static void main(String[] args) {
		int a;
		int b = 50000;
		int sw = 1;
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		while (b >= 1) {
			a = money / b;
			System.out.println(b + "원권 " + a + "장");
			money %= b;
			if (sw == 1) {
				b /= 5;
			} else {
				b /= 2;
			}
			// sw = true 로 하고 변환을 sw = !sw로 해줄수 있다.

			sw *= -1;
		}
		sc.close();
	}
}
