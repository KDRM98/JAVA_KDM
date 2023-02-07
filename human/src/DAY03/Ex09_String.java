package DAY03;

public class Ex09_String {

	public static void main(String[] args) {
		// String 은 참조타입
		
		// String 리터럴
		// JVM에서 스트링 리터럴 테이블에서 관리 (스택영역)
		// 주소 표시(포인터같은 느낌)
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		
		// String 객체
		// heap 영역에 별도로 생성됨.
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println(a == c); 
		System.out.println(a == d);
		System.out.println(a.equals(d));
		
		System.out.println(e == f);			//또 별도의 영역에 생성하기 때문에
		System.out.println(e.equals(f));
		
		
		// ==		: 해당 변수의 레퍼런스(참조정보)를 비교
		// equals()	: 해당 변수의 문자열 자체를 비교
		
		
	}
}
