package DAY02;

public class EX14_WhileSum {
	// 1부터 100까지의 합계를 구하시오.
	// 1+2+3+4+5 ......100 = 5050
	public static void main(String[] args) {
		
		int sum = 0;
		int a=1;
		
		while( a <= 100 ) {
			// 복합 대입 연산자
			sum += a++;
		}
		System.out.println("합계 : " + sum);
	}
}
