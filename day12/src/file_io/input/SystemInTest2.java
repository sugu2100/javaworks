package file_io.input;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("여러 개의 문자를 입력하고 [Enter]를 누르세요.");
		
		int readByte;
		try {
			while((readByte = System.in.read()) != -1) { //-1 읽을 문자가 없으면 
				System.out.print((char)readByte);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
