package DAY01;

public class EX09_Byte {

	public static void main(String[] args) {
		// 1byte = 8bits
		// bit : 0 또는 1로 표현한 자리
		// 0000 0000
		// 0 1								: 2   		(2^1)
		// 00 01 10 11						: 4   		(2^2)
		// 000 001 010 011 100 101 110 111	: 8   		(2^3)
		// 0000 0000						: 8자리 256개	:2^8
		// N bit	: 2^n 개
		
		// byte 는 1byte 범위의 데이터를 표현한다.
		// 8bits : 2^8 : 256개의 데이터 표현가능
		// 양수와 음수로 나누면, -128 ~ 0 ~ +127(-128 ~ 127)
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		// (에러) byte var6 = 200; // 데이터 범위를 벗어남(오버플로우)
		// - 에러메시지 : Type mismatch
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
		
	}
}
