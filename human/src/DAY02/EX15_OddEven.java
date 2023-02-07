package DAY02;

public class EX15_OddEven {
	// 1~20까지의 정수 중,
	// 홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오.
	
	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		int a=1;
		
		while(a <= 20) {
			if(a%2 == 1) {
				sum1 += a++;
			}
			else {
				sum2 += a++;
			}
		}
		
		System.out.println("홀수의 합계는 " + sum1 + "입니다.");
		System.out.println("짝수의 합계는 " + sum2 + "입니다.");
		
	}

}
