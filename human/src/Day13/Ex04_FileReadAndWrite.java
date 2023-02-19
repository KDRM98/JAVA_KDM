package Day13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04_FileReadAndWrite {

	public static void main(String[] args) {
		// 직접 입력한 문자를 텍스트 파일로 출력하는 프로그램
		// 테스트 : 문자열을 입력하고 마지막에 ctrl + Z 단축키 입력 (EOF)
		// EOF(End Of File) : 파일의 끝을 알려주는 키워드
		InputStreamReader is = new InputStreamReader(System.in);
		
		FileWriter fw = null;
		
		int data = 0;
		
		try {
			fw = new FileWriter("test3.txt");
			
			while( (data = is.read()) !=-1 ) {		// 공백(엔터)이 없다면 ctrl + z시 그 줄을 받지 못한다.
				fw.write(data);
			}
			is.close();
			fw.close();
			
		} catch (IOException e) {
			System.err.println("입출력 시, 예외가 발생하였습니다.");
			e.printStackTrace();
		}
	}
}
