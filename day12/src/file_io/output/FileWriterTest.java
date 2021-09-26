package file_io.output;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("data.txt")){
			fw.write("Hello~ Java!\n");
			fw.write("�ȳ�~ �ڹ�!\n");
			fw.write(48);  //�ƽ�Ű �ڵ�� ��ȯ�� '0'
			fw.write('\n');
			//fw.write((int) 3.3); ����, �Ǽ��� ����ȵ�
			char[] buf = {'s', 'k', 'y'};
			fw.write(buf);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� �Ϸ�!");
	}

}
