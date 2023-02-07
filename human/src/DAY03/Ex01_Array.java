package DAY03;

public class Ex01_Array {

	public static void main(String[] args) {
		// 배열 선언
		int arr[];
		// 배열 생성
		arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int N = arr.length;
		System.out.println("배열의 길이 : " + N);
		
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
