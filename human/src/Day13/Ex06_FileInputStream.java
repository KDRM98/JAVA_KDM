package Day13;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex06_FileInputStream {

	public static void main(String[] args) {
		byte[] data = new byte[100];		// 10 바이트씩
		
		try {
			FileInputStream fin = new FileInputStream("test.out");
			
			int i = 0, b;
			while((b=fin.read()) != -1) {
				data[i] = (byte) b;
				i++;
			}
			
			for (byte a : data) {
				System.out.print((char)a);
			}
			System.out.println();
			
			fin.close();
		} catch (IOException e) {
			System.err.println("입출력 시, 예외가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	
}
