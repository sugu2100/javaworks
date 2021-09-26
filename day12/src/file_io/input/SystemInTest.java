package file_io.input;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.println("한 문자를 입력하고 [Enter]를 누르세요");
		
		int readByte;  //byte readByte - 1Byte, int - 4Byte
		try {
			readByte = System.in.read();
			System.out.println(readByte);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
