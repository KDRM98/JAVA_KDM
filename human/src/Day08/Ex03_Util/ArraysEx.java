package Day08.Ex03_Util;

import java.util.Arrays;

public class ArraysEx {

	
	public static void main(String[] args) {
		int[] arr = {5,3,4,1,2};
		
		// 배열을 정렬(sort) - 오름차순
		// 5 3 4 1 2 -> 1 2 3 4 5
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();

		// 100개의 랜덤수를 배열요소로 갖는 배열
		int[] random = new int[100];
		
		for (int i = 0; i < random.length; i++) {
			random[i]= (int)(Math.random() * 100 +1);
		}
		
		Arrays.sort(random);
		
		for (int i = 0; i < random.length; i++) {
			System.out.print(random[i] + " ");
		}
		System.out.println();
		
		// 이진 검색(탐색) 알고리즘을 사용하여 검색한 후,
		// 해당 갑이 있으면, 그 위치(index)를 반환
		// 찾기 못했으면, (-(insertion point)-1) 음수를 반환
		if(Arrays.binarySearch(random, 10)<0) {
			System.out.println("랜덤 수 10이 없습니다.");
		}
		else
			System.out.println("index : " +Arrays.binarySearch(random, 10));
		
		int fill[] = new int[10];
		
		Arrays.fill(fill, 6);
		for (int i = 0; i < fill.length; i++) {
			System.out.print(fill[i] + " ");
		}
		System.out.println();
		
		// Arrays.copyOfRange(배열, 시작index , 끝index_1)
		int copyRange[]= Arrays.copyOfRange(arr, 2, 4);
		// 1 2 3 4 5
		// 3 4를 복사해옴
		
		for (int i = 0; i < copyRange.length; i++) {
			System.out.print(copyRange[i] + " ");
		}
		System.out.println();
		
	}
}
