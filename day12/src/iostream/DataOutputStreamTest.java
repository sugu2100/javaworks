package iostream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		//DataStream Ŭ���� - �ڷ����� �״�� ����
		//��� ��Ʈ���� �����ڷ� ����
		try(FileOutputStream fos = new FileOutputStream("data2.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeByte('A');  //���� �ѱ���
			dos.writeChar('��');  //�ѱ� �ѱ���
			dos.writeInt(48);    //����
			dos.writeFloat(2.54F); //�Ǽ�
			dos.writeUTF("�����մϴ�");  //���ڿ�
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� �Ϸ�!");
	}

}
