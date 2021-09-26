package iostream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamTest {

	public static void main(String[] args) {
		//DataStream Ŭ���� - �ڷ����� �״�� ����
		//��� ��Ʈ���� �����ڷ� ����
		try(FileInputStream fis = new FileInputStream("data2.txt");
			DataInputStream dis = new DataInputStream(fis)){
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
