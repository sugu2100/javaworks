package file_io.input;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.println("�� ���ڸ� �Է��ϰ� [Enter]�� ��������");
		
		int readByte;  //byte readByte - 1Byte, int - 4Byte
		try {
			readByte = System.in.read();
			System.out.println(readByte);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
