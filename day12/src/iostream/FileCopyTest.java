package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;
		String originFile = "C:/javaDev/day12/friends.png";
		String copyFile = "C:/ncsTest/friends2.png";
		
		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile)){
			start = System.currentTimeMillis();  //���۽ð�
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			end = System.currentTimeMillis();  //���� �ð�
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� ���� �ҿ� �ð� : " + (end-start) + "milliseconds");
	}
}
