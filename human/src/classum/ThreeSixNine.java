package classum;

public class ThreeSixNine {

	// 3,6,9 과제
	public static void main(String[] args) {
		int one,ten=0;
		boolean one369 = false;
		boolean ten369 = false;
		for (int i = 1; i < 101; i++) {
			one369 = false;
			ten369 = false;
			one=i%10;
			ten=i/10;
			if(one!=0 && one%3==0) {
				System.out.print("*");
				one369 = true;
			}
			if(ten!=0 && ten%3==0) {
				System.out.print("*");
				ten369 = true;
			}
			if(one369 != true && ten369!=true ) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
