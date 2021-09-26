package iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;
		String originFile = "C:/javaDev/day12/friends.png";
		String copyFile = "C:/ncsTest/friends3.png";
		
		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			start = System.currentTimeMillis();  //���۽ð�
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			end = System.currentTimeMillis();  //���� �ð�
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� ���� �ҿ� �ð� : " + (end-start) + "milliseconds");
	}
}
