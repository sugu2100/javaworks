package file_io.input;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("���� ���� ���ڸ� �Է��ϰ� [Enter]�� ��������.");
		
		int readByte;
		try {
			while((readByte = System.in.read()) != -1) { //-1 ���� ���ڰ� ������ 
				System.out.print((char)readByte);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
