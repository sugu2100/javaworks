package file_io.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest2 {

	public static void main(String[] args) {
		OutputStream fos = null;
		try {
			fos = new FileOutputStream("output2.txt");
			byte[] bs = new byte[26];
			byte ch = 'A';
			for(int i = 0; i < bs.length; i++) {
				bs[i] = ch;
				ch++;
			}
			fos.write(bs);  //bs에 기억된 알파벳 대문자 쓰기
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
