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
			start = System.currentTimeMillis();  //시작시간
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			end = System.currentTimeMillis();  //종료 시간
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사 소요 시간 : " + (end-start) + "milliseconds");
	}
}
