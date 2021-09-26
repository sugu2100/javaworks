package file_io.output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest3 {

	public static void main(String[] args) {
		//try~ with ~resource���� - close() ������� ����
		try(OutputStream fos = new FileOutputStream("output3.txt")){
			byte[] bs = new byte[26];
			byte ch = 'a';
			for(int i = 0; i < bs.length; i++) {
				bs[i] = ch;
				ch++;
			}
			fos.write(bs);  //bs�� ���� ���ĺ� �빮�� ����
			fos.write('\n');
			fos.write(bs, 3, 10);  //bs���� 3�� �ε������� 10�� �߰�
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� �Ϸ�!!");
	}//main()

}
