package file_io.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest1 {

	public static void main(String[] args) {
		//���� �б�
		try(InputStream fis = new FileInputStream("output3.txt")){
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
